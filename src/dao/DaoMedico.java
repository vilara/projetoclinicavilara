/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.BeansMedico;
import util.ConexaoBD;

public class DaoMedico {

    ConexaoBD conex = new ConexaoBD();

    public void salvar(BeansMedico mm) throws ClassNotFoundException, SQLException {

        conex.conect();  // conexão com o Bnaco de Dados

        // criar query
        String query = "INSERT INTO medicos (nome_medico,especialidade_medico,crm_medico) VALUES (?,?,?)";
        // preparar a query para ser usada
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setString(1, mm.getNome());
        stmt.setString(2, mm.getEspecialidade());
        stmt.setInt(3, mm.getCrm());
        stmt.execute();    // executar a query      
        stmt.close();      // encerra a query

        conex.desconecta();   // desconexão do banco de dados
    }

    public void editar(BeansMedico mod) throws ClassNotFoundException, SQLException {
        conex.conect();
        try{
         PreparedStatement stmt = conex.coc.prepareStatement("UPDATE medicos SET nome_medico=?, especialidade_medico=?, crm_medico=? WHERE idMedicos=?");
        stmt.setString(1, mod.getNome());
        stmt.setString(2, mod.getEspecialidade());
        stmt.setInt(3, mod.getCrm());
        stmt.setInt(4, mod.getCod());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");    
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Dados alterados com sucesso"+ex.getMessage());    
        }
       
        conex.desconecta();
    }
    
    
    public void excluir(BeansMedico mod) throws ClassNotFoundException, SQLException{
        conex.conect();
        try{
        PreparedStatement stmt = conex.coc.prepareStatement("DELETE FROM medicos WHERE idMedicos=?");
        stmt.setInt(1, mod.getCod());
        stmt.execute();    
         JOptionPane.showMessageDialog(null, "Registro excluído com sucesso"); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro:\n Erro - " + ex.getMessage());  
        }
        
        
        conex.desconecta();
    }

    public BeansMedico buscaMedico(BeansMedico mod) throws ClassNotFoundException, SQLException {

        conex.conect();        // conecta com o banco de dados

        conex.executaSql("SELECT * FROM medicos WHERE nome_medico like'%" + mod.getPesquisa() + "%'");

        try {
            conex.rs.first();
            mod.setCod(conex.rs.getInt("idMedicos"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecialidade(conex.rs.getString("especialidade_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico"));
        } catch (SQLException ex) {
            if(ex.getMessage().equals("Illegal operation on empty result set.")){
                JOptionPane.showMessageDialog(null, "Não existe registro para esta consulta");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar medico:\n Erro - " + ex.getMessage());
            }
           
        }

        conex.desconecta();    // desconecta do banco de dados

        return mod;
    }

}
