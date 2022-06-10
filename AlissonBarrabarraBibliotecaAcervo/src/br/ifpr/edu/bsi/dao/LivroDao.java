/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

import br.ifpr.edu.bsi.bean.Livro;
import br.ifpr.edu.bsi.util.ConexaoBancoDados;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aliss
 */
public class LivroDao {
    public static void inserir(Livro livro) throws SQLException {
       //captura a conexão com o banco de dados
        Connection con = ConexaoBancoDados.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_livro(descricao_livro, edicao_livro, autor_livro, editora_livro, quantidade_livro)"
                + "values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, livro.getDescricaoLivro());
        stmt.setInt(2, livro.getEdicaoLivro());
        stmt.setString(3, livro.getAutorLivro());
        stmt.setString(4, livro.getEditoraLivro());
        stmt.setInt(5, livro.getQuantidadeLivro());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public static void alterar(Livro livro) throws SQLException {
        Connection con = ConexaoBancoDados.getConexao();
        String sql = "update tb_livro set descricao_livro =?, edicao_livro =?, autor_livro =?, editora_livro =?, quantidade_livro=?"
                + "where id_livro= ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, livro.getDescricaoLivro());
        stmt.setInt(2, livro.getEdicaoLivro());
        stmt.setString(3, livro.getAutorLivro());
        stmt.setString(4, livro.getEditoraLivro());
        stmt.setInt(5, livro.getQuantidadeLivro());
        stmt.setInt(6, livro.getIdLivro());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();

    }
    
   public static List<Livro> listar() throws SQLException {
        List<Livro> listaLivro = new ArrayList<Livro>();
        Connection con = ConexaoBancoDados.getConexao();
        String sql = "select * from tb_livro order by descricao_livro";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Livro livro = new Livro();
            livro.setIdLivro(rs.getInt("id_livro"));
            livro.setDescricaoLivro(rs.getString("descricao_livro"));
            livro.setEdicaoLivro(rs.getInt("edicao_livro"));
            livro.setAutorLivro(rs.getString("autor_livro"));
            livro.setEditoraLivro(rs.getString("editora_livro"));
            livro.setQuantidadeLivro(rs.getInt("quantidade_livro"));
            listaLivro.add(livro);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaLivro;

    }
    
      public static List<Livro> pesquisar(Livro livroPesq) throws SQLException {
        //criação da lista de estados
        List<Livro> listaLivro = new ArrayList<Livro>();
        
        
        Connection con = ConexaoBancoDados.getConexao();
        //retorna uma seleção da tabela ordenada pelo nome do estado
        String sql = "select * from tb_livro where descricao_livro like '" + livroPesq.getDescricaoLivro()+ "%' order by descricao_livro";
       //sinal de porcentagem vai determinar como utilizar a estrategia do like, joga no final da concatenação acima ele pesquisa o inicial do nome
        PreparedStatement stmt = con.prepareStatement(sql);
        //recebe o resultado da seleção da tabela
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Livro livro = new Livro();
            livro.setIdLivro(rs.getInt("id_livro"));
            livro.setDescricaoLivro(rs.getString("descricao_livro"));
            livro.setEdicaoLivro(rs.getInt("edicao_livro"));
            livro.setAutorLivro(rs.getString("autor_livro"));
            livro.setEditoraLivro(rs.getString("editora_livro"));
            livro.setQuantidadeLivro(rs.getInt("quantidade_livro"));
            listaLivro.add(livro);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaLivro;

    }
}
    

