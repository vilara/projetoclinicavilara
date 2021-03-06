/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.BeansUsuario;
import model.ModeloTabela;
import util.ConexaoBD;
import dao.DaoUsuario;

/**
 *
 * @author MarceloMartinsVilara
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario usu = new BeansUsuario();
    DaoUsuario mod = new DaoUsuario();
    ConexaoBD coc = new ConexaoBD();
    int flag = 0;
    
    public FormUsuario() {
        initComponents();
        try {
            preencherTabela("SELECT * FROM usuarios");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jButtonNovoUsu = new javax.swing.JButton();
        jButtonSalvarUsu = new javax.swing.JButton();
        jButtonCancelarUsu = new javax.swing.JButton();
        jButtonEditUsu = new javax.swing.JButton();
        jButtonPesqUsuario = new javax.swing.JButton();
        jTextFieldPesqUsuario = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabelId = new javax.swing.JLabel();
        jLabelIdUsuario = new javax.swing.JLabel();
        jButtonExcluirUsu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuário");

        jLabel4.setText("Senha");

        jLabel5.setText("Confirmar senha");

        jLabel6.setText("Tipo");

        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        jPasswordFieldConfSenha.setEnabled(false);

        jButtonNovoUsu.setText("Novo");
        jButtonNovoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuActionPerformed(evt);
            }
        });

        jButtonSalvarUsu.setText("Salvar");
        jButtonSalvarUsu.setEnabled(false);
        jButtonSalvarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarUsuActionPerformed(evt);
            }
        });

        jButtonCancelarUsu.setText("Cancelar");
        jButtonCancelarUsu.setEnabled(false);
        jButtonCancelarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarUsuActionPerformed(evt);
            }
        });

        jButtonEditUsu.setText("Alterar");
        jButtonEditUsu.setEnabled(false);
        jButtonEditUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditUsuActionPerformed(evt);
            }
        });

        jButtonPesqUsuario.setText("Buscar");
        jButtonPesqUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqUsuarioActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Médico", "Recepcionista" }));
        jComboBoxTipo.setEnabled(false);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        jLabelId.setText("ID:");

        jButtonExcluirUsu.setText("Excluir");
        jButtonExcluirUsu.setEnabled(false);
        jButtonExcluirUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirUsu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(jPasswordFieldSenha)
                                .addComponent(jTextFieldPesqUsuario))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jButtonPesqUsuario)))
                            .addGap(14, 14, 14))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jButtonEditUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPasswordFieldConfSenha)
                        .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesqUsuario)
                    .addComponent(jLabelId)
                    .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoUsu)
                    .addComponent(jButtonSalvarUsu)
                    .addComponent(jButtonCancelarUsu)
                    .addComponent(jButtonEditUsu)
                    .addComponent(jButtonExcluirUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE USUÁRIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(706, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonSalvarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarUsuActionPerformed
      if(jTextFieldUsuario.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor preencher o campo nome!");
          jTextFieldUsuario.requestFocus();
      }
      else if(String.valueOf(jPasswordFieldSenha.getPassword()).isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor preencher o campo senha!");
          jPasswordFieldSenha.requestFocus();
      }  
      else if(String.valueOf(jPasswordFieldConfSenha.getPassword()).isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor preencher o campo confirmar senha!");
          jPasswordFieldConfSenha.requestFocus();
      }
      else if(!String.valueOf(jPasswordFieldConfSenha.getPassword()).equals(String.valueOf(jPasswordFieldSenha.getPassword()))){
          JOptionPane.showMessageDialog(null, "Favor preencher o campo confirmar senha igual ao campo senha!");
          jPasswordFieldConfSenha.requestFocus();
      }
      else  if(flag == 1){
      usu.setNome_usu(jTextFieldUsuario.getText());
      usu.setSenha_usu(String.valueOf(jPasswordFieldSenha.getPassword()));
      usu.setTipo_usu(String.valueOf(jComboBoxTipo.getSelectedItem()));
        try {
            mod.salvar(usu);
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir usuário"+ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir usuário"+ex.getMessage());
        }
       jTextFieldUsuario.setEnabled(false);
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setEnabled(false);
       jPasswordFieldConfSenha.setText("");
       jComboBoxTipo.setEnabled(false);
       jComboBoxTipo.setSelectedIndex(0);
       jButtonPesqUsuario.setEnabled(true);
       jTextFieldPesqUsuario.setText("");       
       jTextFieldPesqUsuario.setEnabled(true);
       jButtonNovoUsu.setEnabled(true);
       jButtonSalvarUsu.setEnabled(false);
       jButtonCancelarUsu.setEnabled(false);  
      }
      
   
       else  if(flag == 2){
      usu.setNome_usu(jTextFieldUsuario.getText());
      usu.setSenha_usu(String.valueOf(jPasswordFieldSenha.getPassword()));
      usu.setTipo_usu(String.valueOf(jComboBoxTipo.getSelectedItem()));
      usu.setCod_usu(Integer.valueOf(jLabelIdUsuario.getText()));
        try {
           mod.editar(usu);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao editar usuário"+ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao editar usuário"+ex.getMessage());
        }
      jTextFieldUsuario.setEnabled(false);
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setEnabled(false);
       jPasswordFieldConfSenha.setText("");
       jComboBoxTipo.setEnabled(false);
       jComboBoxTipo.setSelectedIndex(0);
       jButtonPesqUsuario.setEnabled(true);
       jTextFieldPesqUsuario.setText("");       
       jTextFieldPesqUsuario.setEnabled(true);
       jButtonNovoUsu.setEnabled(true);
       jButtonSalvarUsu.setEnabled(false);
       jButtonCancelarUsu.setEnabled(false);  
      }
        try {
            preencherTabela("SELECT * FROM usuarios");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarUsuActionPerformed

    private void jButtonNovoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuActionPerformed
       flag = 1;
       jTextFieldUsuario.setEnabled(true);
       jPasswordFieldSenha.setEnabled(true);
       jPasswordFieldConfSenha.setEnabled(true);
       jComboBoxTipo.setEnabled(true);
       jTextFieldPesqUsuario.setEnabled(false);
       jButtonNovoUsu.setEnabled(false);
       jButtonSalvarUsu.setEnabled(true);
       jButtonCancelarUsu.setEnabled(true);
       jButtonPesqUsuario.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoUsuActionPerformed

    private void jButtonCancelarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarUsuActionPerformed
       jTextFieldUsuario.setEnabled(false);
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setEnabled(false);
       jPasswordFieldConfSenha.setText("");
       jComboBoxTipo.setEnabled(false);
       jComboBoxTipo.setSelectedIndex(0);
       jButtonPesqUsuario.setEnabled(true);
       jTextFieldPesqUsuario.setText("");       
       jTextFieldPesqUsuario.setEnabled(true);       
       jButtonNovoUsu.setEnabled(true);
       jButtonSalvarUsu.setEnabled(false);
       jButtonCancelarUsu.setEnabled(false);
       jButtonEditUsu.setEnabled(false);
        try {
            preencherTabela("SELECT * FROM usuarios");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCancelarUsuActionPerformed

    private void jButtonPesqUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqUsuarioActionPerformed
        usu.setPesquisa_usu(jTextFieldPesqUsuario.getText());
        try {
       BeansUsuario resp = mod.buscaUsuario(usu);
       jLabelIdUsuario.setText(String.valueOf(resp.getCod_usu()));
       jTextFieldUsuario.setText(resp.getNome_usu());
      
       jPasswordFieldSenha.setText(resp.getSenha_usu());
      
       jPasswordFieldConfSenha.setText(resp.getSenha_usu());
       
       jComboBoxTipo.setSelectedItem(resp.getTipo_usu());
       
        preencherTabela("SELECT * FROM usuarios WHERE usu_nome like '%"+jTextFieldPesqUsuario.getText()+"%'");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jButtonEditUsu.setEnabled(true);
        jButtonCancelarUsu.setEnabled(true);
        jButtonNovoUsu.setEnabled(false);
        jButtonExcluirUsu.setEnabled(true);
       
    }//GEN-LAST:event_jButtonPesqUsuarioActionPerformed

    private void jButtonEditUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditUsuActionPerformed
       flag = 2;
        jButtonEditUsu.setEnabled(false);
        jButtonSalvarUsu.setEnabled(true);
        jButtonPesqUsuario.setEnabled(false);
        jTextFieldPesqUsuario.setEnabled(false);
        jTextFieldPesqUsuario.setText("");
        jTextFieldUsuario.setEnabled(true);   
       jPasswordFieldSenha.setEnabled(true);      
       jPasswordFieldConfSenha.setEnabled(true);  
       jComboBoxTipo.setEnabled(true);
      
        
    }//GEN-LAST:event_jButtonEditUsuActionPerformed

    private void jButtonExcluirUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirUsuActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o registro");
        if (resposta == JOptionPane.YES_OPTION) {

            usu.setCod_usu(Integer.valueOf(jLabelIdUsuario.getText()));
            try {
                mod.excluirUsu(usu);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
      jTextFieldUsuario.setEnabled(false);
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setEnabled(false);
       jPasswordFieldSenha.setText("");
       jPasswordFieldConfSenha.setEnabled(false);
       jPasswordFieldConfSenha.setText("");
       jComboBoxTipo.setEnabled(false);
       jComboBoxTipo.setSelectedIndex(0);
       jButtonPesqUsuario.setEnabled(true);
       jTextFieldPesqUsuario.setText("");       
       jTextFieldPesqUsuario.setEnabled(true);       
       jButtonNovoUsu.setEnabled(true);
       jButtonSalvarUsu.setEnabled(false);
       jButtonCancelarUsu.setEnabled(false);
       jButtonEditUsu.setEnabled(false);
       jButtonExcluirUsu.setEnabled(false);
       jLabelIdUsuario.setText("");
            try {
                preencherTabela("SELECT * FROM usuarios");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirUsuActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
            String id_usu = ""+jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0);
        try {
            coc.conect();
            coc.executaSql("SELECT * FROM usuarios WHERE usu_cod="+id_usu+"");
            coc.rs.first();
            jTextFieldUsuario.setText(coc.rs.getString("usu_nome"));
            jPasswordFieldSenha.setText(String.valueOf(coc.rs.getInt("usu_senha")));
            jPasswordFieldConfSenha.setText(String.valueOf(coc.rs.getInt("usu_senha")));
            jComboBoxTipo.setSelectedItem(coc.rs.getString("usu_tipo"));
            jLabelIdUsuario.setText(String.valueOf(coc.rs.getInt("usu_cod")));
            jButtonExcluirUsu.setEnabled(true);
            jButtonEditUsu.setEnabled(true);
            jButtonCancelarUsu.setEnabled(true);
            jTextFieldPesqUsuario.setEnabled(false);
            jButtonPesqUsuario.setEnabled(false);
            jButtonNovoUsu.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            coc.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTableUsuariosMouseClicked
   

     public void preencherTabela(String Sql) throws ClassNotFoundException, SQLException{
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Usuário","Senha","Tipo"};
        
        coc.conect();
        coc.executaSql(Sql);
        
        try{
            coc.rs.first();
            do {                
                dados.add(new Object[]{
                    coc.rs.getInt("usu_cod"),
                    coc.rs.getString("usu_nome"),
                    coc.rs.getString("usu_senha"),
                    coc.rs.getString("usu_tipo")
                });
            } while (coc.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "erro ao preencher arraylist"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableUsuarios.setModel(modelo);
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(80); // O zero significa qua é a primeira coluna do array
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(228); // O zero significa qua é a primeira coluna do array
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(121); // O zero significa qua é a primeira coluna do array
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(140); // O zero significa qua é a primeira coluna do array
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);   // não pode reordenar a tabela
        jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF); // tabela não pode redimensionada
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  // só seleciona um campo por vez
        coc.desconecta();
        
        
    }
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarUsu;
    private javax.swing.JButton jButtonEditUsu;
    private javax.swing.JButton jButtonExcluirUsu;
    private javax.swing.JButton jButtonNovoUsu;
    private javax.swing.JButton jButtonPesqUsuario;
    private javax.swing.JButton jButtonSalvarUsu;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldPesqUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
