/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.ifpr.edu.bsi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
/**
 *
 * @author aliss
 */
public class ConexaoBancoDados {

     public static Connection getConexao() throws SQLException{
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/acervolivros?useTimezone=true&serverTimezone=UTC", "root", "12345");
    }catch (ClassNotFoundException e){
        throw new SQLDataException(e.getMessage()); 
      }
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
