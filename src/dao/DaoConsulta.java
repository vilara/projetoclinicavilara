/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.BeansConsulta;
import model.BeansPaciente;
import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoConsulta {
    ConexaoBD conex = new ConexaoBD();

    BeansConsulta usu = new BeansConsulta();
   

    public BeansConsulta buscaConsulta(BeansConsulta usu) throws ClassNotFoundException, SQLException {
        conex.conect();
        String query = "SELECT * FROM consulta WHERE idconsulta=?"; // método para buscar o id do bairro no BD
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setInt(1, usu.getIdconsulta());
        conex.rs.first();
        usu.setConsulta_cod_agenda(conex.rs.getInt("consulta_cod_agenda"));
        usu.setConsulta_diagnostico(conex.rs.getString("consulta_diagnostico"));
        usu.setConsulta_obs(conex.rs.getString("consulta_obs"));
        conex.desconecta();
        return usu;
    }
   
    public void salvar(BeansConsulta usu) throws ClassNotFoundException, SQLException {

        conex.conect();

        // criar query
        String query = "INSERT INTO consulta (consulta_cod_agenda,consulta_diagnostico,consulta_obs) VALUES (?,?,?)";
        // preparar a query para ser usada
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setInt(1, usu.getConsulta_cod_agenda());
        stmt.setString(2, usu.getConsulta_diagnostico());
        stmt.setString(3, usu.getConsulta_obs());
       
        stmt.execute();    // executar a query      
        stmt.close();      // encerra a query

        conex.desconecta();
    }

    public void editar(BeansConsulta mod) throws ClassNotFoundException, SQLException {
        conex.conect();
        try {
            PreparedStatement stmt = conex.coc.prepareStatement("UPDATE consulta SET consulta_cod_agenda=?, consulta_diagnostico=?, consulta_obs=? WHERE idconsulra=?");
            stmt.setInt(1, mod.getConsulta_cod_agenda());
            stmt.setString(2, mod.getConsulta_diagnostico());
            stmt.setString(3, mod.getConsulta_obs());
            stmt.setInt(4, mod.getIdconsulta());
            stmt.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar consulta!" + ex.getMessage());
        }

        conex.desconecta();
    }

    public void excluirConsulta(BeansConsulta mod) throws ClassNotFoundException, SQLException {
        conex.conect();
        try {
            PreparedStatement stmt = conex.coc.prepareStatement("DELETE FROM consulta WHERE idconsulta=?");
            stmt.setInt(1, mod.getIdconsulta());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Consulta excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir consulta:\n Erro - " + ex.getMessage());
        }

        conex.desconecta();
    }


}
