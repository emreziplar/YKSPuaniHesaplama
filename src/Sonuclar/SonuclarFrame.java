
import java.awt.Color;


public class SonuclarFrame extends javax.swing.JFrame {
    
    PuanHesaplari puanHesaplari = new PuanHesaplari();
    
    public SonuclarFrame() {
        initComponents();
        
        tytAlanlariGonder();
        sayAlanlariGonder();
        eAgirlikAlanlariGonder();
        sozelAlanlariGonder();
        dilAlaniGonder();
    }
    
    private void tytAlanlariGonder() {
        puanHesaplari.tytPuanHesapla(tytHamPuanField, tytYerPuanField);
    }
    
    private void sayAlanlariGonder() {
        puanHesaplari.sayPuanHesapla(sayHamPuanField, sayYerPuanField);
    }
    
    private void eAgirlikAlanlariGonder() {
        puanHesaplari.eAgirlikPuanHesapla(eAgirlikHamPuanField, eAgirlikYerPuanField);
    }
    
    private void sozelAlanlariGonder() {
        puanHesaplari.sozelPuanHesapla(sozelHamPuanField, sozelYerPuanField);
    }
    
    private void dilAlaniGonder() {
        puanHesaplari.dilPuanHesapla(dilHamPuanField, dilYerPuanField);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tytSonuclarPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tytHamPuanField = new javax.swing.JTextField();
        tytYerPuanField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yksSonuclarPanel = new javax.swing.JPanel();
        sayYerPuanField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sayHamPuanField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eAgirlikHamPuanField = new javax.swing.JTextField();
        eAgirlikYerPuanField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sozelHamPuanField = new javax.swing.JTextField();
        sozelYerPuanField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dilHamPuanField = new javax.swing.JTextField();
        dilYerPuanField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tekrarHesaplaButton = new javax.swing.JButton();
        cikisYapButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sonuc Ekrani");
        setBounds(new java.awt.Rectangle(600, 150, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tytSonuclarPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("HAM ");

        jLabel3.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("YERLEŞTİRME");

        jLabel5.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("PUAN");

        tytHamPuanField.setEditable(false);

        tytYerPuanField.setEditable(false);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("TYT PUANLARINIZ");

        javax.swing.GroupLayout tytSonuclarPanelLayout = new javax.swing.GroupLayout(tytSonuclarPanel);
        tytSonuclarPanel.setLayout(tytSonuclarPanelLayout);
        tytSonuclarPanelLayout.setHorizontalGroup(
            tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tytSonuclarPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tytSonuclarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addGroup(tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tytHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tytSonuclarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49))))
                    .addGroup(tytSonuclarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(29, 29, 29)
                .addGroup(tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tytYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tytSonuclarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        tytSonuclarPanelLayout.setVerticalGroup(
            tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tytSonuclarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tytSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tytHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tytYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(338, 338, 338))
        );

        yksSonuclarPanel.setBackground(new java.awt.Color(255, 255, 255));

        sayYerPuanField.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("SAY");

        jLabel4.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("HAM ");

        sayHamPuanField.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("YERLEŞTİRME");

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("YKS PUANLARINIZ");

        jLabel9.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("EA");

        jLabel10.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("HAM ");

        eAgirlikHamPuanField.setEditable(false);

        eAgirlikYerPuanField.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("YERLEŞTİRME");

        jLabel12.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("SOZ");

        jLabel13.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("HAM ");

        sozelHamPuanField.setEditable(false);

        sozelYerPuanField.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("YERLEŞTİRME");

        jLabel15.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 102));
        jLabel15.setText("DİL");

        jLabel16.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("HAM ");

        dilHamPuanField.setEditable(false);

        dilYerPuanField.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("YERLEŞTİRME");

