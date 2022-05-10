/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

import br.ifpr.edu.bsi.bean.Classe;
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
public class ClasseDao {
    public static void inserir(Classe classe) throws SQLException {//trocar o parametro
       //captura a conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_classe (nome_classe, id_filo) "
                + "values (?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, classe.getNomeClasse());
        stmt.setInt(2, classe.getFiloClasse().getIdFilo());//pegar o id do filo através do relacionamento com a FiloClasse
        stmt.execute();
        stmt.close();
        con.close();
    }
    public static void excluir(Classe classe) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from tb_classe where id_classe=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, classe.getIdClasse());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
    }
    
    public static void alterar(Classe classe) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "update tb_classe set nome_classe =?, id_filo =? where id_classe= ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, classe.getNomeClasse());
        stmt.setInt(2, classe.getFiloClasse().getIdFilo());
        stmt.setInt(3, classe.getIdClasse());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
       }
    
    public static List<Classe> listar() throws SQLException {
        List<Classe> listaClasse = new ArrayList<Classe>();
        Connection con = Conexao.getConexao();
        String sql = "select * from tb_classe order by nome_classe";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            Classe classe = new Classe();
            classe.setIdClasse(rs.getInt("id_classe"));
            classe.setNomeClasse(rs.getString("nome_classe"));
            Filo filo = new Filo();
            filo.setIdFilo(rs.getInt("id_filo"));
            classe.setFiloClasse(filo);
            listaClasse.add(classe);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaClasse;

    }
    
    public static List<Classe> pesquisar(Classe classePesq) throws SQLException{
    List<Classe> listaClasse = new ArrayList<Classe>();
        Connection con = Conexao.getConexao();
        String sql = "SELECT \n"
                + "	clas.*,\n"
                + "	fil.nome_filo\n"
                + "FROM \n"
                + "	tb_classe clas,\n"
                + "	tb_filo fil\n"
                + "WHERE\n"
                + "	fil.id_filo = clas.id_filo AND\n"
                + "	clas.nome_classe like '"+classePesq.getNomeClasse()+"%' "
                + "ORDER BY clas.nome_classe";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            
           Filo filo = new Filo();
           
            filo.setNomeFilo(rs.getString("nome_filo"));
            
            Classe classe = new Classe();
            classe.setIdClasse(rs.getInt("id_classe"));
            classe.setNomeClasse(rs.getString("nome_classe"));          
           
           classe.setFiloClasse(filo);
            
            listaClasse.add(classe);
        }
        stmt.close();
        rs.close();
        con.close();
        return listaClasse;
    }
          
        public static ResultSet retornaRsClasse (Classe classe) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "select * from tb_classe as clas inner join tb_filo as fil on fil.id_filo = clas.id_filo "
                + "where nome_classe like '" + classe.getNomeClasse()+ "%' order by nome_classe";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
}
