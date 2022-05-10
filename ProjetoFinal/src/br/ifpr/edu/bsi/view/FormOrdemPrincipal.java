/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifpr.edu.bsi.view;

import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Ordem;
import br.ifpr.edu.bsi.dao.FiloDao;
import br.ifpr.edu.bsi.dao.OrdemDao;
import br.ifpr.edu.bsi.util.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FormOrdemPrincipal extends javax.swing.JFrame {
    private List<Ordem> listaOrdem = new ArrayList<Ordem>();
    
    private void atualizaTabela(){
          try 
            {
              listaOrdem = OrdemDao.pesquisar(retornaObjeto());
          
          DefaultTableModel modelo = (DefaultTableModel) jTBOrdem.getModel();
         modelo.setNumRows(0);//criacao de um modelo para permitir alteração do banco na interface
         for (Ordem ordem : listaOrdem) {
             modelo.addRow(new Object[]{//adicionar ordens presentes no banco
                ordem.getNomeOrdem(),
                ordem.getClasseOrdem().getNomeClasse()
            });
        }
          } catch (SQLException ex) {
             System.out.println("Dados não disponíveis.");
         }
    }
    
    private Ordem retornaObjeto() {
        Ordem o = new Ordem();
        o.setNomeOrdem(jTFOrdem.getText().toUpperCase());
        return o;
    }
    
    public FormOrdemPrincipal() {
        initComponents();
        atualizaTabela();
        jBTEditar.setEnabled(false);
        jBTExcluir.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTBOrdem = new javax.swing.JTable();
        jBTNovo = new javax.swing.JButton();
        jBTImprimir = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        jBTSair = new javax.swing.JButton();
        jLBOrdem = new javax.swing.JLabel();
        jTFOrdem = new javax.swing.JTextField();
        jBTEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem");

        jTBOrdem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTBOrdem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Classe"
            }
        ));
        jTBOrdem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBOrdemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBOrdem);

        jBTNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/BotaoNovo.png"))); // NOI18N
        jBTNovo.setText("Novo");
        jBTNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNovoActionPerformed(evt);
            }
        });

        jBTImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_down.png"))); // NOI18N
        jBTImprimir.setText("Relatório");
        jBTImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTImprimirActionPerformed(evt);
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

        jLBOrdem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBOrdem.setText("Ordem:");

        jTFOrdem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFOrdemKeyPressed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLBOrdem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFOrdem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBTNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTSair)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBOrdem)
                    .addComponent(jTFOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBTImprimir)
                        .addComponent(jBTExcluir)
                        .addComponent(jBTSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBTEditar)
                        .addComponent(jBTNovo)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBTImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTImprimirActionPerformed
        try {
            Relatorio.gerarRelatorio("relatorios\\relatorioordem.jasper", OrdemDao.retornaRsOrdem(retornaObjeto()));
                    } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBTImprimirActionPerformed

    private void jBTNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoActionPerformed
        new FormOrdem().setVisible(true);
    }//GEN-LAST:event_jBTNovoActionPerformed

    private void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTExcluirActionPerformed
       Ordem ordem = listaOrdem.get(jTBOrdem.getSelectedRow());
         
         int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir a ordem?");
         
         if(opcao == JOptionPane.YES_OPTION){
             try{
                 OrdemDao.excluir(ordem);
                 atualizaTabela();
             }catch (SQLException e){
                 e.printStackTrace();
         }
         }
    
    }//GEN-LAST:event_jBTExcluirActionPerformed

    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBTSairActionPerformed

    private void jTFOrdemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFOrdemKeyPressed
        atualizaTabela();
    }//GEN-LAST:event_jTFOrdemKeyPressed

    private void jTBOrdemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBOrdemMouseClicked
        jBTEditar.setEnabled(true);
        jBTExcluir.setEnabled(true);
    }//GEN-LAST:event_jTBOrdemMouseClicked

    private void jBTEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarActionPerformed
        Ordem ordem = listaOrdem.get(jTBOrdem.getSelectedRow());
        new FormOrdem(ordem).setVisible(true);
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
            java.util.logging.Logger.getLogger(FormOrdemPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOrdemPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOrdemPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOrdemPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOrdemPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTEditar;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTImprimir;
    private javax.swing.JButton jBTNovo;
    private javax.swing.JButton jBTSair;
    private javax.swing.JLabel jLBOrdem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTBOrdem;
    private javax.swing.JTextField jTFOrdem;
    // End of variables declaration//GEN-END:variables
}