        tekrarHesaplaButton.setBackground(new java.awt.Color(0, 153, 204));
        tekrarHesaplaButton.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        tekrarHesaplaButton.setText("Tekrar Hesapla");
        tekrarHesaplaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tekrarHesaplaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tekrarHesaplaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tekrarHesaplaButtonMouseExited(evt);
            }
        });
        tekrarHesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekrarHesaplaButtonActionPerformed(evt);
            }
        });

        cikisYapButton.setBackground(new java.awt.Color(255, 0, 0));
        cikisYapButton.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        cikisYapButton.setText("Çıkış Yap");
        cikisYapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikisYapButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cikisYapButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cikisYapButtonMouseExited(evt);
            }
        });
        cikisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisYapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yksSonuclarPanelLayout = new javax.swing.GroupLayout(yksSonuclarPanel);
        yksSonuclarPanel.setLayout(yksSonuclarPanelLayout);
        yksSonuclarPanelLayout.setHorizontalGroup(
            yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(26, 26, 26)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dilHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(49, 49, 49)))
                                .addGap(29, 29, 29)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dilYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(14, 14, 14))))
                            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(26, 26, 26)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sozelHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(49, 49, 49)))
                                .addGap(29, 29, 29)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sozelYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(14, 14, 14))))
                            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eAgirlikHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(49, 49, 49)))
                                .addGap(29, 29, 29)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eAgirlikYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(14, 14, 14))))
                            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sayHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(49, 49, 49)))
                                .addGap(29, 29, 29)
                                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sayYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(14, 14, 14)))))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                        .addComponent(tekrarHesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yksSonuclarPanelLayout.createSequentialGroup()
                        .addComponent(cikisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        yksSonuclarPanelLayout.setVerticalGroup(
            yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yksSonuclarPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sayHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sayYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eAgirlikHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eAgirlikYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sozelHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sozelYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(yksSonuclarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dilHamPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dilYerPuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(43, 43, 43)
                .addComponent(tekrarHesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cikisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tytSonuclarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yksSonuclarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tytSonuclarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yksSonuclarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisYapButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisYapButtonActionPerformed

    private void cikisYapButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisYapButtonMouseExited
        cikisYapButton.setBackground(cikisYapOriginalBgColor);
        cikisYapButton.setForeground(Color.black);
    }//GEN-LAST:event_cikisYapButtonMouseExited

    private void cikisYapButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisYapButtonMouseEntered
        this.cikisYapOriginalBgColor = cikisYapButton.getBackground();
        cikisYapButton.setBackground(Color.black);
        cikisYapButton.setForeground(Color.white);
    }//GEN-LAST:event_cikisYapButtonMouseEntered

    private void tekrarHesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekrarHesaplaButtonActionPerformed
        setVisible(false);
        OBPFrame obpFrame = new OBPFrame();
        obpFrame.setVisible(true);
    }//GEN-LAST:event_tekrarHesaplaButtonActionPerformed

    private void tekrarHesaplaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tekrarHesaplaButtonMouseExited
        tekrarHesaplaButton.setBackground(tekrarHesaplaOriginalBgColor);
        tekrarHesaplaButton.setForeground(Color.black);
    }//GEN-LAST:event_tekrarHesaplaButtonMouseExited

    private void tekrarHesaplaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tekrarHesaplaButtonMouseEntered
        this.tekrarHesaplaOriginalBgColor = tekrarHesaplaButton.getBackground();
        tekrarHesaplaButton.setBackground(Color.black);
        tekrarHesaplaButton.setForeground(Color.white);
    }//GEN-LAST:event_tekrarHesaplaButtonMouseEntered

    Color tekrarHesaplaOriginalBgColor;
    
    
    Color cikisYapOriginalBgColor;
    
    
    
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
            java.util.logging.Logger.getLogger(SonuclarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SonuclarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SonuclarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SonuclarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SonuclarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikisYapButton;
    private javax.swing.JTextField dilHamPuanField;
    private javax.swing.JTextField dilYerPuanField;
    private javax.swing.JTextField eAgirlikHamPuanField;
    private javax.swing.JTextField eAgirlikYerPuanField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sayHamPuanField;
    private javax.swing.JTextField sayYerPuanField;
    private javax.swing.JTextField sozelHamPuanField;
    private javax.swing.JTextField sozelYerPuanField;
    private javax.swing.JButton tekrarHesaplaButton;
    private javax.swing.JTextField tytHamPuanField;
    private javax.swing.JPanel tytSonuclarPanel;
    private javax.swing.JTextField tytYerPuanField;
    private javax.swing.JPanel yksSonuclarPanel;
    // End of variables declaration//GEN-END:variables
}
