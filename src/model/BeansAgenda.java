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
public class BeansAgenda {
    
    private int idAgenda; 
    private int agenda_codpac; 
    private String agenda_turno;
    private int agenda_codmedico; 
    private String agenda_data;
    private String agenda_motivo;
    private String agenda_status;

    /**
     * @return the idAgenda
     */
    public int getIdAgenda() {
        return idAgenda;
    }

    /**
     * @param idAgenda the idAgenda to set
     */
    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    /**
     * @return the agenda_codpac
     */
    public int getAgenda_codpac() {
        return agenda_codpac;
    }

    /**
     * @param agenda_codpac the agenda_codpac to set
     */
    public void setAgenda_codpac(int agenda_codpac) {
        this.agenda_codpac = agenda_codpac;
    }

    /**
     * @return the agenda_turno
     */
    public String getAgenda_turno() {
        return agenda_turno;
    }

    /**
     * @param agenda_turno the agenda_turno to set
     */
    public void setAgenda_turno(String agenda_turno) {
        this.agenda_turno = agenda_turno;
    }

    /**
     * @return the agenda_codmedico
     */
    public int getAgenda_codmedico() {
        return agenda_codmedico;
    }

    /**
     * @param agenda_codmedico the agenda_codmedico to set
     */
    public void setAgenda_codmedico(int agenda_codmedico) {
        this.agenda_codmedico = agenda_codmedico;
    }

    /**
     * @return the agenda_data
     */
    public String getAgenda_data() {
        return agenda_data;
    }

    /**
     * @param agenda_data the agenda_data to set
     */
    public void setAgenda_data(String agenda_data) {
        this.agenda_data = agenda_data;
    }

    /**
     * @return the agenda_motivo
     */
    public String getAgenda_motivo() {
        return agenda_motivo;
    }

    /**
     * @param agenda_motivo the agenda_motivo to set
     */
    public void setAgenda_motivo(String agenda_motivo) {
        this.agenda_motivo = agenda_motivo;
    }

    /**
     * @return the agenda_status
     */
    public String getAgenda_status() {
        return agenda_status;
    }

    /**
     * @param agenda_status the agenda_status to set
     */
    public void setAgenda_status(String agenda_status) {
        this.agenda_status = agenda_status;
    }
                    
    
}
