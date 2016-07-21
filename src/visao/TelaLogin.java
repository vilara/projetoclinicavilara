/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConnsection.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class TelaLogin extends javax.swing.JFrame {
    ConexaoBD coc = new ConexaoBD();
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogoLogin = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        JButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        labelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_principal.jpg"))); // NOI18N
        getContentPane().add(jLabelLogoLogin);
        jLabelLogoLogin.setBounds(30, 60, 220, 140);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsuario.setText("Usuário");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(270, 90, 80, 20);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(320, 80, 160, 30);

        jLabelenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelenha.setText("Senha");
        getContentPane().add(jLabelenha);
        jLabelenha.setBounds(270, 130, 50, 15);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(320, 120, 160, 30);

        JButtonAcessar.setText("Acessar");
        JButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAcessar);
        JButtonAcessar.setBounds(320, 160, 80, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(400, 160, 80, 23);

        labelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.png"))); // NOI18N
        getContentPane().add(labelFundoLogin);
        labelFundoLogin.setBounds(0, 0, 500, 230);

        setSize(new java.awt.Dimension(516, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAcessarActionPerformed
        try {
            coc.conect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        coc.executaSql("SELECT * FROM usuarios WHERE usu_nome='"+jTextFieldUsuario.getText()+"'");
            coc.rs.first();
            if(coc.rs.getString("usu_senha").equals(String.valueOf(jPasswordFieldSenha.getPassword()))){
             TelaPrincipal t1 = new TelaPrincipal();            
            t1.setVisible(true);
            this.dispose();   
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
        }
        
        
        try {
            coc.desconecta();
            
      
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelLogoLogin;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel labelFundoLogin;
    // End of variables declaration//GEN-END:variables
}
