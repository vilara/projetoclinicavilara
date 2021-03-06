/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import util.ConexaoBD;
import dao.DaoMedico;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.BeansMedico;
import model.ModeloTabela;

/**
 *
 * @author MarceloMartinsVilara
 */
public class FormMedico extends javax.swing.JFrame {

    BeansMedico mod = new BeansMedico();
    DaoMedico controle = new DaoMedico();
    ConexaoBD con = new ConexaoBD();
    int flag = 0;

    //  ConexaoBD conecta = new ConexaoBD();
    /**
     * Creates new form FormMedico
     */
    public FormMedico() throws ClassNotFoundException, SQLException {
        initComponents();
        preencherTabela("SELECT * FROM medicos");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCadNomeMed = new javax.swing.JTextField();
        jTextFieldCadCrmMed = new javax.swing.JTextField();
        jComboBoxEspecialidadeMed = new javax.swing.JComboBox();
        jButtonCadNovoMed = new javax.swing.JButton();
        jButtonSalvarMed = new javax.swing.JButton();
        jButtonCancelarMed = new javax.swing.JButton();
        jButtonEditMed = new javax.swing.JButton();
        jButtonExcluirMed = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisarMed = new javax.swing.JButton();
        jTextFieldIdMedico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("NOME");

        jLabel3.setText("CRM");

        jLabel4.setText("ESPECIALIDADE");

        jTextFieldCadNomeMed.setEnabled(false);

        jTextFieldCadCrmMed.setEnabled(false);

        jComboBoxEspecialidadeMed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pediatra", "Ginecologista", "Cardiologista", "Urologista", "Alergista", "Dermatologista" }));
        jComboBoxEspecialidadeMed.setEnabled(false);
        jComboBoxEspecialidadeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadeMedActionPerformed(evt);
            }
        });

        jButtonCadNovoMed.setText("NOVO");
        jButtonCadNovoMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoMedActionPerformed(evt);
            }
        });

        jButtonSalvarMed.setText("SALVAR");
        jButtonSalvarMed.setEnabled(false);
        jButtonSalvarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarMedActionPerformed(evt);
            }
        });

        jButtonCancelarMed.setText("CANCELAR");
        jButtonCancelarMed.setEnabled(false);
        jButtonCancelarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMedActionPerformed(evt);
            }
        });

        jButtonEditMed.setText("EDITAR");
        jButtonEditMed.setEnabled(false);
        jButtonEditMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditMedActionPerformed(evt);
            }
        });

        jButtonExcluirMed.setText("EXCLUIR");
        jButtonExcluirMed.setEnabled(false);
        jButtonExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirMedActionPerformed(evt);
            }
        });

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jButtonPesquisarMed.setText("Pesquisar");
        jButtonPesquisarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMedActionPerformed(evt);
            }
        });

        jTextFieldIdMedico.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelarMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadNovoMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluirMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCadNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEspecialidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCadCrmMed, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonPesquisarMed))
                            .addComponent(jTextFieldIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextFieldIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCadNovoMed)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonSalvarMed)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldCadCrmMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldCadNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jComboBoxEspecialidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelarMed))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisarMed)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEditMed)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirMed))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE MÉDICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(308, 308, 308))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );

        setSize(new java.awt.Dimension(962, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEspecialidadeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadeMedActionPerformed

    private void jButtonSalvarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarMedActionPerformed
        if(jTextFieldCadNomeMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher o campo nome!");
            jTextFieldCadNomeMed.requestFocus();
        }else if(jTextFieldCadCrmMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher o campo CRM!");
            jTextFieldCadCrmMed.requestFocus();
        }
        else if (flag == 1) {   // caso o comando seja inserir novo registro         

            mod.setNome(jTextFieldCadNomeMed.getText());
            mod.setEspecialidade((String) jComboBoxEspecialidadeMed.getSelectedItem());
            int crm = Integer.valueOf(jTextFieldCadCrmMed.getText());
            mod.setCrm(crm);

            try {
                controle.salvar(mod);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldCadNomeMed.setEnabled(false);
            jTextFieldCadNomeMed.setText("");
            jTextFieldCadCrmMed.setEnabled(false);
            jTextFieldCadCrmMed.setText("");
            jTextFieldIdMedico.setText("");
            jTextFieldPesquisa.setEnabled(true);
            jButtonPesquisarMed.setEnabled(true);
            jComboBoxEspecialidadeMed.setSelectedIndex(0);
            jComboBoxEspecialidadeMed.setEnabled(false);
            jButtonSalvarMed.setEnabled(false);
            jButtonCancelarMed.setEnabled(false);
            try {
                preencherTabela("SELECT * FROM medicos");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (flag == 2) {  // caso para o comando de editar registro
            mod.setCod(Integer.valueOf(jTextFieldIdMedico.getText()));
            mod.setCrm(Integer.valueOf(jTextFieldCadCrmMed.getText()));
            mod.setEspecialidade((String) jComboBoxEspecialidadeMed.getSelectedItem());
            mod.setNome(jTextFieldCadNomeMed.getText());
            try {
                controle.editar(mod);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldCadNomeMed.setEnabled(false);
            jTextFieldCadNomeMed.setText("");
            jTextFieldCadCrmMed.setEnabled(false);
            jTextFieldCadCrmMed.setText("");
            jTextFieldIdMedico.setText("");
            jComboBoxEspecialidadeMed.setSelectedIndex(0);
            jComboBoxEspecialidadeMed.setEnabled(false);
            jButtonSalvarMed.setEnabled(false);
            jButtonCancelarMed.setEnabled(false);
            jButtonCadNovoMed.setEnabled(true);
            jTextFieldPesquisa.setEnabled(true);
            jButtonPesquisarMed.setEnabled(true);
            try {
                preencherTabela("SELECT * FROM medicos");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButtonSalvarMedActionPerformed

    private void jButtonCadNovoMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoMedActionPerformed
        flag = 1;
        jTextFieldPesquisa.setEnabled(false);
        jTextFieldCadNomeMed.setEnabled(true);
        jTextFieldCadNomeMed.setText("");
        jTextFieldCadCrmMed.setEnabled(true);
        jTextFieldCadCrmMed.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldIdMedico.setText("");
        jButtonPesquisarMed.setEnabled(false);
        jButtonCancelarMed.setEnabled(true);
        jComboBoxEspecialidadeMed.setEnabled(true);
        jComboBoxEspecialidadeMed.setSelectedIndex(0);
        jButtonSalvarMed.setEnabled(true);
        jButtonEditMed.setEnabled(false);
        jButtonExcluirMed.setEnabled(false);

    }//GEN-LAST:event_jButtonCadNovoMedActionPerformed

    private void jButtonPesquisarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMedActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(jTextFieldPesquisa.getText());
        try {
            BeansMedico model = controle.buscaMedico(mod);
            jTextFieldIdMedico.setText(String.valueOf(mod.getCod()));
            jTextFieldCadNomeMed.setText(model.getNome());
            jComboBoxEspecialidadeMed.setSelectedItem(model.getEspecialidade());
            jTextFieldCadCrmMed.setText(String.valueOf(model.getCrm()));
            
            preencherTabela("SELECT * FROM medicos WHERE nome_medico like '%"+jTextFieldPesquisa.getText()+"%'");
            
            
            jButtonEditMed.setEnabled(true);
            jButtonExcluirMed.setEnabled(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextFieldCadCrmMed.setEnabled(false);
        jTextFieldCadNomeMed.setEnabled(false);
        jComboBoxEspecialidadeMed.setEnabled(false);
        jButtonSalvarMed.setEnabled(false);
        jButtonCancelarMed.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarMedActionPerformed

    private void jButtonCancelarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMedActionPerformed
        // TODO add your handling code here:
        jTextFieldCadNomeMed.setEnabled(!true);
        jTextFieldCadNomeMed.setText("");
        jTextFieldCadCrmMed.setEnabled(!true);
        jTextFieldCadCrmMed.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldIdMedico.setText("");
        jButtonCancelarMed.setEnabled(!true);
        jComboBoxEspecialidadeMed.setEnabled(!true);
        jComboBoxEspecialidadeMed.setSelectedIndex(0);
        jButtonSalvarMed.setEnabled(!true);
        jButtonEditMed.setEnabled(false);
        jButtonExcluirMed.setEnabled(false);
        jButtonCadNovoMed.setEnabled(true);
        jButtonPesquisarMed.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarMedActionPerformed

    private void jButtonEditMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditMedActionPerformed
        // TODO add your handling code here:
        flag = 2;
        jButtonEditMed.setEnabled(false);
        jButtonExcluirMed.setEnabled(true);
        jButtonCadNovoMed.setEnabled(false);
        jTextFieldCadNomeMed.setEnabled(true);
        jTextFieldCadCrmMed.setEnabled(true);
        jComboBoxEspecialidadeMed.setEnabled(true);
        jButtonSalvarMed.setEnabled(true);
        jButtonCancelarMed.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);
        jTextFieldPesquisa.setText("");
        jButtonPesquisarMed.setEnabled(false);
    }//GEN-LAST:event_jButtonEditMedActionPerformed

    private void jButtonExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirMedActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o registro");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCod(Integer.valueOf(jTextFieldIdMedico.getText()));
            try {
                controle.excluir(mod);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldCadNomeMed.setEnabled(false);
            jTextFieldCadNomeMed.setText("");
            jTextFieldCadCrmMed.setEnabled(false);
            jTextFieldCadCrmMed.setText("");
            jTextFieldIdMedico.setText("");
            jComboBoxEspecialidadeMed.setSelectedIndex(0);
            jComboBoxEspecialidadeMed.setEnabled(false);
            jButtonSalvarMed.setEnabled(false);
            jButtonEditMed.setEnabled(false);
            jButtonCancelarMed.setEnabled(false);
            jButtonExcluirMed.setEnabled(false);
            jButtonCadNovoMed.setEnabled(true);
            jTextFieldPesquisa.setEnabled(true);
            jButtonPesquisarMed.setEnabled(true);
            try {
                preencherTabela("SELECT * FROM medicos");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonExcluirMedActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        String id_medico = ""+jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0);
        try {
            con.conect();
            con.executaSql("SELECT * FROM medicos WHERE idMedicos="+id_medico+"");
            con.rs.first();
            jTextFieldCadNomeMed.setText(con.rs.getString("nome_medico"));
            jTextFieldIdMedico.setText(String.valueOf(con.rs.getInt("idMedicos")));
            jTextFieldCadCrmMed.setText(String.valueOf(con.rs.getInt("crm_medico")));
            jComboBoxEspecialidadeMed.setSelectedItem(con.rs.getString("especialidade_medico"));
            jButtonExcluirMed.setEnabled(true);
            jButtonEditMed.setEnabled(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableMedicosMouseClicked

   
    public void preencherTabela(String Sql) throws ClassNotFoundException, SQLException{
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Nome","Especialidade","CRM"};
        
        con.conect();
        con.executaSql(Sql);
        
        try{
            con.rs.first();
            do {                
                dados.add(new Object[]{
                    con.rs.getInt("idMedicos"),
                    con.rs.getString("nome_medico"),
                    con.rs.getString("especialidade_medico"),
                    con.rs.getInt("crm_medico")
                });
            } while (con.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "erro ao preencher arraylist"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableMedicos.setModel(modelo);
        jTableMedicos.getColumnModel().getColumn(0).setPreferredWidth(80); // O zero significa qua é a primeira coluna do array
        jTableMedicos.getColumnModel().getColumn(0).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableMedicos.getColumnModel().getColumn(1).setPreferredWidth(228); // O zero significa qua é a primeira coluna do array
        jTableMedicos.getColumnModel().getColumn(1).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableMedicos.getColumnModel().getColumn(2).setPreferredWidth(80); // O zero significa qua é a primeira coluna do array
        jTableMedicos.getColumnModel().getColumn(2).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableMedicos.getColumnModel().getColumn(3).setPreferredWidth(120); // O zero significa qua é a primeira coluna do array
        jTableMedicos.getColumnModel().getColumn(3).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableMedicos.getTableHeader().setReorderingAllowed(false);   // não pode reordenar a tabela
        jTableMedicos.setAutoResizeMode(jTableMedicos.AUTO_RESIZE_OFF); // tabela não pode redimensionada
        jTableMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  // só seleciona um campo por vez
        con.desconecta();
        
       
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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormMedico().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FormMedico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadNovoMed;
    private javax.swing.JButton jButtonCancelarMed;
    private javax.swing.JButton jButtonEditMed;
    private javax.swing.JButton jButtonExcluirMed;
    private javax.swing.JButton jButtonPesquisarMed;
    private javax.swing.JButton jButtonSalvarMed;
    private javax.swing.JComboBox jComboBoxEspecialidadeMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldCadCrmMed;
    private javax.swing.JTextField jTextFieldCadNomeMed;
    private javax.swing.JTextField jTextFieldIdMedico;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
