/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.beantest;

import br.ifpr.edu.bsi.bean.Familia;
import br.ifpr.edu.bsi.bean.Ordem;

/**
 *
 * @author User
 */
public class FamiliaTeste {
    public static void main(String[] args) {
        Familia fa = new Familia();
        fa.setIdFamilia(1);
        fa.setNomeFamilia("Simuliidae");
        fa.setComprimentoFamilia("1 a 5 mm");
        fa.setAlimentaçãoFamilia("Hematófago");
        
        
        Ordem o = new Ordem();
        o.setIdOrdem(1);
        o.setNomeOrdem("Diptera");
        fa.setOrdemFamilia(o);
        
        System.out.println(fa.getIdFamilia());
        System.out.println(fa.getNomeFamilia());
        System.out.println(fa.getComprimentoFamilia());
        System.out.println(fa.getAlimentaçãoFamilia());
        System.out.println(fa.getOrdemFamilia().getNomeOrdem()); 
    }
}
