/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.BeansCidade;

import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoCidade {
          ConexaoBD conex = new ConexaoBD();
            BeansCidade usu = new BeansCidade();
    
        public String buscaCidade(int idCidade) throws ClassNotFoundException, SQLException {
        conex.conect();
        conex.executaSql("SELECT * FROM cidades WHERE cod_cidades='" + idCidade + "'"); // método para buscar o id do bairro no BD
        conex.rs.first();
        String resp = conex.rs.getString("nome");
        conex.desconecta();
        return resp;
    }
}
