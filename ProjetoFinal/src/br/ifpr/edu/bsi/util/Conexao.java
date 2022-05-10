/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexao {
   
    
    public static Connection getConexao() throws SQLException{
       try{
        //definição do driver de conexão com o banco de dados MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
         //definição dos parametros de conexão local host significa que esta no computador
        return DriverManager.getConnection("jdbc:mysql://localhost/projetofinal?useTimezone=true&serverTimezone=UTC", "root", "1234");
    }catch (ClassNotFoundException e){
        throw new SQLDataException(e.getMessage()); 
      }//qualquer aplicação deve ter um tratamento de exceções caso ocorra algum problema
    }
       public static void main(String[] args) {
        try{
           getConexao();
           System.out.println("ConexÃ£o realizada com sucesso.");
        }catch (SQLException e){
            System.out.println("ConexÃ£o nÃ£o realizada, verificar log.");
            e.printStackTrace();
        }    
    }
}

    
