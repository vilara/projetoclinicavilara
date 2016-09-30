/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import static core.FormAgendamento.listaMedico;
import static core.FormPaciente.listaEstado;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModeloTabela;
import util.ConexaoBD;

/**
 *
 * @author MarceloMartinsVilara
 */
public class FormAgendaMedico extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();

    // esta lista será utilizada para armazenar os id dos estados 
    static ArrayList listaMedico = new ArrayList();

    String dtHoje;
    String status;

    /**
     * Creates new form FormAgendaMedico
     */
    public FormAgendaMedico() throws ClassNotFoundException, SQLException {
        initComponents();

        preencherMedico();

    }

    public void preencherMedico() throws ClassNotFoundException, SQLException {
        conecta.conect();
        conecta.executaSql("SELECT * FROM medicos ORDER BY nome_medico");
        jComboBoxMedicos.addItem("Selecione o médico...");
        conecta.rs.first();
        do {
            jComboBoxMedicos.addItem(conecta.rs.getString("nome_medico")); // preenchimento automático do combobox de bairros buscando do banco de dados
            listaMedico.add(conecta.rs.getInt("idMedicos")); // seleciona o id do campo escolhido
        } while (conecta.rs.next());
        conecta.desconecta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxMedicos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendaPaciente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("AGENDA MÉDICO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedicosActionPerformed(evt);
            }
        });

        jLabel2.setText("Médicos:");

        jTableAgendaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAgendaPaciente);

        jButton1.setText("Atender");

        jLabel3.setText("Agendamento paciente");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(903, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        try {
            Calendar data = Calendar.getInstance();
            Date d = data.getTime();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            dateformat.format(d);
            
            dtHoje = dateformat.format(d); // data de hoje
            
            status = "Atendimento";
            
            // pega o índice da lista baseado no index do combobox menos 1 e insere na lista que armazena os id dos estados
            int idMedico = (int) listaMedico.get(jComboBoxMedicos.getSelectedIndex() - 1);
            
            //  JOptionPane.showMessageDialog(null, dtHoje);
            preencherTabela("SELECT * FROM projetoclinicavilara.agendamento INNER JOIN pacientes "
                    + "ON agendamento.agenda_codpac = pacientes.idPaciente INNER JOIN medicos "
                    + "ON agendamento.agenda_codmedico = medicos.idMedicos "
                    + "WHERE agendamento.agenda_data = '"+dtHoje+"' "
                    + "AND agendamento.agenda_codmedico = "+idMedico+" "
                    + "AND agendamento.agenda_status = '"+status+"'");
        } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "Não existe atendimento para hoje");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe atendimento para hoje");
        }


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jComboBoxMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMedicosActionPerformed

    public void preencherTabela(String Sql) throws ClassNotFoundException, SQLException {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome Paciente", "Turno", "Data", "Status", "Médico"};

        conecta.conect();
        conecta.executaSql(Sql);

        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{
                    conecta.rs.getInt("idAgenda"),
                    conecta.rs.getString("pac_nome"),
                    conecta.rs.getString("agenda_turno"),
                    conecta.rs.getString("agenda_data"),
                    conecta.rs.getString("agenda_status"),
                    conecta.rs.getString("nome_medico"),});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe atendimento para este médico!");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        jTableAgendaPaciente.setModel(modelo);
        jTableAgendaPaciente.getColumnModel().getColumn(0).setPreferredWidth(60); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(0).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableAgendaPaciente.getColumnModel().getColumn(1).setPreferredWidth(228); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(1).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableAgendaPaciente.getColumnModel().getColumn(2).setPreferredWidth(80); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(2).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableAgendaPaciente.getColumnModel().getColumn(3).setPreferredWidth(85); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(3).setResizable(false);    // não pode ser modificado o tamanho da coluna

        jTableAgendaPaciente.getColumnModel().getColumn(4).setPreferredWidth(105); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(4).setResizable(false);    // não pode ser modificado o tamanho da coluna

        jTableAgendaPaciente.getColumnModel().getColumn(5).setPreferredWidth(138); // O zero significa qua é a primeira coluna do array
        jTableAgendaPaciente.getColumnModel().getColumn(5).setResizable(false);    // não pode ser modificado o tamanho da coluna
        jTableAgendaPaciente.getTableHeader().setReorderingAllowed(false);   // não pode reordenar a tabela
        jTableAgendaPaciente.setAutoResizeMode(jTableAgendaPaciente.AUTO_RESIZE_OFF); // tabela não pode redimensionada
        jTableAgendaPaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  // só seleciona um campo por vez
        conecta.desconecta();

    }

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
            java.util.logging.Logger.getLogger(FormAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormAgendaMedico().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormAgendaMedico.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FormAgendaMedico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox jComboBoxMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgendaPaciente;
    // End of variables declaration//GEN-END:variables
}
