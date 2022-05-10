/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.beantest;

import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Reino;

/**
 *
 * @author User
 */
public class FiloTeste {
    public static void main(String[] args) {
        Filo f = new Filo();
        f.setIdFilo(1);
        f.setNomeFilo("Arthropoda");
        
        Reino r = new Reino();
        r.setIdReino(1);
        r.setNomeReino("Animalia");
        f.setReinoFilo(r);
        
        System.out.println(f.getIdFilo());
        System.out.println(f.getNomeFilo());
        System.out.println(f.getReinoFilo().getNomeReino());
        
    }
}
