/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.beantest;

import br.ifpr.edu.bsi.bean.Classe;
import br.ifpr.edu.bsi.bean.Filo;

/**
 *
 * @author User
 */
public class ClasseTeste {
    public static void main(String[] args) {
        Classe c = new Classe();
        c.setIdClasse(1);
        c.setNomeClasse("Insecta");
        
        Filo f = new Filo();
        f.setIdFilo(1);
        f.setNomeFilo("Arthropoda");
        c.setFiloClasse(f);
        
        System.out.println(c.getIdClasse());
        System.out.println(c.getNomeClasse());
        System.out.println(c.getFiloClasse().getNomeFilo());   
    }
}
