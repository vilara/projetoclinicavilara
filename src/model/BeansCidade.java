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
public class BeansCidade {
    private String nome;
    private String cep;
    private int estados_cod_estados;
    private int cod_cidades;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the estados_cod_estados
     */
    public int getEstados_cod_estados() {
        return estados_cod_estados;
    }

    /**
     * @param estados_cod_estados the estados_cod_estados to set
     */
    public void setEstados_cod_estados(int estados_cod_estados) {
        this.estados_cod_estados = estados_cod_estados;
    }

    /**
     * @return the cod_cidades
     */
    public int getCod_cidades() {
        return cod_cidades;
    }

    /**
     * @param cod_cidades the cod_cidades to set
     */
    public void setCod_cidades(int cod_cidades) {
        this.cod_cidades = cod_cidades;
    }
}
