
import java.awt.Color;
import javax.swing.JOptionPane;


public class DilPuaniFrame extends javax.swing.JFrame {

    DilBolumu dilBolumu = new DilBolumu();
    
    public DilPuaniFrame() {
        initComponents();
        baslangictaCalis();
    }

    private void baslangictaCalis()
    {
        dilBolumu.verileriSifirla(dilPuanPanel);             
        dilBolumu.allKeyTyped(dilPuanPanel);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dilPuanPanel = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        dilNetField = new javax.swing.JTextField();
        dilYanlisField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sonuclariGorButton = new javax.swing.JButton();
        dilDogruField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        uyariMesajiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DİL Puanı Hesaplama Ekranı");
        setBounds(new java.awt.Rectangle(650, 270, 0, 0));
        setResizable(false);

        dilPuanPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel43.setText("DOĞRU");

        jLabel44.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel44.setText("YANLIŞ");

        jLabel45.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel45.setText(" NET");

        dilNetField.setEditable(false);

        dilYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dilYanlisFieldKeyReleased(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel42.setText("DİL                                   80 Soru :");

        jLabel14.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("DİL PUANI");

        sonuclariGorButton.setBackground(new java.awt.Color(255, 153, 153));
        sonuclariGorButton.setFont(new java.awt.Font("Source Sans Pro", 1, 16)); // NOI18N
        sonuclariGorButton.setText("SONUÇLARI GÖR");
        sonuclariGorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sonuclariGorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sonuclariGorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sonuclariGorButtonMouseExited(evt);
            }
        });
        sonuclariGorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonuclariGorButtonActionPerformed(evt);
            }
        });

        dilDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dilDogruFieldKeyReleased(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setText("YABANCI DİL");

        uyariMesajiLabel.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout dilPuanPanelLayout = new javax.swing.GroupLayout(dilPuanPanel);
        dilPuanPanel.setLayout(dilPuanPanelLayout);
        dilPuanPanelLayout.setHorizontalGroup(
            dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dilPuanPanelLayout.createSequentialGroup()
                .addGroup(dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dilPuanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uyariMesajiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dilPuanPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dilPuanPanelLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dilPuanPanelLayout.createSequentialGroup()
                                        .addComponent(dilDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dilYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dilNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dilPuanPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel44)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel45)))))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dilPuanPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sonuclariGorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        dilPuanPanelLayout.setVerticalGroup(
            dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dilPuanPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addGap(40, 40, 40)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dilPuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dilDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dilYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dilNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uyariMesajiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sonuclariGorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dilPuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dilPuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void dilIslemleri()
    {
        dilBolumu.dogruYanlisGonder(dilDogruField, dilYanlisField);
        dilBolumu.dilNetHesapla(dilNetField, uyariMesajiLabel);
    }
    private void dilDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dilDogruFieldKeyReleased
        dilIslemleri();
    }//GEN-LAST:event_dilDogruFieldKeyReleased

    private void dilYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dilYanlisFieldKeyReleased
        dilIslemleri();
    }//GEN-LAST:event_dilYanlisFieldKeyReleased

    
    
    Color sonuclariGorOriginalBgColor;
    private void sonuclariGorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonuclariGorButtonMouseEntered
        sonuclariGorOriginalBgColor = sonuclariGorButton.getBackground();
        sonuclariGorButton.setBackground(Color.darkGray);
        sonuclariGorButton.setForeground(Color.white);
    }//GEN-LAST:event_sonuclariGorButtonMouseEntered

    private void sonuclariGorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonuclariGorButtonMouseExited
        sonuclariGorButton.setBackground(sonuclariGorOriginalBgColor);
        sonuclariGorButton.setForeground(Color.black);
    }//GEN-LAST:event_sonuclariGorButtonMouseExited

    private void sonuclariGorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuclariGorButtonActionPerformed
        if(uyariMesajiLabel.getText().equals(""))
        {
            setVisible(false);
            SonuclarFrame sonuclarFrame = new SonuclarFrame();
            sonuclarFrame.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this, "Lütfen Uyarıları Dikkate Alarak İşlem Yapınız");
    }//GEN-LAST:event_sonuclariGorButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(DilPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DilPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DilPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DilPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DilPuaniFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dilDogruField;
    private javax.swing.JTextField dilNetField;
    private javax.swing.JPanel dilPuanPanel;
    private javax.swing.JTextField dilYanlisField;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JButton sonuclariGorButton;
    private javax.swing.JLabel uyariMesajiLabel;
    // End of variables declaration//GEN-END:variables
}
