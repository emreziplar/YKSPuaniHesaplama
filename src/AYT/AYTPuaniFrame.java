
import java.awt.Color;
import javax.swing.JOptionPane;



public class AYTPuaniFrame extends javax.swing.JFrame {

    private final AnaIslemler islemler = new AnaIslemler();
    private final EsitAgirlikBolumu esitAgirlikBolumu = new EsitAgirlikBolumu();
    private final SozelBolumu sozelBolumu = new SozelBolumu();
    private final MatematikBolumu matematikBolumu = new MatematikBolumu();
    private final FenBolumu fenBolumu = new FenBolumu();
    
    public AYTPuaniFrame() {
        initComponents();       
        sifirla();
        klavyeIslemleri();        
    }
    
    private void sifirla() 
    {
        islemler.verileriSifirla(this.AYTpuanPanel); //tum veriler sifirlaniyor
        
        //daha sonra sifirlanmis veriler ait olduklari sinifa gonderiliyor
        
        esitAgirlikBolumu.baslangicNetleri(this.edbNetField, this.tarih1NetField, this.cog1NetField); 
        esitAgirlikBolumu.dogruYanlislariSifirla();
        
        sozelBolumu.baslangicNetleri(tarih2NetField, cog2NetField, felsefeNetField, dinNetField);
        sozelBolumu.dogruYanlislariSifirla();
        
        fenBolumu.baslangicNetleri(this.fizikNetField, this.kimyaNetField, this.biyoNetField);
        fenBolumu.dogruYanlislariSifirla();
        
        matematikBolumu.baslangicNetleri(this.mat2NetField);
        matematikBolumu.dogruYanlislariSifirla();
        
        uyariMesajiLabel1.setText(""); //Turk Edebiyati ve Sosyal Bilimler 1 Uyari Kutucugu
        uyariMesajiLabel2.setText(""); //Fen Bilimleri Uyari Kutucugu
        uyariMesajiLabel3.setText(""); //Sosyal Bilimler 2 Uyari Kutucugu
        uyariMesajiLabel4.setText(""); //Matematik Uyari Kutucugu
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
        jLabel20 = new javax.swing.JLabel();
        uyariMesajiLabel4 = new javax.swing.JLabel();
        uyariMesajiLabel1 = new javax.swing.JLabel();
        uyariMesajiLabel2 = new javax.swing.JLabel();
        uyariMesajiLabel3 = new javax.swing.JLabel();
        dilPuaniniHesaplaButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();
        sonuclariGorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AYT Hesaplama Ekranı");
        setBounds(new java.awt.Rectangle(400, 210, 0, 0));
        setResizable(false);

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

        tarih2DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarih2DogruFieldKeyReleased(evt);
            }
        });

        tarih2YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarih2YanlisFieldKeyReleased(evt);
            }
        });

        tarih2NetField.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel25.setText("Coğrafya-2                     11 Soru :");

        cog2DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cog2DogruFieldKeyReleased(evt);
            }
        });

        cog2YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cog2YanlisFieldKeyReleased(evt);
            }
        });

        cog2NetField.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel26.setText("Felsefe Grubu               12 Soru :");

        felsefeDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                felsefeDogruFieldKeyReleased(evt);
            }
        });

        felsefeYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                felsefeYanlisFieldKeyReleased(evt);
            }
        });

        felsefeNetField.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("SOSYAL BİLİMLER - 2");

        jLabel27.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("MATEMATİK ");

        jLabel28.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel28.setText("Matematik                     40 Soru :");

        mat2DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat2DogruFieldKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel29.setText("DOĞRU");

        jLabel30.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel30.setText("YANLIŞ");

        jLabel31.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel31.setText(" NET");

        mat2NetField.setEditable(false);

        mat2YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat2YanlisFieldKeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("FEN BİLİMLERİ");

        jLabel32.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel32.setText("Fizik                                  14 Soru :");

        fizikDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fizikDogruFieldKeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel35.setText("DOĞRU");

        jLabel36.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel36.setText("YANLIŞ");

        fizikYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fizikYanlisFieldKeyReleased(evt);
            }
        });

        fizikNetField.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel37.setText(" NET");

        kimyaNetField.setEditable(false);

        kimyaYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kimyaYanlisFieldKeyReleased(evt);
            }
        });

        kimyaDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kimyaDogruFieldKeyReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel38.setText("Kimya                             13 Soru  :");

        jLabel39.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel39.setText("Biyoloji                           13 Soru :");

        biyoDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                biyoDogruFieldKeyReleased(evt);
            }
        });

        biyoYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                biyoYanlisFieldKeyReleased(evt);
            }
        });

        biyoNetField.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel40.setText("Din Kültürü                      6 Soru :");

        dinDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dinDogruFieldKeyReleased(evt);
            }
        });

        dinYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dinYanlisFieldKeyReleased(evt);
            }
        });

        dinNetField.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel20.setText("Coğrafya-1                       6 Soru :");

        uyariMesajiLabel4.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel4.setForeground(new java.awt.Color(0, 51, 255));

        uyariMesajiLabel1.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel1.setForeground(new java.awt.Color(0, 0, 255));

        uyariMesajiLabel2.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel2.setForeground(new java.awt.Color(0, 51, 255));

        uyariMesajiLabel3.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesajiLabel3.setForeground(new java.awt.Color(0, 51, 255));

        dilPuaniniHesaplaButton.setBackground(new java.awt.Color(255, 204, 204));
        dilPuaniniHesaplaButton.setFont(new java.awt.Font("Source Sans Pro", 1, 16)); // NOI18N
        dilPuaniniHesaplaButton.setText("Dil Puanını Hesapla");
        dilPuaniniHesaplaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dilPuaniniHesaplaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dilPuaniniHesaplaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dilPuaniniHesaplaButtonMouseExited(evt);
            }
        });
        dilPuaniniHesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilPuaniniHesaplaButtonActionPerformed(evt);
            }
        });

        temizleButton.setBackground(new java.awt.Color(153, 153, 255));
        temizleButton.setFont(new java.awt.Font("Source Sans Pro", 1, 16)); // NOI18N
        temizleButton.setText("Temizle");
        temizleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temizleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                temizleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                temizleButtonMouseExited(evt);
            }
        });
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        sonuclariGorButton.setBackground(new java.awt.Color(153, 255, 102));
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

        javax.swing.GroupLayout AYTpuanPanelLayout = new javax.swing.GroupLayout(AYTpuanPanel);
        AYTpuanPanel.setLayout(AYTpuanPanelLayout);
        AYTpuanPanelLayout.setHorizontalGroup(
            AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
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
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(biyoDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(biyoYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(biyoNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uyariMesajiLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyariMesajiLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dilPuaniniHesaplaButton)
                        .addGap(18, 18, 18)
                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sonuclariGorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
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
                            .addComponent(uyariMesajiLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                    .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26))
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
                                            .addComponent(dinNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(uyariMesajiLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        AYTpuanPanelLayout.setVerticalGroup(
            AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(18, 18, 18)
                        .addComponent(uyariMesajiLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                        .addGap(9, 9, 9))
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
                            .addComponent(tarih2NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dinDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dinYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dinNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uyariMesajiLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uyariMesajiLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(biyoDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(biyoYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(biyoNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyariMesajiLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AYTpuanPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dilPuaniniHesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(temizleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sonuclariGorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AYTpuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AYTpuanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void edbIslemleri()
    {
        esitAgirlikBolumu.dogruYanlisGonder(edbDogruField, edbYanlisField);
        esitAgirlikBolumu.edbNetHesapla(edbNetField, uyariMesajiLabel1);
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
        esitAgirlikBolumu.tarih1NetHesapla(tarih1NetField, uyariMesajiLabel1);
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
        esitAgirlikBolumu.cog1NetHesapla(cog1NetField, uyariMesajiLabel1);
    }
    private void cog1DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog1DogruFieldKeyReleased
        cog1Islemleri();
    }//GEN-LAST:event_cog1DogruFieldKeyReleased

    private void cog1YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog1YanlisFieldKeyReleased
        cog1Islemleri();
    }//GEN-LAST:event_cog1YanlisFieldKeyReleased

    
    public void fizikIslemleri()
    {
        fenBolumu.dogruYanlisGonder(fizikDogruField, fizikYanlisField);
        fenBolumu.fizikNetHesapla(fizikNetField, uyariMesajiLabel2);
    }
    private void fizikDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fizikDogruFieldKeyReleased
        fizikIslemleri();
    }//GEN-LAST:event_fizikDogruFieldKeyReleased

    private void fizikYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fizikYanlisFieldKeyReleased
        fizikIslemleri();
    }//GEN-LAST:event_fizikYanlisFieldKeyReleased

    
    public void kimyaIslemleri()
    {
        fenBolumu.dogruYanlisGonder(kimyaDogruField, kimyaYanlisField);
        fenBolumu.kimyaNetHesapla(kimyaNetField, uyariMesajiLabel2);
    }
    private void kimyaDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kimyaDogruFieldKeyReleased
        kimyaIslemleri();
    }//GEN-LAST:event_kimyaDogruFieldKeyReleased

    private void kimyaYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kimyaYanlisFieldKeyReleased
        kimyaIslemleri();
    }//GEN-LAST:event_kimyaYanlisFieldKeyReleased

    
    public void biyoIslemleri()
    {
        fenBolumu.dogruYanlisGonder(biyoDogruField, biyoYanlisField);
        fenBolumu.biyoNetHesapla(biyoNetField, uyariMesajiLabel2);
    }   
    private void biyoDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biyoDogruFieldKeyReleased
        biyoIslemleri();
    }//GEN-LAST:event_biyoDogruFieldKeyReleased

    private void biyoYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biyoYanlisFieldKeyReleased
        biyoIslemleri();
    }//GEN-LAST:event_biyoYanlisFieldKeyReleased

    
    
    
    public void tarih2Islemleri()
    {
        sozelBolumu.dogruYanlisGonder(tarih2DogruField, tarih2YanlisField);
        sozelBolumu.tarih2NetHesapla(tarih2NetField, uyariMesajiLabel3);
    }
    private void tarih2DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarih2DogruFieldKeyReleased
        tarih2Islemleri();
    }//GEN-LAST:event_tarih2DogruFieldKeyReleased

    private void tarih2YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarih2YanlisFieldKeyReleased
        tarih2Islemleri();
    }//GEN-LAST:event_tarih2YanlisFieldKeyReleased

    
    public void cog2Islemleri()
    {
        sozelBolumu.dogruYanlisGonder(cog2DogruField, cog2YanlisField);
        sozelBolumu.cog2NetHesapla(cog2NetField, uyariMesajiLabel3);
    }
    private void cog2DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog2DogruFieldKeyReleased
        cog2Islemleri();
    }//GEN-LAST:event_cog2DogruFieldKeyReleased

    private void cog2YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cog2YanlisFieldKeyReleased
        cog2Islemleri();
    }//GEN-LAST:event_cog2YanlisFieldKeyReleased

    
    public void felsefeIslemleri()
    {
        sozelBolumu.dogruYanlisGonder(felsefeDogruField, felsefeYanlisField);
        sozelBolumu.felsefeNetHesapla(felsefeNetField, uyariMesajiLabel3);
    }
    private void felsefeDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_felsefeDogruFieldKeyReleased
        felsefeIslemleri();
    }//GEN-LAST:event_felsefeDogruFieldKeyReleased

    private void felsefeYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_felsefeYanlisFieldKeyReleased
        felsefeIslemleri();
    }//GEN-LAST:event_felsefeYanlisFieldKeyReleased

    
    public void dinIslemleri()
    {
        sozelBolumu.dogruYanlisGonder(dinDogruField, dinYanlisField);
        sozelBolumu.dinNetHesapla(dinNetField, uyariMesajiLabel3);
    }
    private void dinDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dinDogruFieldKeyReleased
        dinIslemleri();
    }//GEN-LAST:event_dinDogruFieldKeyReleased

    private void dinYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dinYanlisFieldKeyReleased
        dinIslemleri();
    }//GEN-LAST:event_dinYanlisFieldKeyReleased

    
    public void mat2Islemleri()
    {
        matematikBolumu.dogruYanlisGonder(mat2DogruField, mat2YanlisField);
        matematikBolumu.mat2NetHesapla(mat2NetField, uyariMesajiLabel4);
    }
    
    private void mat2DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat2DogruFieldKeyReleased
        mat2Islemleri();
    }//GEN-LAST:event_mat2DogruFieldKeyReleased

    private void mat2YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat2YanlisFieldKeyReleased
        mat2Islemleri();
    }//GEN-LAST:event_mat2YanlisFieldKeyReleased

    
    
    
    private boolean uyariMesajiKontrol()
    {
        if(uyariMesajiLabel1.getText().equals("") && uyariMesajiLabel2.getText().equals("")
                && uyariMesajiLabel3.getText().equals("") && uyariMesajiLabel4.getText().equals(""))            
            return true;
        
        else               
            return false;
        
    }
    
    private void dilPuaniniHesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilPuaniniHesaplaButtonActionPerformed
       if(uyariMesajiKontrol())
       {
            setVisible(false);
            DilPuaniFrame dilPuaniFrame = new DilPuaniFrame();
            dilPuaniFrame.setVisible(true);
       }
       else 
           JOptionPane.showMessageDialog(this, "Lütfen Uyarıları Dikkate Alarak İşlem Yapınız");    
    }//GEN-LAST:event_dilPuaniniHesaplaButtonActionPerformed

    Color dilPuaniniHesaplaOriginalBgColor;
    private void dilPuaniniHesaplaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dilPuaniniHesaplaButtonMouseEntered
        dilPuaniniHesaplaOriginalBgColor = dilPuaniniHesaplaButton.getBackground();
        dilPuaniniHesaplaButton.setBackground(Color.darkGray);
        dilPuaniniHesaplaButton.setForeground(Color.white);
    }//GEN-LAST:event_dilPuaniniHesaplaButtonMouseEntered

    private void dilPuaniniHesaplaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dilPuaniniHesaplaButtonMouseExited
        dilPuaniniHesaplaButton.setBackground(dilPuaniniHesaplaOriginalBgColor);
        dilPuaniniHesaplaButton.setForeground(Color.black);
    }//GEN-LAST:event_dilPuaniniHesaplaButtonMouseExited

    
    
    
    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        int optionType = JOptionPane.YES_NO_OPTION;
        int operation = JOptionPane.showConfirmDialog(this, "Tüm Değerler Sıfırlanacak.\nOnaylıyor musun?", "UYARI", optionType);
        
        if(optionType == operation)
            sifirla();
    }//GEN-LAST:event_temizleButtonActionPerformed

    Color temizleOriginalBgColor;
    private void temizleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizleButtonMouseEntered
        temizleOriginalBgColor = temizleButton.getBackground();
        temizleButton.setBackground(Color.darkGray);
        temizleButton.setForeground(Color.white);
    }//GEN-LAST:event_temizleButtonMouseEntered

    private void temizleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizleButtonMouseExited
        temizleButton.setBackground(temizleOriginalBgColor);
        temizleButton.setForeground(Color.black);
    }//GEN-LAST:event_temizleButtonMouseExited
  
    private void sonuclariGorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuclariGorButtonActionPerformed
        if(uyariMesajiKontrol())
        {
            setVisible(false);
            SonuclarFrame sonuclarFrame = new SonuclarFrame();
            sonuclarFrame.setVisible(true);
        }
        else 
            JOptionPane.showMessageDialog(this, "Lütfen Uyarıları Dikkate Alarak İşlem Yapınız");  
    }//GEN-LAST:event_sonuclariGorButtonActionPerformed

    
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
    private javax.swing.JButton dilPuaniniHesaplaButton;
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
    private javax.swing.JTextField kimyaDogruField;
    private javax.swing.JTextField kimyaNetField;
    private javax.swing.JTextField kimyaYanlisField;
    private javax.swing.JTextField mat2DogruField;
    private javax.swing.JTextField mat2NetField;
    private javax.swing.JTextField mat2YanlisField;
    private javax.swing.JButton sonuclariGorButton;
    private javax.swing.JTextField tarih1DogruField;
    private javax.swing.JTextField tarih1NetField;
    private javax.swing.JTextField tarih1YanlisField;
    private javax.swing.JTextField tarih2DogruField;
    private javax.swing.JTextField tarih2NetField;
    private javax.swing.JTextField tarih2YanlisField;
    private javax.swing.JButton temizleButton;
    private javax.swing.JLabel uyariMesajiLabel1;
    private javax.swing.JLabel uyariMesajiLabel2;
    private javax.swing.JLabel uyariMesajiLabel3;
    private javax.swing.JLabel uyariMesajiLabel4;
    // End of variables declaration//GEN-END:variables
}
