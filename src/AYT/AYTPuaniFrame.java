

public class AYTPuaniFrame extends javax.swing.JFrame {

    private final IslemlerAYT islemler = new IslemlerAYT();
    private final EsitAgirlikBolumu esitAgirlikBolumu = new EsitAgirlikBolumu();
    private final SozelBolumu sozelBolumu = new SozelBolumu();
    private final MatematikBolumu matematikBolumu = new MatematikBolumu();
    private final FenBolumu fenBolumu = new FenBolumu();
    
    public AYTPuaniFrame() {
        initComponents();       
        sifirlamaIslemleri();
        klavyeIslemleri();        
    }
    
    private void sifirlamaIslemleri() 
    {
        islemler.verileriSifirla(this.AYTpuanPanel); //tum verilerin baslangicta sifir gozukmesi saglandi
        
        esitAgirlikBolumu.baslangicNetleri(this.edbNetField, this.tarih1NetField, this.cog1NetField); 
        esitAgirlikBolumu.dogruYanlislariSifirla();
        
        matematikBolumu.baslangicNetleri(mat2NetField);
        matematikBolumu.dogruYanlislariSifirla();
    }
    private void klavyeIslemleri()
    {
        islemler.allKeyTyped(this.AYTpuanPanel); //tum kutucuklara sadece sayi girilmesi saglandi
    }
           
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AYTpuanPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        edbDogruField = new javax.swing.JTextField();
        edbYanlisField = new javax.swing.JTextField();
        edbNetField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tarih1DogruField = new javax.swing.JTextField();
        tarih1YanlisField = new javax.swing.JTextField();
        tarih1NetField = new javax.swing.JTextField();
        cog1DogruField = new javax.swing.JTextField();
        cog1YanlisField = new javax.swing.JTextField();
        cog1NetField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tarih2DogruField = new javax.swing.JTextField();
        tarih2YanlisField = new javax.swing.JTextField();
        tarih2NetField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cog2DogruField = new javax.swing.JTextField();
        cog2YanlisField = new javax.swing.JTextField();
        cog2NetField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        felsefeDogruField = new javax.swing.JTextField();
        felsefeYanlisField = new javax.swing.JTextField();
        felsefeNetField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        mat2DogruField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        mat2NetField = new javax.swing.JTextField();
        mat2YanlisField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        fizikDogruField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        fizikYanlisField = new javax.swing.JTextField();
        fizikNetField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        kimyaNetField = new javax.swing.JTextField();
        kimyaYanlisField = new javax.swing.JTextField();
        kimyaDogruField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        biyoDogruField = new javax.swing.JTextField();
        biyoYanlisField = new javax.swing.JTextField();
        biyoNetField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        dinDogruField = new javax.swing.JTextField();
        dinYanlisField = new javax.swing.JTextField();
        dinNetField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        dil_DogruField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        dil_YanlisField = new javax.swing.JTextField();
        dil_NetField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        sonuclariGoruntuleButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        uyariMesajiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AYTpuanPanel.setBackground(new java.awt.Color(255, 255, 255));
        AYTpuanPanel.setForeground(new java.awt.Color(0, 0, 153));

        jLabel13.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("TÜRK DİLİ ve EDEBİYATI / SOSYAL BİLİMLER - 1");

        jLabel14.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("AYT PUANI");

        jLabel15.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel15.setText("Türk Dili ve Edebiyatı 24 Soru :");

        jLabel16.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel16.setText("DOĞRU");

        jLabel17.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel17.setText("YANLIŞ");

        jLabel18.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel18.setText(" NET");

        edbDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edbDogruFieldKeyReleased(evt);
            }
        });

        edbYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edbYanlisFieldKeyReleased(evt);
            }
        });

        edbNetField.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel19.setText("Tarih-1                            10 Soru :");

        tarih1DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarih1DogruFieldKeyReleased(evt);
            }
        });

        tarih1YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarih1YanlisFieldKeyReleased(evt);
            }
        });

        tarih1NetField.setEditable(false);

        cog1DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cog1DogruFieldKeyReleased(evt);
            }
        });

        cog1YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cog1YanlisFieldKeyReleased(evt);
            }
        });

        cog1NetField.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel21.setText("Tarih-2                             11 Soru :");

        jLabel22.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel22.setText("DOĞRU");

        jLabel23.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel23.setText("YANLIŞ");

        jLabel24.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel24.setText(" NET");

        tarih2NetField.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel25.setText("Coğrafya-2                     11 Soru :");

        cog2NetField.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel26.setText("Felsefe Grubu               12 Soru :");

        felsefeNetField.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("SOSYAL BİLİMLER - 2");

        jLabel27.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("MATEMATİK ");

        jLabel28.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel28.setText("Matematik                     40 Soru :");

        jLabel29.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel29.setText("DOĞRU");

        jLabel30.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel30.setText("YANLIŞ");

        jLabel31.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel31.setText(" NET");

        mat2NetField.setEditable(false);

        jLabel34.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("FEN BİLİMLERİ");

        jLabel32.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel32.setText("Fizik                                  14 Soru :");

        jLabel35.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel35.setText("DOĞRU");

        jLabel36.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel36.setText("YANLIŞ");

        fizikNetField.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel37.setText(" NET");

        kimyaNetField.setEditable(false);

        jLabel38.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel38.setText("Kimya                             13 Soru :");

        jLabel39.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel39.setText("Biyoloji                           13 Soru :");

        biyoNetField.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel40.setText("Din Kültürü                      6 Soru :");

        dinNetField.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setText("YABANCI DİL");

        jLabel42.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel42.setText("DİL                                   80 Soru :");

        jLabel43.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel43.setText("DOĞRU");

        jLabel44.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel44.setText("YANLIŞ");

        dil_NetField.setEditable(false);

        jLabel45.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel45.setText(" NET");

        sonuclariGoruntuleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sonuclariGoruntuleButton.setText("SONUÇLARI GÖRÜNTÜLE");

        temizleButton.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        temizleButton.setText("TEMİZLE");

        jLabel20.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel20.setText("Coğrafya-1                       6 Soru :");

        uyariMesajiLabel.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout AYTpuanPanelLayout = new javax.swing.GroupLayout(AYTpuanPanel);
        AYTpuanPanel.setLayout(AYTpuanPanelLayout);
        AYTpuanPanelLayout.setHorizontalGroup(
            AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(edbDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(edbYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(edbNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(tarih1DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tarih1YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tarih1NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(cog1DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cog1YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cog1NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel38)
                                .addComponent(jLabel32))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(fizikDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fizikYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fizikNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(kimyaDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kimyaYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kimyaNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel36)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel37))))
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(biyoDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(biyoYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(biyoNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                .addComponent(tarih2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tarih2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tarih2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                .addComponent(cog2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cog2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cog2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24))))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(mat2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mat2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel30)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel31))))
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addComponent(jLabel42)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(dil_DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dil_YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dil_NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel44)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel45))))
                        .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(9, 9, 9)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(felsefeDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(felsefeYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(felsefeNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                                    .addComponent(dinDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dinYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dinNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(sonuclariGoruntuleButton)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(uyariMesajiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        AYTpuanPanelLayout.setVerticalGroup(
            AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edbDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edbYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edbNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tarih1DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tarih1YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tarih1NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cog1YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cog1NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cog1DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fizikDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fizikYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fizikNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kimyaDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kimyaYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kimyaNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(biyoDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(biyoYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(biyoNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(uyariMesajiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cog2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cog2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cog2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(felsefeDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(felsefeYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(felsefeNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dinYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sonuclariGoruntuleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mat2DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mat2YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mat2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dil_DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dil_YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dil_NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1127, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AYTpuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AYTpuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edbIslemleri()
    {
        esitAgirlikBolumu.dogruYanlisGonder(edbDogruField, edbYanlisField);
        esitAgirlikBolumu.edbNetHesapla(edbNetField, uyariMesajiLabel);
    }
    private void edbDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edbDogruFieldKeyReleased
       edbIslemleri();
    }//GEN-LAST:event_edbDogruFieldKeyReleased

    private void edbYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edbYanlisFieldKeyReleased
        edbIslemleri();
    }//GEN-LAST:event_edbYanlisFieldKeyReleased

    private void tarih1Islemleri()
    {
        esitAgirlikBolumu.dogruYanlisGonder(tarih1DogruField, tarih1YanlisField);
        esitAgirlikBolumu.tarih1NetHesapla(tarih1NetField, uyariMesajiLabel);
    }
    private void tarih1DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarih1DogruFieldKeyReleased
        tarih1Islemleri();
    }//GEN-LAST:event_tarih1DogruFieldKeyReleased

    private void tarih1YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarih1YanlisFieldKeyReleased
        tarih1Islemleri();
    }//GEN-LAST:event_tarih1YanlisFieldKeyReleased

    
    public void cog1Islemleri()
    {
        esitAgirlikBolumu.dogruYanlisGonder(cog1DogruField , cog1YanlisField);
        esitAgirlikBolumu.cog1NetHesapla(cog1NetField, uyariMesajiLabel);
    }
    private void cog1DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog1DogruFieldKeyReleased
        cog1Islemleri();
    }//GEN-LAST:event_cog1DogruFieldKeyReleased

    private void cog1YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog1YanlisFieldKeyReleased
        cog1Islemleri();
    }//GEN-LAST:event_cog1YanlisFieldKeyReleased
    
    
    
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
            java.util.logging.Logger.getLogger(AYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AYTPuaniFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AYTpuanPanel;
    private javax.swing.JTextField biyoDogruField;
    private javax.swing.JTextField biyoNetField;
    private javax.swing.JTextField biyoYanlisField;
    private javax.swing.JTextField cog1DogruField;
    private javax.swing.JTextField cog1NetField;
    private javax.swing.JTextField cog1YanlisField;
    private javax.swing.JTextField cog2DogruField;
    private javax.swing.JTextField cog2NetField;
    private javax.swing.JTextField cog2YanlisField;
    private javax.swing.JTextField dil_DogruField;
    private javax.swing.JTextField dil_NetField;
    private javax.swing.JTextField dil_YanlisField;
    private javax.swing.JTextField dinDogruField;
    private javax.swing.JTextField dinNetField;
    private javax.swing.JTextField dinYanlisField;
    private javax.swing.JTextField edbDogruField;
    private javax.swing.JTextField edbNetField;
    private javax.swing.JTextField edbYanlisField;
    private javax.swing.JTextField felsefeDogruField;
    private javax.swing.JTextField felsefeNetField;
    private javax.swing.JTextField felsefeYanlisField;
    private javax.swing.JTextField fizikDogruField;
    private javax.swing.JTextField fizikNetField;
    private javax.swing.JTextField fizikYanlisField;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JTextField kimyaDogruField;
    private javax.swing.JTextField kimyaNetField;
    private javax.swing.JTextField kimyaYanlisField;
    private javax.swing.JTextField mat2DogruField;
    private javax.swing.JTextField mat2NetField;
    private javax.swing.JTextField mat2YanlisField;
    private javax.swing.JButton sonuclariGoruntuleButton;
    private javax.swing.JTextField tarih1DogruField;
    private javax.swing.JTextField tarih1NetField;
    private javax.swing.JTextField tarih1YanlisField;
    private javax.swing.JTextField tarih2DogruField;
    private javax.swing.JTextField tarih2NetField;
    private javax.swing.JTextField tarih2YanlisField;
    private javax.swing.JButton temizleButton;
    private javax.swing.JLabel uyariMesajiLabel;
    // End of variables declaration//GEN-END:variables
}
