/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifpr.edu.bsi.view;

import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Ordem;
import br.ifpr.edu.bsi.dao.FiloDao;
import br.ifpr.edu.bsi.view.FormFilo;
import br.ifpr.edu.bsi.bean.Reino;
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
public class FormFiloPrincipal extends javax.swing.JFrame {
    private List<Filo> listaFilo = new ArrayList<Filo>();
    
    private void atualizaTabela(){
          try 
            {
              listaFilo = FiloDao.pesquisar(retornaObjeto());
          
          DefaultTableModel modelo = (DefaultTableModel) jTBFilo.getModel();
         modelo.setNumRows(0);//criacao de um modelo para permitir alteração do banco na interface
         for (Filo filo : listaFilo) {
             modelo.addRow(new Object[]{//adicionar filos presentes no banco
                 filo.getNomeFilo(),
                 filo.getReinoFilo().getNomeReino()
            });
        }
          } catch (SQLException ex) {
             System.out.println("Dados não disponíveis.");
         }
    }
    
    private Filo retornaObjeto() {
        Filo f = new Filo();
        f.setNomeFilo(jTFFilo.getText().toUpperCase());
        return f;

     

        
    }
    
    public FormFiloPrincipal() {
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

        jBTNovo = new javax.swing.JButton();
        jBTImprimir = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        jBTSair = new javax.swing.JButton();
        jLBFilo = new javax.swing.JLabel();
        jTFFilo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBFilo = new javax.swing.JTable();
        jBTEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filo");

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

        jLBFilo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBFilo.setText("Filo:");

        jTFFilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFiloActionPerformed(evt);
            }
        });
        jTFFilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFFiloKeyPressed(evt);
            }
        });

        jTBFilo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTBFilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Reino"
            }
        ));
        jTBFilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBFiloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBFilo);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBTNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTSair)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLBFilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFFilo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBFilo)
                    .addComponent(jTFFilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
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

    private void jTFFiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFiloActionPerformed

    private void jBTImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTImprimirActionPerformed
       try {
            Relatorio.gerarRelatorio("relatorios\\relatoriofilo.jasper", FiloDao.retornaRsFilo(retornaObjeto()));
                    } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBTImprimirActionPerformed

    private void jBTNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoActionPerformed
        new FormFilo().setVisible(true);
    }//GEN-LAST:event_jBTNovoActionPerformed

    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBTSairActionPerformed

    private void jTFFiloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiloKeyPressed
        atualizaTabela();
    }//GEN-LAST:event_jTFFiloKeyPressed

    private void jTBFiloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBFiloMouseClicked
        jBTEditar.setEnabled(true);
        jBTExcluir.setEnabled(true);
    }//GEN-LAST:event_jTBFiloMouseClicked

    private void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTExcluirActionPerformed
        Filo filo = listaFilo.get(jTBFilo.getSelectedRow());
         
         int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o filo?");
         
         if(opcao == JOptionPane.YES_OPTION){
             try{
                 FiloDao.excluir(filo);
                 atualizaTabela();
             }catch (SQLException e){
                 e.printStackTrace();
         }
         }
    }//GEN-LAST:event_jBTExcluirActionPerformed

    private void jBTEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarActionPerformed
        Filo filo = listaFilo.get(jTBFilo.getSelectedRow());
        new FormFilo(filo).setVisible(true);
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
            java.util.logging.Logger.getLogger(FormFiloPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFiloPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFiloPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFiloPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFiloPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTEditar;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTImprimir;
    private javax.swing.JButton jBTNovo;
    private javax.swing.JButton jBTSair;
    private javax.swing.JLabel jLBFilo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTBFilo;
    private javax.swing.JTextField jTFFilo;
    // End of variables declaration//GEN-END:variables
}
