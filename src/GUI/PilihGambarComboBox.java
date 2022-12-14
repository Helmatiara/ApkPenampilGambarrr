/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarComboBox() {
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

        imagePanel = new javax.swing.JPanel();
        LbBatik2 = new javax.swing.JLabel();
        LbBatik3 = new javax.swing.JLabel();
        LbBatik1 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        pSpider = new javax.swing.JLabel();
        Pilihan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        imagePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagePanel.setLayout(new java.awt.CardLayout());

        LbBatik2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbBatik2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/batik-2.jpg"))); // NOI18N
        imagePanel.add(LbBatik2, "1");

        LbBatik3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbBatik3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/batik-3.jpg"))); // NOI18N
        imagePanel.add(LbBatik3, "2");

        LbBatik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbBatik1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/batik-1.jpg"))); // NOI18N
        LbBatik1.setToolTipText("");
        LbBatik1.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(LbBatik1, "0");

        pSpider.setText("Pilih Gambar");
        buttonPanel.add(pSpider);

        Pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batik1", "Batik2", "Batik3" }));
        Pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihanActionPerformed(evt);
            }
        });
        buttonPanel.add(Pilihan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihanActionPerformed
        CardLayout cl  = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel,String.valueOf(Pilihan.getSelectedIndex()));
    }//GEN-LAST:event_PilihanActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbBatik1;
    private javax.swing.JLabel LbBatik2;
    private javax.swing.JLabel LbBatik3;
    private javax.swing.JComboBox<String> Pilihan;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel pSpider;
    // End of variables declaration//GEN-END:variables
}
