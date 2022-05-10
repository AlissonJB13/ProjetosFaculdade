/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifpr.edu.bsi.view;

import br.ifpr.edu.bsi.bean.Reino;
import br.ifpr.edu.bsi.dao.ReinoDao;
import br.ifpr.edu.bsi.util.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FormReinoPrincipal extends javax.swing.JFrame {

    private List<Reino> listaReino = new ArrayList<Reino>();
     //Creates new form FormReinoPrincipal;
     
    private void atualizaTabela() {//metodo para atualização da tabela

         try {
             listaReino = ReinoDao.pesquisar(retornaObjeto());//pegando oq tem no banco de dados
        
         DefaultTableModel modelo = (DefaultTableModel) jTBReino.getModel();
         modelo.setNumRows(0);//criacao de um modelo para permitir alteração do banco na interface
         for (Reino reino : listaReino) {
             modelo.addRow(new Object[]{//adicionar reino presentes no banco
                 reino.getNomeReino(),
                 
             });
         }
          } catch (SQLException ex) {
             System.out.println("Dados não disponíveis.");
         }
    }

    private Reino retornaObjeto() {
        Reino r = new Reino();
        r.setNomeReino(jTFReino.getText().toUpperCase());
        return r;
    }
    
    public FormReinoPrincipal() {
        initComponents();
        atualizaTabela();
        jBTEditar.setEnabled(false);
        jBTExcluir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBNome = new javax.swing.JLabel();
        jTFReino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBReino = new javax.swing.JTable();
        jBTNovo = new javax.swing.JButton();
        jBTRelatorio = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        jBTSair = new javax.swing.JButton();
        jBTEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reino");

        jLBNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBNome.setText("Nome:");

        jTFReino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFReinoActionPerformed(evt);
            }
        });
        jTFReino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFReinoKeyTyped(evt);
            }
        });

        jTBReino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTBReino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jTBReino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBReinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBReino);

        jBTNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/BotaoNovo.png"))); // NOI18N
        jBTNovo.setText("Novo");
        jBTNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNovoActionPerformed(evt);
            }
        });

        jBTRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_down.png"))); // NOI18N
        jBTRelatorio.setText("Relatorio");
        jBTRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRelatorioActionPerformed(evt);
            }
        });

        jBTExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jBTExcluir.setText("Excluir");
        jBTExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTExcluirActionPerformed(evt);
            }
        });

        jBTSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jBTSair.setText("Sair");
        jBTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSairActionPerformed(evt);
            }
        });

        jBTEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/BotaoEditar.png"))); // NOI18N
        jBTEditar.setText("Editar");
        jBTEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBTNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTSair)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLBNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFReino)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBNome)
                    .addComponent(jTFReino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTNovo)
                    .addComponent(jBTRelatorio)
                    .addComponent(jBTExcluir)
                    .addComponent(jBTSair)
                    .addComponent(jBTEditar))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBTRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRelatorioActionPerformed
        try {
            Relatorio.gerarRelatorio("relatorios\\relatorioreino.jasper", ReinoDao.retornaRsReino(retornaObjeto()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBTRelatorioActionPerformed

    private void jBTNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoActionPerformed
        new FormReino().setVisible(true);
    }//GEN-LAST:event_jBTNovoActionPerformed

    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBTSairActionPerformed

    private void jTFReinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFReinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFReinoActionPerformed

    private void jTFReinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFReinoKeyTyped
        atualizaTabela();
    }//GEN-LAST:event_jTFReinoKeyTyped

    private void jTBReinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBReinoMouseClicked
        jBTEditar.setEnabled(true);
        jBTExcluir.setEnabled(true);
    }//GEN-LAST:event_jTBReinoMouseClicked

    private void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTExcluirActionPerformed
        Reino reino = listaReino.get(jTBReino.getSelectedRow());
         
         int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o reino");
         
         if(opcao == JOptionPane.YES_OPTION){
             try{
                 ReinoDao.excluir(reino);
                 atualizaTabela();
             }catch (SQLException e){
                 e.printStackTrace();
         }
         }
    }//GEN-LAST:event_jBTExcluirActionPerformed

    private void jBTEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarActionPerformed
        Reino reino = listaReino.get(jTBReino.getSelectedRow()); //pegar a linha selecionada
        new FormReino(reino).setVisible(true);
    }//GEN-LAST:event_jBTEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FormReinoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReinoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReinoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReinoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReinoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTEditar;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTNovo;
    private javax.swing.JButton jBTRelatorio;
    private javax.swing.JButton jBTSair;
    private javax.swing.JLabel jLBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTBReino;
    private javax.swing.JTextField jTFReino;
    // End of variables declaration//GEN-END:variables
}
