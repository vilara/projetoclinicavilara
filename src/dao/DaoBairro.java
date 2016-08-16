/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.BeansBairro;
import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoBairro {
    ConexaoBD conex = new ConexaoBD();
    BeansBairro usu = new BeansBairro();
    
        public String buscaBairro(int idBairro) throws ClassNotFoundException, SQLException {
        conex.conect();
        conex.executaSql("SELECT * FROM bairro WHERE bairro_cod='" + idBairro + "'"); // método para buscar o id do bairro no BD
        conex.rs.first();
        String resp = conex.rs.getString("bairro_nome");
        conex.desconecta();
        return resp;
    }
}
