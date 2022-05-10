/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.bean;

/**
 *
 * @author User
 */
public class Classe {
    private int idClasse;
    private String nomeClasse;
    private Filo filoClasse;

    /**
     * @return the idClasse
     */
    public int getIdClasse() {
        return idClasse;
    }

    /**
     * @param idClasse the idClasse to set
     */
    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    /**
     * @return the nomeClasse
     */
    public String getNomeClasse() {
        return nomeClasse;
    }

    /**
     * @param nomeClasse the nomeClasse to set
     */
    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    /**
     * @return the filoClasse
     */
    public Filo getFiloClasse() {
        return filoClasse;
    }

    /**
     * @param filoClasse the filoClasse to set
     */
    public void setFiloClasse(Filo filoClasse) {
        this.filoClasse = filoClasse;
    }

    public void getNomeClasse(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
