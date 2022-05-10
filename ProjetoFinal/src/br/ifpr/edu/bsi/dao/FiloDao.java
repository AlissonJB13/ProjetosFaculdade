/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Reino;
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
public class FiloDao {
    public static void inserir(Filo filo) throws SQLException {//trocar o parametro
       //captura a conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_filo (nome_filo, id_reino) "
                + "values (?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, filo.getNomeFilo());
        stmt.setInt(2, filo.getReinoFilo().getIdReino());
        stmt.execute();
        stmt.close();
        con.close();
    }
    public static void excluir(Filo filo) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from tb_filo where id_filo=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, filo.getIdFilo());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
    }
    
    public static void alterar(Filo filo) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "update tb_filo set nome_filo =?, id_reino =? where id_filo =?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, filo.getNomeFilo());
        stmt.setInt(2, filo.getReinoFilo().getIdReino());
        stmt.setInt(3, filo.getIdFilo());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();

    }
    
    
    
    public static List<Filo> listar() throws SQLException {
        List<Filo> listaFilo = new ArrayList<Filo>();
        Connection con = Conexao.getConexao();
        String sql = "select * from tb_filo order by nome_filo";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Filo filo= new Filo();
            filo.setIdFilo(rs.getInt("id_filo"));
            filo.setNomeFilo(rs.getString("nome_filo"));
            Reino reino = new Reino();
            reino.setIdReino(rs.getInt("id_reino"));
            filo.setReinoFilo(reino);
            listaFilo.add(filo);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaFilo;

    }
    
     public static List<Filo> pesquisar(Filo filoPesq) throws SQLException {
        List<Filo> listaFilo = new ArrayList<Filo>();
        Connection con = Conexao.getConexao();
        String sql = "SELECT \n"
                + "	fil.*,\n"
                + "	rei.nome_reino\n"
                + "FROM \n"
                + "	tb_filo fil,\n"
                + "	tb_reino rei\n"
                + "WHERE\n"
                + "	rei.id_reino = fil.id_reino AND\n"
                + "	fil.nome_filo like '"+filoPesq.getNomeFilo()+"%' "
                + "ORDER BY fil.nome_filo";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            
            Reino reino = new Reino();
           
            reino.setNomeReino(rs.getString("nome_reino"));
            
            Filo filo = new Filo();
            filo.setIdFilo(rs.getInt("id_filo"));
            filo.setNomeFilo(rs.getString("nome_filo"));          
           
            filo.setReinoFilo(reino);
            
            listaFilo.add(filo);
        }
        stmt.close();
        rs.close();
        con.close();
        return listaFilo;
    }
     
        public static ResultSet retornaRsFilo (Filo filo) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "select * from tb_filo as fil inner join tb_reino as rei on rei.id_reino = fil.id_reino"
                + " where nome_filo like '" + filo.getNomeFilo()+ "%' order by nome_filo";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }

}
    

