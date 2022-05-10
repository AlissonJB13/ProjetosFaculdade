/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.edu.bsi.bean;

/**
 *
 * @author User
 */
public class Ordem {
    private int idOrdem;
    private String nomeOrdem;
    private Classe classeOrdem;

    /**
     * @return the idOrdem
     */
  

    /**
     * @param idOrdem the idOrdem to set
     */

    /**
     * @param nomeOrdem the nomeOrdem to set
     */
    public void setNomeOrdem(String nomeOrdem) {
        this.nomeOrdem = nomeOrdem;
    }

    /**
     * @return the classeOrdem
     */
    public Classe getClasseOrdem() {
        return classeOrdem;
    }

    /**
     * @param classeOrdem the classeOrdem to set
     */
    public void setClasseOrdem(Classe classeOrdem) {
        this.classeOrdem = classeOrdem;
    }

    /**
     * @return the idOrdem
     */
    public int getIdOrdem() {
        return idOrdem;
    }

    /**
     * @param idOrdem the idOrdem to set
     */
    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    /**
     * @return the nomeOrdem
     */
    public String getNomeOrdem() {
        return nomeOrdem;
    }

}
