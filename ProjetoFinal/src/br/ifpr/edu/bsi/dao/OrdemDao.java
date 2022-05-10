/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

import br.ifpr.edu.bsi.bean.Classe;
//import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Ordem;
//import br.ifpr.edu.bsi.bean.Reino;
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
public class OrdemDao {
     public static void inserir(Ordem ordem) throws SQLException {//trocar o parametro
       //captura a conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_ordem (nome_ordem, id_classe)"
                + "values (?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, ordem.getNomeOrdem());
        stmt.setInt(2, ordem.getClasseOrdem().getIdClasse());
        stmt.execute();
        stmt.close();
        con.close();
    }
    public static void excluir(Ordem ordem) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from tb_ordem where id_ordem=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ordem.getIdOrdem());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
    }
    
    public static void alterar(Ordem ordem) throws SQLException {//problema esta aqui
        Connection con = Conexao.getConexao();
        String sql = "update tb_ordem set nome_ordem =?, id_classe =? where id_ordem= ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, ordem.getNomeOrdem());
        stmt.setInt(2, ordem.getClasseOrdem().getIdClasse());
        stmt.setInt(3, ordem.getIdOrdem());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();

    }
    
    public static List<Ordem> listar() throws SQLException {
        List<Ordem> listaOrdem = new ArrayList<Ordem>();
        Connection con = Conexao.getConexao();
        String sql = "select * from tb_ordem order by nome_ordem";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Ordem ordem= new Ordem();
            ordem.setIdOrdem(rs.getInt("id_ordem"));
            ordem.setNomeOrdem(rs.getString("nome_ordem"));
            Classe classe = new Classe();
            classe.setIdClasse(rs.getInt("id_classe"));
            ordem.setClasseOrdem(classe);
            listaOrdem.add(ordem);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaOrdem;

    }
    
     public static List<Ordem> pesquisar(Ordem ordemPesq) throws SQLException {
        //criação da lista de estados
        List<Ordem> listaOrdem = new ArrayList<Ordem>();
        Connection con = Conexao.getConexao();
        String sql = "SELECT \n"
                + "	ord.*,\n"
                + "	clas.nome_classe\n"
                + "FROM \n"
                + "	tb_ordem ord,\n"
                + "	tb_classe clas\n"
                + "WHERE\n"
                + "	clas.id_classe = ord.id_classe AND\n"
                + "	ord.nome_ordem like '"+ordemPesq.getNomeOrdem()+"%' "
                + "ORDER BY ord.nome_ordem";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            
           Classe classe = new Classe();
           
            classe.setNomeClasse(rs.getString("nome_classe"));
            
            Ordem ordem = new Ordem();
            ordem.setIdOrdem(rs.getInt("id_ordem"));
            ordem.setNomeOrdem(rs.getString("nome_ordem"));          
           
           ordem.setClasseOrdem(classe);
            
           listaOrdem.add(ordem);
        }
        stmt.close();
        rs.close();
        con.close();
        return listaOrdem;

    }
     
    public static ResultSet retornaRsOrdem (Ordem ordem) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "select * from tb_ordem as ord inner join tb_classe as clas on clas.id_classe = ord.id_classe"
                + " where nome_ordem like '" + ordem.getNomeOrdem()+ "%' order by nome_ordem";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
    
}
