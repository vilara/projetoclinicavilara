/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConnsection.ConexaoBD;
import modeloBeans.BeansPaciente;
/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoPaciente {
        ConexaoBD conex = new ConexaoBD();
       
        BeansPaciente usu = new BeansPaciente();
        
        public int buscapaciente(String pac) throws ClassNotFoundException, SQLException{
            conex.conect();
            conex.executaSql("SELECT * FROM bairro WHERE bairro_nome='"+pac+"'"); // método para buscar o id do bairro no BD
            conex.rs.first();
          int res = conex.rs.getInt("bairro_cod");
            conex.desconecta();
            return res;
        }
        
    public void salvar(BeansPaciente usu) throws ClassNotFoundException, SQLException{
        
        conex.conect();
                
        // criar query
        String query = "INSERT INTO pacientes (pac_nome,pac_nascimento,pac_rg,pac_email,pac_telefone,pac_rua,pac_nr,pac_complemento,pac_bairro,pac_cidade,pac_estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        // preparar a query para ser usada
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setString(1, usu.getPac_nome());
        stmt.setString(2, usu.getPac_nascimento());
        stmt.setString(3, usu.getPac_rg());
        stmt.setString(4, usu.getPac_email());
        stmt.setString(5, usu.getPac_telefone());
        stmt.setString(6, usu.getPac_rua());
        stmt.setInt(7, usu.getPac_nr());
        stmt.setString(8, usu.getPac_complemento());
        stmt.setInt(9, buscapaciente(usu.getPac_bairro()));
        stmt.setString(10, usu.getPac_cidade());
        stmt.setString(11, usu.getPac_estado());
        stmt.execute();    // executar a query      
        stmt.close();      // encerra a query
        
        conex.desconecta();
    }
    
    
      public void editar(BeansPaciente mod) throws ClassNotFoundException, SQLException {
        conex.conect();
        try{
        PreparedStatement stmt = conex.coc.prepareStatement("UPDATE pacientes SET pac_nome=?, pac_nascimento=?, pac_rg=?, pac_email=?, pac_telefone=?, pac_rua=?, pac_nr=?, pac_complemento=?, pac_bairro=?, pac_cidade=?, pac_estado=? WHERE idPaciente=?");
        stmt.setString(1, mod.getPac_nome());
        stmt.setString(2, mod.getPac_nascimento());
        stmt.setString(3, mod.getPac_rg());
        stmt.setString(4, mod.getPac_email());
        stmt.setString(5, mod.getPac_telefone());
        stmt.setString(6, mod.getPac_rua());
        stmt.setInt(7, mod.getPac_nr());        
        stmt.setString(8, mod.getPac_complemento());
        stmt.setString(9, mod.getPac_bairro());
        stmt.setString(10, mod.getPac_cidade());
        stmt.setString(11, mod.getPac_estado());
        stmt.setInt(12, mod.getIdPaciente());
        stmt.execute();
        
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Erro ao alterar usuário!"+ex.getMessage());    
        }
       
        conex.desconecta();
    }
    
      
        public void excluirUsu(BeansUsuario mod) throws ClassNotFoundException, SQLException{
        conex.conect();
        try{
        PreparedStatement stmt = conex.coc.prepareStatement("DELETE FROM usuarios WHERE usu_cod=?");
        stmt.setInt(1, mod.getCod_usu());
        stmt.execute();    
         JOptionPane.showMessageDialog(null, "Registro excluído com sucesso"); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro:\n Erro - " + ex.getMessage());  
        }
        
        
        conex.desconecta();
    }
    
        public BeansPaciente buscaPac(BeansPaciente mod) throws ClassNotFoundException, SQLException {

        conex.conect();        // conecta com o banco de dados

        conex.executaSql("SELECT * FROM pacientes WHERE pac_nome like'%" + mod.getPac_nome() + "%'");

        try {
            conex.rs.first();
            mod.setIdPaciente(conex.rs.getInt("idPaciente"));
            mod.setPac_nome(conex.rs.getString("pac_nome"));
           
        } catch (SQLException ex) {
            if(ex.getMessage().equals("Illegal operation on empty result set.")){
                JOptionPane.showMessageDialog(null, "Não existe registro para esta consulta");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar usuáruio:\n Erro - " + ex.getMessage());
            }
           
        }

        conex.desconecta();    // desconecta do banco de dados

        return mod;
    }
}
