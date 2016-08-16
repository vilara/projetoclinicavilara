/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.BeansBairro;
import model.BeansEstado;
import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoEstado {
        ConexaoBD conex = new ConexaoBD();
    BeansEstado usu = new BeansEstado();
    
        public String buscaEstado(int idEstado) throws ClassNotFoundException, SQLException {
        conex.conect();
        conex.executaSql("SELECT * FROM estados WHERE cod_estados='" + idEstado + "'"); // método para buscar o id do bairro no BD
        conex.rs.first();
        String resp = conex.rs.getString("sigla");
        conex.desconecta();
        return resp;
    }
}
