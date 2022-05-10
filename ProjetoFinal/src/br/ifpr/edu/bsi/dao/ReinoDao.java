/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.dao;

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
public class ReinoDao {
    public static void inserir(Reino reino) throws SQLException {
       //captura a conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //criacao do sql no java, precisa ser string no java
        String sql = "insert into tb_reino (nome_reino) "
                + "values (?)";
        PreparedStatement stmt = con.prepareStatement(sql);//tentar fazer com q o java entenda o sql
        stmt.setString(1, reino.getNomeReino());
        stmt.execute();
        stmt.close();
        con.close();
    }


public static void alterar(Reino reino) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "update tb_reino set nome_reino =?"
                + "where id_reino= ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, reino.getNomeReino());
        stmt.setInt(2, reino.getIdReino());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();

    }

public static void excluir(Reino reino) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from tb_reino where id_reino=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, reino.getIdReino());
        stmt.executeUpdate();
        //fecha o statement
        stmt.close();
        //fecha a conexão
        con.close();
    }

public static List<Reino> listar() throws SQLException {
        List<Reino> listaReino = new ArrayList<Reino>();
        Connection con = Conexao.getConexao();
        String sql = "select * from tb_reino order by nome_reino";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reino reino= new Reino();
            reino.setIdReino(rs.getInt("id_reino"));
            reino.setNomeReino(rs.getString("nome_reino"));
            listaReino.add(reino);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaReino;

    }
    
     public static List<Reino> pesquisar(Reino reinoPesq) throws SQLException {
        //criação da lista de reinos
        List<Reino> listaReino = new ArrayList<Reino>();
        
        
        Connection con = Conexao.getConexao();
        //retorna uma seleção da tabela ordenada pelo nome do reinos
        String sql = "select * from tb_reino where nome_reino like '" + reinoPesq.getNomeReino()+ "%' order by nome_reino";
       //sinal de porcentagem vai determinar como utilizar a estrategia do like, joga no final da concatenação acima ele pesquisa o inicial do nome
        PreparedStatement stmt = con.prepareStatement(sql);
        //recebe o resultado da seleção da tabela
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Reino reino = new Reino();
            reino.setIdReino(rs.getInt("id_reino"));
            reino.setNomeReino(rs.getString("nome_reino"));
            listaReino.add(reino);
        }
        stmt.close();
        //fecha a conexão
        rs.close();
        con.close();
        return listaReino;

    }
     
    public static ResultSet retornaRsReino(Reino reino) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "select * from tb_reino where nome_reino like '" +  reino.getNomeReino() + "%'order by nome_reino";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }

}
