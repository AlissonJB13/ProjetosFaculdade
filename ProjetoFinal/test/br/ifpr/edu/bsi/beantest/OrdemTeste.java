/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.beantest;

import br.ifpr.edu.bsi.bean.Classe;
import br.ifpr.edu.bsi.bean.Ordem;

/**
 *
 * @author User
 */
public class OrdemTeste {
    public static void main(String[] args) {
        Ordem o = new Ordem();
        o.setIdOrdem(1);
        o.setNomeOrdem("Diptera");
        
        Classe c = new Classe();
        c.setIdClasse(1);
        c.setNomeClasse("Insecta");
        o.setClasseOrdem(c);
        
        System.out.println(o.getIdOrdem());
        System.out.println(o.getNomeOrdem());
        System.out.println(o.getClasseOrdem().getNomeClasse()); 
    }
    
}
