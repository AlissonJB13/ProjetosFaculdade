/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.beantest;

import br.ifpr.edu.bsi.bean.Reino;
import org.apache.commons.collections4.map.StaticBucketMap;

/**
 *
 * @author User
 */
public class ReinoTeste {
    public static void main(String[] args) {
      Reino r = new Reino();
      r.setIdReino(1);
      r.setNomeReino("Animalia");
      
      System.out.println(r.getIdReino());
      System.out.println(r.getNomeReino());
    }
    
}
