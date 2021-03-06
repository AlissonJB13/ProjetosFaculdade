/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifpr.edu.bsi.view;

import br.ifpr.edu.bsi.bean.Classe;
//import br.ifpr.edu.bsi.bean.Filo;
import br.ifpr.edu.bsi.bean.Ordem;
//import br.ifpr.edu.bsi.bean.Reino;
import br.ifpr.edu.bsi.dao.ClasseDao;
//import br.ifpr.edu.bsi.dao.FiloDao;
import br.ifpr.edu.bsi.dao.OrdemDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FormOrdem extends javax.swing.JFrame {

     private List<Classe> listaClasse = new ArrayList<Classe>();
    private boolean salvar;
    private int id;
   
    public FormOrdem() {
        initComponents();
        preencherCombo();
        limparCampos();
        salvar = true;
    }
    
    public FormOrdem(Ordem ordem) {
        initComponents();
        jTFOrdem.setText(ordem.getNomeOrdem());
        preencherCombo();
        jCBClasse.setSelectedItem(ordem.getClasseOrdem().getNomeClasse());
        id = ordem.getIdOrdem();
        salvar = false;
    }
    
    private void preencherCombo(){
        try{
            jCBClasse.removeAllItems();
            jCBClasse.addItem("Selecione uma Classe");
            listaClasse = ClasseDao.listar();
            
            for (Classe classe : listaClasse){
                jCBClasse.addItem(classe.getNomeClasse());
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Falha no carregamento da combo");
        }
        
    }
    
    private Ordem retornaObjeto(){
        Ordem ordem = new Ordem ();
        ordem.setNomeOrdem(jTFOrdem.getText().toUpperCase());
        Classe classeSelecionada = listaClasse.get(jCBClasse.getSelectedIndex()-1); //recupera o dado selecionado pelo usuario no combo box
        ordem.setClasseOrdem(classeSelecionada);
        ordem.setIdOrdem(id);
        
        return ordem;
    }
    
    private void limparCampos(){
        jTFOrdem.setText("");
        jCBClasse.setSelectedIndex(0);
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
        jLBClasse = new javax.swing.JLabel();
        jTFOrdem = new javax.swing.JTextField();
        jBTSalvar = new javax.swing.JButton();
        jBTCancelar = new javax.swing.JButton();
        jCBClasse = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem");
        setResizable(false);

        jLBNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBNome.setText("Nome:");

        jLBClasse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBClasse.setText("Classe:");

        jBTSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/DisqueteSalvar.png"))); // NOI18N
        jBTSalvar.setText("Salvar");
        jBTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalvarActionPerformed(evt);
            }
        });

        jBTCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jBTCancelar.setText("Cancelar");
        jBTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCancelarActionPerformed(evt);
            }
        });

        jCBClasse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLBClasse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLBNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFOrdem)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jBTSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTCancelar)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBNome)
                    .addComponent(jTFOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBClasse)
                    .addComponent(jCBClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTSalvar)
                    .addComponent(jBTCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalvarActionPerformed
            try{
                if(salvar){
                OrdemDao.inserir(retornaObjeto());
                System.out.println("Salvo com sucesso");
                JOptionPane.showMessageDialog(null, "Salvo com sucesso", "salvo", JOptionPane.INFORMATION_MESSAGE);
                }else {
                OrdemDao.alterar(retornaObjeto());
                System.out.println("Editado com sucesso");
                JOptionPane.showMessageDialog(null, "Editado com sucesso", "editado", JOptionPane.INFORMATION_MESSAGE);
            }
            }catch (SQLException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Selecione uma classe", "Erro", JOptionPane.ERROR_MESSAGE);
            }
           limparCampos();
    }//GEN-LAST:event_jBTSalvarActionPerformed

    private void jBTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBTCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOrdem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JButton jBTSalvar;
    private javax.swing.JComboBox<String> jCBClasse;
    private javax.swing.JLabel jLBClasse;
    private javax.swing.JLabel jLBNome;
    private javax.swing.JTextField jTFOrdem;
    // End of variables declaration//GEN-END:variables
}
