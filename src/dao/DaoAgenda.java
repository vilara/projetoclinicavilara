/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.BeansAgenda;
import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoAgenda {

        BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    
    public void salvarAgendamento(BeansAgenda usu) throws ClassNotFoundException, SQLException{
        
        conex.conect();
                
        // criar query
        String query = "INSERT INTO agendamento (agenda_codpac,agenda_turno,agenda_codmedico,agenda_data,agenda_motivo,agenda_status) VALUES (?,?,?,?,?,?)";
        // preparar a query para ser usada
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setInt(1, usu.getAgenda_codpac());
        stmt.setString(2, usu.getAgenda_turno());
        stmt.setInt(3, usu.getAgenda_codmedico());
        stmt.setString(4, usu.getAgenda_data());
        stmt.setString(5, usu.getAgenda_motivo());
        stmt.setString(6, usu.getAgenda_status());
        stmt.execute();    // executar a query      
        stmt.close();      // encerra a query
        
        conex.desconecta();
    }
    
    
      public void editarAgendamento(BeansAgenda usu) throws ClassNotFoundException, SQLException {
        conex.conect();
        try{
         PreparedStatement stmt = conex.coc.prepareStatement("UPDATE agendamento SET agenda_codpac=?, agenda_turno=?, agenda_codmedico=?, agenda_data=?, agenda_motivo=?, agenda_status=? WHERE idAgenda=?");
        stmt.setInt(1, usu.getAgenda_codpac());
        stmt.setString(2, usu.getAgenda_turno());
        stmt.setInt(3, usu.getAgenda_codmedico());
        stmt.setString(4, usu.getAgenda_data());
        stmt.setString(5, usu.getAgenda_motivo());
        stmt.setString(6, usu.getAgenda_status());
        stmt.setInt(7, usu.getIdAgenda());
        stmt.execute();
        
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Erro ao alterar agendamento!"+ex.getMessage());    
        }
       
        conex.desconecta();
    }
      
       public void editarAgendamentoStatus(BeansAgenda usu) throws ClassNotFoundException, SQLException {
        conex.conect();
        try{
         PreparedStatement stmt = conex.coc.prepareStatement("UPDATE agendamento SET agenda_status=? WHERE idAgenda=?");
        
        stmt.setString(1, usu.getAgenda_status());
        stmt.setInt(2, usu.getIdAgenda());
        stmt.execute();
          JOptionPane.showMessageDialog(null, "Agendamento em atendimento");  
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Erro ao alterar o status agendamento!"+ex.getMessage());    
        }
       
        conex.desconecta();
    }
    
      
        public void excluirAgendamento(BeansAgenda mod) throws ClassNotFoundException, SQLException{
        conex.conect();
        try{
        PreparedStatement stmt = conex.coc.prepareStatement("DELETE FROM agendamento WHERE idAgenda=?");
        stmt.setInt(1, mod.getIdAgenda());
        stmt.execute();    
         JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso"); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir agendamento:\n Erro - " + ex.getMessage());  
        }
        
        
        conex.desconecta();
    }
    
        public BeansAgenda buscaAgendamento(BeansAgenda mod) throws ClassNotFoundException, SQLException {

        conex.conect();        // conecta com o banco de dados

        conex.executaSql("SELECT * FROM agendamento WHERE agenda_data like'%" + mod.getAgenda_data() + "%'");

        try {
            conex.rs.first();
            mod.setIdAgenda(conex.rs.getInt("idAgenda"));
            mod.setAgenda_codpac(conex.rs.getInt("agenda_codpac"));
            mod.setAgenda_turno(conex.rs.getString("agenda_turno"));
            mod.setAgenda_codmedico(conex.rs.getInt("agenda_codmedico"));
            mod.setAgenda_data(conex.rs.getString("agenda_data"));
            mod.setAgenda_motivo(conex.rs.getString("agenda_motivo"));
            mod.setAgenda_status(conex.rs.getString("agenda_status"));
           
        } catch (SQLException ex) {
            if(ex.getMessage().equals("Illegal operation on empty result set.")){
                JOptionPane.showMessageDialog(null, "Não existe resposta para esta consulta");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento:\n Erro - " + ex.getMessage());
            }
           
        }

        conex.desconecta();    // desconecta do banco de dados

        return mod;
    }
    

        public BeansAgenda buscaAgendamentoPorCodigo(int cod) throws ClassNotFoundException, SQLException{
        BeansAgenda agen = new BeansAgenda();
        conex.conect();        // conecta com o banco de dados

        conex.executaSql("SELECT * FROM agendamento INNER JOIN pacientes ON agenda_codpac = idPaciente "
                + " INNER JOIN medicos ON agenda_codmedico = idMedicos WHERE idAgenda = " + cod);

        try {
            conex.rs.first();
            agen.setIdAgenda(conex.rs.getInt("idAgenda"));
            agen.setAgenda_nomePac(conex.rs.getString("pac_nome"));
            agen.setAgenda_nomeMedico(conex.rs.getString("nome_medico"));
            agen.setAgenda_motivo(conex.rs.getString("agenda_motivo"));
            agen.setAgenda_PacienteDataNasc(conex.rs.getString("pac_nascimento"));
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento!");
           
        }

        conex.desconecta();    // desconecta do banco de dados

        return agen;
    }

}
