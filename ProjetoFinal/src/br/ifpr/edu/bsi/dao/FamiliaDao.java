/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

import br.ifpr.edu.bsi.bean.Familia;
import br.ifpr.edu.bsi.bean.Ordem;
import br.ifpr.edu.bsi.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FamiliaDao {
    public static void inserir(Familia familia) throws SQLException {//trocar o parametro
       //captura a conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_familia (nome_familia, comprimento_familia, alimentacao_familia, id_ordem)"
                + "values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, familia.getNomeFamilia());
        stmt.setString(2, familia.getComprimentoFamilia());
        stmt.setString(3, familia.getAlimentaçãoFamilia());
        stmt.setInt(4, familia.getOrdemFamilia().getIdOrdem());
        stmt.execute();
        stmt.close();
        con.close();
    }
    public static void excluir(Familia familia) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from tb_familia where id_familia=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, familia.getIdFamilia());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
    }
    
    public static void alterar(Familia familia) throws SQLException {//problema esta aqui
        Connection con = Conexao.getConexao();
        String sql = "update tb_familia set nome_familia = ?, comprimento_familia = ?, alimentacao_familia = ?, id_ordem=? where id_familia=?";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, familia.getNomeFamilia());
        stmt.setString(2, familia.getComprimentoFamilia());
        stmt.setString(3, familia.getAlimentaçãoFamilia());
        stmt.setInt(4, familia.getOrdemFamilia().getIdOrdem());
        stmt.setInt(5, familia.getIdFamilia());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();

    }
    
    public static List<Familia> listar() throws SQLException {
        List<Familia> listaFamilia = new ArrayList<Familia>();
        Connection con = Conexao.getConexao();
        String sql = "select * from tb_familia order by nome_familia";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Familia familia= new Familia();
            familia.setIdFamilia(rs.getInt("id_familia"));
            familia.setNomeFamilia(rs.getString("nome_familia"));
            familia.setComprimentoFamilia(rs.getString("comprimento_familia"));
            familia.setAlimentaçãoFamilia(rs.getString("alimentacao_familia"));
            Ordem ordem = new Ordem();
            ordem.setIdOrdem(rs.getInt("id_ordem"));
            familia.setOrdemFamilia(ordem);
            listaFamilia.add(familia);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaFamilia;

    }
    
     public static List<Familia> pesquisar(Familia familiaPesq) throws SQLException {
        List<Familia> listaFamilia = new ArrayList<Familia>();
        Connection con = Conexao.getConexao();
        String sql = "SELECT \n"
                + "	fam.*,\n"
                + "	ord.nome_ordem\n"
                + "FROM \n"
                + "	tb_familia fam,\n"
                + "	tb_ordem ord\n"
                + "WHERE\n"
                + "	ord.id_ordem = fam.id_ordem AND\n"
                + "	fam.nome_familia like '"+familiaPesq.getNomeFamilia()+"%' "
                + "ORDER BY ord.nome_ordem";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            
            Ordem ordem = new Ordem();
            ordem.setNomeOrdem(rs.getString("nome_ordem"));
            
            Familia familia = new Familia();
            familia.setIdFamilia(rs.getInt("id_familia"));
            familia.setNomeFamilia(rs.getString("nome_familia"));
            familia.setComprimentoFamilia(rs.getString("comprimento_familia"));
            familia.setAlimentaçãoFamilia(rs.getString("alimentacao_familia"));    
            familia.setOrdemFamilia(ordem);
            listaFamilia.add(familia);
        }
        stmt.close();
        rs.close();
        con.close();
        return listaFamilia;
     }
     
     public static ResultSet retornaRsFamilia (Familia familia) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "select * from tb_familia as fam inner join tb_ordem as ord on ord.id_ordem = fam. id_ordem"
                + " where nome_familia like '" + familia.getNomeFamilia()+ "%' order by ord.nome_ordem";
         
        //select * from tb_familia as fam inner join tb_ordem as ord on ord.id_ordem = fam.id_ordem;
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
     
    public static ResultSet retornaRsGeral (Familia familia) throws SQLException{
        Connection con = Conexao.getConexao();
        //criei uma view no my sql com relações entre todas as tabelas
        String sql = "select * from RelatorioGeral where nome_familia like'" + familia.getNomeFamilia()+ "%' order by nome_familia";
        
        //select * from tb_familia as fam inner join tb_ordem as ord on ord.id_ordem = fam.id_ordem;
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
}
