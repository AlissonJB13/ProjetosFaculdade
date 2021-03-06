/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifpr.edu.bsi.view;

/**
 *
 * @author User
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMMenu = new javax.swing.JMenu();
        jMIReino1 = new javax.swing.JMenuItem();
        jMIFilo1 = new javax.swing.JMenuItem();
        jMIClasse1 = new javax.swing.JMenuItem();
        jMIOrdem1 = new javax.swing.JMenuItem();
        jMIFamilia = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Manual de identificação, classificação e caracterização de famílias biológicas");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Dropbox\\Sistemas\\Semestre 4\\Prog III\\ProjetoFinal\\icones\\1-1.jpg")); // NOI18N

        jMenuBar1.setToolTipText("");

        jMMenu.setText("Menu");

        jMIReino1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIReino1.setText("Reino");
        jMIReino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReino1ActionPerformed(evt);
            }
        });
        jMMenu.add(jMIReino1);

        jMIFilo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIFilo1.setText("Filo");
        jMIFilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFilo1ActionPerformed(evt);
            }
        });
        jMMenu.add(jMIFilo1);

        jMIClasse1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIClasse1.setText("Classe");
        jMIClasse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClasse1ActionPerformed(evt);
            }
        });
        jMMenu.add(jMIClasse1);

        jMIOrdem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIOrdem1.setText("Ordem");
        jMIOrdem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOrdem1ActionPerformed(evt);
            }
        });
        jMMenu.add(jMIOrdem1);

        jMIFamilia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIFamilia.setText("Família");
        jMIFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFamiliaActionPerformed(evt);
            }
        });
        jMMenu.add(jMIFamilia);

        jMenuBar1.add(jMMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //fuções para abrir as telas principais
    private void jMIReino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReino1ActionPerformed
        new FormReinoPrincipal().setVisible(true);
    }//GEN-LAST:event_jMIReino1ActionPerformed

    private void jMIClasse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClasse1ActionPerformed
        new FormClassePrincipal().setVisible(true);
    }//GEN-LAST:event_jMIClasse1ActionPerformed

    private void jMIFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFamiliaActionPerformed
        new FormFamiliaPrincipal().setVisible(true);
    }//GEN-LAST:event_jMIFamiliaActionPerformed

    private void jMIFilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFilo1ActionPerformed
        new FormFiloPrincipal().setVisible(true);
    }//GEN-LAST:event_jMIFilo1ActionPerformed

    private void jMIOrdem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOrdem1ActionPerformed
        new FormOrdemPrincipal().setVisible(true);
    }//GEN-LAST:event_jMIOrdem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMIClasse1;
    private javax.swing.JMenuItem jMIFamilia;
    private javax.swing.JMenuItem jMIFilo1;
    private javax.swing.JMenuItem jMIOrdem1;
    private javax.swing.JMenuItem jMIReino1;
    private javax.swing.JMenu jMMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
