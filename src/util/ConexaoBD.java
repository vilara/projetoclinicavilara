/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MarceloMartinsVilara
 */
public class ConexaoBD {
   int number = 1;
    private String schema = "projetoclinicavilara";
    private String usuario = "root";
    private String senha = "";
    private String caminho = "jdbc:mysql://localhost/" + schema;
    public Connection coc;
    public Statement stm;
    public ResultSet rs;

    public Connection conect() throws ClassNotFoundException, SQLException {
        // cadastrar driver
        Class.forName("com.mysql.jdbc.Driver");
        // conxao com o banco de dados
        coc = DriverManager.getConnection(caminho, usuario, senha);
        return coc;
    }
    
    public void desconecta() throws SQLException{
        coc.close();
    }

    public void executaSql(String sql) {

        try {
            stm = coc.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na execução da query"+ex.getMessage());
        }
       
      
    }

}
