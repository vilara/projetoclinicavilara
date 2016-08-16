/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MarceloMartinsVilara
 */
public class BeansEstado {
    private String sigla;
    private String nome_estado;
    private int cod_estados;

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nome_estado
     */
    public String getNome_estado() {
        return nome_estado;
    }

    /**
     * @param nome_estado the nome_estado to set
     */
    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    /**
     * @return the cod_estados
     */
    public int getCod_estados() {
        return cod_estados;
    }

    /**
     * @param cod_estados the cod_estados to set
     */
    public void setCod_estados(int cod_estados) {
        this.cod_estados = cod_estados;
    }
}
