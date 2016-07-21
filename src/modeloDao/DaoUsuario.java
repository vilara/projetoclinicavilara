/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import modeloBeans.BeansUsuario;
import modeloConnsection.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class DaoUsuario {
        
    ConexaoBD conex = new ConexaoBD();
    
    public void salvar(BeansUsuario usu) throws ClassNotFoundException, SQLException{
        
        conex.conect();
                
        // criar query
        String query = "INSERT INTO usuarios (usu_nome,usu_senha,usu_tipo) VALUES (?,?,?)";
        // preparar a query para ser usada
        PreparedStatement stmt = conex.coc.prepareStatement(query);
        stmt.setString(1, usu.getNome_usu());
        stmt.setString(2, usu.getSenha_usu());
        stmt.setString(3, usu.getTipo_usu());
        stmt.execute();    // executar a query      
        stmt.close();      // encerra a query
        
        conex.desconecta();
    }
    
    
      public void editar(BeansUsuario mod) throws ClassNotFoundException, SQLException {
        conex.conect();
        try{
         PreparedStatement stmt = conex.coc.prepareStatement("UPDATE usuarios SET usu_nome=?, usu_senha=?, usu_tipo=? WHERE usu_cod=?");
        stmt.setString(1, mod.getNome_usu());
        stmt.setString(2, mod.getSenha_usu());
        stmt.setString(3, mod.getTipo_usu());
        stmt.setInt(4, mod.getCod_usu());
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
    
        public BeansUsuario buscaUsuario(BeansUsuario mod) throws ClassNotFoundException, SQLException {

        conex.conect();        // conecta com o banco de dados

        conex.executaSql("SELECT * FROM usuarios WHERE usu_nome like'%" + mod.getPesquisa_usu() + "%'");

        try {
            conex.rs.first();
            mod.setCod_usu(conex.rs.getInt("usu_cod"));
            mod.setNome_usu(conex.rs.getString("usu_nome"));
            mod.setSenha_usu(conex.rs.getString("usu_senha"));
            mod.setTipo_usu(conex.rs.getString("usu_tipo"));
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
