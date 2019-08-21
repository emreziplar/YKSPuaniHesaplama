
import java.awt.Color;
import javax.swing.JOptionPane;

public class OBPFrame extends javax.swing.JFrame {
   
    public static float obp;

    public float getObp() {
        return obp;
    }
   
    
    public OBPFrame() {
        initComponents();     
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obpNotuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        basariPuaniField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        diplomaNotuField = new javax.swing.JTextField();
        obpEkleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OBP Hesaplama Ekranı");
        setBounds(new java.awt.Rectangle(650, 270, 0, 0));
        setResizable(false);

        obpNotuPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("ORTALAMA BAŞARI PUANI");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel2.setText("Diploma Notunu Yazın (0-100)       :");
        jLabel2.setFocusable(false);
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel3.setText("Ortaöğretim Başarı Puanınız(OBP):");
        jLabel3.setOpaque(true);

        basariPuaniField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(226, 6, 49));
        jLabel4.setText("Not : OBP sınav sonucunuza eklenecek puandır.");

        diplomaNotuField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diplomaNotuFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diplomaNotuFieldKeyTyped(evt);
            }
        });

        obpEkleButton.setBackground(new java.awt.Color(156, 113, 255));
        obpEkleButton.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        obpEkleButton.setText("OBP EKLE");
        obpEkleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obpEkleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obpEkleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                obpEkleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                obpEkleButtonMouseExited(evt);
            }
        });
        obpEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obpEkleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout obpNotuPanelLayout = new javax.swing.GroupLayout(obpNotuPanel);
        obpNotuPanel.setLayout(obpNotuPanelLayout);
        obpNotuPanelLayout.setHorizontalGroup(
            obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obpNotuPanelLayout.createSequentialGroup()
                .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(obpNotuPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, obpNotuPanelLayout.createSequentialGroup()
                                    .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(diplomaNotuField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(basariPuaniField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4)))
                    .addGroup(obpNotuPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(obpEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        obpNotuPanelLayout.setVerticalGroup(
            obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obpNotuPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diplomaNotuField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(obpNotuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basariPuaniField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(obpEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(obpNotuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(obpNotuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diplomaNotuFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diplomaNotuFieldKeyReleased
      
        String diplomaNotuText = diplomaNotuField.getText();
        
        if(!diplomaNotuText.equals("") && diplomaNotuText.charAt(0) != '.') //Eger Diploma Notu Alanimizin ici bos degilse 
        {                                                                   //ve ilk karakteri nokta degilse 
            float diplomaNotu = Float.valueOf(diplomaNotuText);

            if(diplomaNotu > 100) 
                diplomaNotu=100;

            this.obp = (diplomaNotu*5) * 0.12f; //basari puani hesaplama
            basariPuaniField.setText(String.valueOf(this.obp));            
        }
        else
        {
            this.obp = 0;
            basariPuaniField.setText(String.valueOf(this.obp));            
        }
    }//GEN-LAST:event_diplomaNotuFieldKeyReleased

    private void diplomaNotuFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diplomaNotuFieldKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c) && c != '.') 
            evt.consume();

    }//GEN-LAST:event_diplomaNotuFieldKeyTyped

    private void obpEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obpEkleButtonActionPerformed
        String basariPuani = basariPuaniField.getText();

        if(basariPuani.equals(""))
        JOptionPane.showMessageDialog(this, "Ortalama Başarı Puanınız Boş Olamaz");
        else
        {
            setVisible(false);
            TYTPuaniFrame tytPuaniFrame = new TYTPuaniFrame();
            tytPuaniFrame.setVisible(true);
        }

    }//GEN-LAST:event_obpEkleButtonActionPerformed
      
    private Color obpEkleButtonOriginalBgColor;
    private void obpEkleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obpEkleButtonMouseExited

        obpEkleButton.setBackground(this.obpEkleButtonOriginalBgColor);

    }//GEN-LAST:event_obpEkleButtonMouseExited

    private void obpEkleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obpEkleButtonMouseEntered

        this.obpEkleButtonOriginalBgColor = obpEkleButton.getBackground();
        obpEkleButton.setBackground(Color.green);

    }//GEN-LAST:event_obpEkleButtonMouseEntered

    private void obpEkleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obpEkleButtonMouseClicked

        obpEkleButton.setBackground(Color.red);

    }//GEN-LAST:event_obpEkleButtonMouseClicked
    
                                  
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
            java.util.logging.Logger.getLogger(OBPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OBPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OBPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OBPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OBPFrame().setVisible(true);
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basariPuaniField;
    private javax.swing.JTextField diplomaNotuField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton obpEkleButton;
    private javax.swing.JPanel obpNotuPanel;
    // End of variables declaration//GEN-END:variables

}
