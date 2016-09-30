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
public class BeansConsulta {
    private int idconsulta;
    private int consulta_cod_agenda;
    private String consulta_diagnostico;
    private String consulta_obs;

    /**
     * @return the idconsulta
     */
    public int getIdconsulta() {
        return idconsulta;
    }

    /**
     * @param idconsulta the idconsulta to set
     */
    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    /**
     * @return the consulta_cod_agenda
     */
    public int getConsulta_cod_agenda() {
        return consulta_cod_agenda;
    }

    /**
     * @param consulta_cod_agenda the consulta_cod_agenda to set
     */
    public void setConsulta_cod_agenda(int consulta_cod_agenda) {
        this.consulta_cod_agenda = consulta_cod_agenda;
    }

    /**
     * @return the consulta_diagnostico
     */
    public String getConsulta_diagnostico() {
        return consulta_diagnostico;
    }

    /**
     * @param consulta_diagnostico the consulta_diagnostico to set
     */
    public void setConsulta_diagnostico(String consulta_diagnostico) {
        this.consulta_diagnostico = consulta_diagnostico;
    }

    /**
     * @return the consulta_obs
     */
    public String getConsulta_obs() {
        return consulta_obs;
    }

    /**
     * @param consulta_obs the consulta_obs to set
     */
    public void setConsulta_obs(String consulta_obs) {
        this.consulta_obs = consulta_obs;
    }
    
    
    
}
