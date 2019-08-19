
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TYTPuaniFrame extends javax.swing.JFrame {

    private float trNet;
    private float sosyalNet;
    private float mat1Net;
    private float fenNet;
    
    public TYTPuaniFrame() {
        initComponents();
        verileriSifirla();
        temizNetleriGonder(); 
        allKeyTyped();
    }
    
    private void verileriSifirla() //frame ekraninin ilk acilis zamaninda butun kutucuklarin(panel uzerindeki) 
    {                              //0 olarak gorunmesi icin yazilan method
        int deger = 0;
        for(Component c:TYTpuanPanel.getComponents())
        {
            if (c instanceof JTextField)
               ((JTextField)c).setText(String.valueOf(deger));
        }     
    }
    
    private void allKeyTyped() //Butun textfield'lere sadece sayi girilebilmesi icin yazilan method
    {                          //(TYTpuanPanel'de olan textfieldlar)
         for(Component c:TYTpuanPanel.getComponents())
        {
            if(c instanceof JTextField)
            {
                c.addKeyListener(new KeyAdapter() 
                {
                    @Override
                    public void keyTyped(KeyEvent evt)
                    {
                        char k = evt.getKeyChar();
                        
                        if(!Character.isDigit(k))
                            evt.consume();
                    }
                });
            }
        }
    }
    
    private void temizNetleriGonder() //baslangicta netlerin hepsine 0'i atamak icin yazdigimiz method
    {
        this.trNet = Float.valueOf(trNetField.getText());
        this.sosyalNet = Float.valueOf(sosyalNetField.getText());
        this.mat1Net = Float.valueOf(mat1NetField.getText());
        this.fenNet = Float.valueOf(fenNetField.getText());
    }
    
    private void dogruYanlislariSifirla() //temizle butonuna basildiginda kullanilacak
    {
        this.trDogru=0;
        this.trYanlis=0;
        this.sosyalDogru=0;
        this.sosyalYanlis=0;
        this.mat1Dogru=0;
        this.mat1Yanlis=0;
        this.fenDogru=0;
        this.fenYanlis=0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TYTpuanPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        trDogruField = new javax.swing.JTextField();
        trYanlisField = new javax.swing.JTextField();
        sosyalYanlisField = new javax.swing.JTextField();
        sosyalDogruField = new javax.swing.JTextField();
        mat1YanlisField = new javax.swing.JTextField();
        mat1DogruField = new javax.swing.JTextField();
        fenYanlisField = new javax.swing.JTextField();
        fenDogruField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TYTEkleButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();
        fenNetField = new javax.swing.JTextField();
        mat1NetField = new javax.swing.JTextField();
        trNetField = new javax.swing.JTextField();
        sosyalNetField = new javax.swing.JTextField();
        uyariMesaji = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TYTpuanPanel.setBackground(new java.awt.Color(255, 255, 255));
        TYTpuanPanel.setForeground(new java.awt.Color(153, 153, 0));

        jLabel5.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("TYT PUANI");

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel6.setText("Türkçe                           40 Soru :");

        jLabel7.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel7.setText("Sosyal Bilimler            20 Soru :");

        jLabel8.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel8.setText("Temel Matematik       40 Soru :");

        jLabel9.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel9.setText("Fen Bilimleri                20 Soru :");

        trDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trDogruFieldKeyReleased(evt);
            }
        });

        trYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trYanlisFieldKeyReleased(evt);
            }
        });

        sosyalYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sosyalYanlisFieldKeyReleased(evt);
            }
        });

        sosyalDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sosyalDogruFieldKeyReleased(evt);
            }
        });

        mat1YanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat1YanlisFieldKeyReleased(evt);
            }
        });

        mat1DogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat1DogruFieldKeyReleased(evt);
            }
        });

        fenYanlisField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fenYanlisFieldKeyReleased(evt);
            }
        });

        fenDogruField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fenDogruFieldKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel10.setText("DOĞRU");

        jLabel11.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel11.setText("YANLIŞ");

        jLabel12.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jLabel12.setText("NET");

        TYTEkleButton.setBackground(new java.awt.Color(255, 153, 153));
        TYTEkleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TYTEkleButton.setText("TYT Puanını Ekle");
        TYTEkleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TYTEkleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TYTEkleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TYTEkleButtonMouseExited(evt);
            }
        });
        TYTEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYTEkleButtonActionPerformed(evt);
            }
        });

        temizleButton.setBackground(new java.awt.Color(153, 153, 255));
        temizleButton.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        temizleButton.setText("TEMİZLE");
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

        fenNetField.setEditable(false);

        mat1NetField.setEditable(false);

        trNetField.setEditable(false);

        sosyalNetField.setEditable(false);

        uyariMesaji.setFont(new java.awt.Font("Source Sans Pro", 0, 17)); // NOI18N
        uyariMesaji.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout TYTpuanPanelLayout = new javax.swing.GroupLayout(TYTpuanPanel);
        TYTpuanPanel.setLayout(TYTpuanPanelLayout);
        TYTpuanPanelLayout.setHorizontalGroup(
            TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                        .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(fenDogruField))
                            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mat1DogruField)
                                    .addComponent(sosyalDogruField)
                                    .addComponent(trDogruField)
                                    .addComponent(jLabel10))))
                        .addGap(42, 42, 42)
                        .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fenYanlisField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mat1YanlisField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sosyalYanlisField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trYanlisField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57)
                        .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(237, 237, 237))
                            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trNetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fenNetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sosyalNetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mat1NetField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TYTEkleButton)
                                    .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))))
                    .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uyariMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        TYTpuanPanelLayout.setVerticalGroup(
            TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(sosyalNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(mat1NetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fenNetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(trDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(sosyalDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(mat1DogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TYTpuanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(fenDogruField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(TYTpuanPanelLayout.createSequentialGroup()
                        .addComponent(trYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sosyalYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mat1YanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fenYanlisField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TYTpuanPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(uyariMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TYTEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(temizleButton)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TYTpuanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(TYTpuanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    
    /*
    .
    .
    DOGRU YANLIS HESAPLAMALARI
    .
    .   
    */   
    private final int trSoruSayisi = 40;
    private final int sosyalSoruSayisi = 20;
    private final int mat1SoruSayisi = 40;
    private final int fenSoruSayisi = 20;

    /*
    TURKCE
    */
    private float trDogru,trYanlis;   
    private void trDogruYanlisIslemleri()
    {
       String trDogruAlani = this.trDogruField.getText();
       String trYanlisAlani = this.trYanlisField.getText();  
       
       if (!trDogruAlani.equals("") && !trYanlisAlani.equals(""))
        {
            trDogru = Float.valueOf(trDogruAlani);
            trYanlis = Float.valueOf(trYanlisAlani);      
        }
        else if (!trDogruAlani.equals("") &&  trYanlisAlani.equals(""))
        {
            trDogru = Float.valueOf(trDogruAlani);
            trYanlis = 0;            
        }
        else if (trDogruAlani.equals("") && !trYanlisAlani.equals(""))
        {
            trDogru = 0;
            trYanlis = Float.valueOf(trYanlisAlani);           
        }
        else 
        {
            trDogru = 0;
            trYanlis = 0;            
        }        
    }
    
    private void trNetHesapla()
    {    
        this.trNet = trDogru - (trYanlis / 4.0f);        
        trNetField.setText(String.valueOf(this.trNet));    
        
        dogruYanlisKontrol();
    }  
    
    private void trYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trYanlisFieldKeyReleased
        trDogruYanlisIslemleri();         
        trNetHesapla();         
    }//GEN-LAST:event_trYanlisFieldKeyReleased
    
    private void trDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trDogruFieldKeyReleased
        trDogruYanlisIslemleri();    
        trNetHesapla();
    }//GEN-LAST:event_trDogruFieldKeyReleased
    /*
    .
    */
    
    /*
    SOSYAL BILIMLER
    */
    private float sosyalDogru,sosyalYanlis;             
    private void sosyalDogruYanlisIslemleri()
    {
        String sosyalDogruAlani = this.sosyalDogruField.getText();
        String sosyalYanlisAlani = this.sosyalYanlisField.getText();     
        
        if (!sosyalDogruAlani.equals("") && !sosyalYanlisAlani.equals(""))
        {
            sosyalDogru = Float.valueOf(sosyalDogruAlani);
            sosyalYanlis = Float.valueOf(sosyalYanlisAlani);      
        }
        else if (!sosyalDogruAlani.equals("") &&  sosyalYanlisAlani.equals(""))
        {
            sosyalDogru = Float.valueOf(sosyalDogruAlani);
            sosyalYanlis = 0;            
        }
        else if (sosyalDogruAlani.equals("") && !sosyalYanlisAlani.equals(""))
        {
            sosyalDogru = 0;
            sosyalYanlis = Float.valueOf(sosyalYanlisAlani);           
        }
        else 
        {
            sosyalDogru = 0;
            sosyalYanlis = 0;            
        }              
    }
    
    private void sosyalNetHesapla()
    {        
        this.sosyalNet = sosyalDogru - (sosyalYanlis / 4.0f);
        sosyalNetField.setText(String.valueOf(this.sosyalNet));
        
        dogruYanlisKontrol();
    }
    
    private void sosyalDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sosyalDogruFieldKeyReleased
        sosyalDogruYanlisIslemleri();
        sosyalNetHesapla();
    }//GEN-LAST:event_sosyalDogruFieldKeyReleased

    private void sosyalYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sosyalYanlisFieldKeyReleased
        sosyalDogruYanlisIslemleri();
        sosyalNetHesapla();
    }//GEN-LAST:event_sosyalYanlisFieldKeyReleased
    /*
    .
    */
    
    /*
    MATEMATIK
    */
    private float mat1Dogru,mat1Yanlis;
    private void mat1DogruYanlisIslemleri()
    {
        String mat1DogruAlani = this.mat1DogruField.getText();
        String mat1YanlisAlani = this.mat1YanlisField.getText(); 
        
        if (!mat1DogruAlani.equals("") && !mat1YanlisAlani.equals(""))
        {
            mat1Dogru = Float.valueOf(mat1DogruAlani);
            mat1Yanlis = Float.valueOf(mat1YanlisAlani);      
        }
        else if (!mat1DogruAlani.equals("") &&  mat1YanlisAlani.equals(""))
        {
            mat1Dogru = Float.valueOf(mat1DogruAlani);
            mat1Yanlis = 0;            
        }
        else if (mat1DogruAlani.equals("") && !mat1YanlisAlani.equals(""))
        {
            mat1Dogru = 0;
            mat1Yanlis = Float.valueOf(mat1YanlisAlani);           
        }
        else 
        {
            mat1Dogru = 0;
            mat1Yanlis = 0;            
        }          
    }
    
    private void mat1NetHesapla()
    {
       this.mat1Net = mat1Dogru - (mat1Yanlis / 4.0f);
       mat1NetField.setText(String.valueOf(this.mat1Net));
       
       dogruYanlisKontrol();
    }
    
    private void mat1DogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat1DogruFieldKeyReleased
        mat1DogruYanlisIslemleri();
        mat1NetHesapla();
    }//GEN-LAST:event_mat1DogruFieldKeyReleased

    private void mat1YanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat1YanlisFieldKeyReleased
        mat1DogruYanlisIslemleri();
        mat1NetHesapla();
    }//GEN-LAST:event_mat1YanlisFieldKeyReleased
    /*
    .
    */
    
    /*
    FEN BILIMLERI
    */
    private float fenDogru,fenYanlis;
    private void fenDogruYanlisIslemleri()
    {
        String fenDogruAlani = this.fenDogruField.getText();
        String fenYanlisAlani = this.fenYanlisField.getText(); 
        
        if (!fenDogruAlani.equals("") && !fenYanlisAlani.equals(""))
        {
            fenDogru = Float.valueOf(fenDogruAlani);
            fenYanlis = Float.valueOf(fenYanlisAlani);      
        }
        else if (!fenDogruAlani.equals("") &&  fenYanlisAlani.equals(""))
        {
            fenDogru = Float.valueOf(fenDogruAlani);
            fenYanlis = 0;            
        }
        else if (fenDogruAlani.equals("") && !fenYanlisAlani.equals(""))
        {
            fenDogru = 0;
            fenYanlis = Float.valueOf(fenYanlisAlani);           
        }
        else 
        {
            fenDogru = 0;
            fenYanlis = 0;            
        }          
    }
    
    private void fenNetHesapla()
    {
        this.fenNet = fenDogru - (fenYanlis / 4.0f);
        fenNetField.setText(String.valueOf(this.fenNet));
        
        dogruYanlisKontrol(); 
    }
    
    private void fenDogruFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fenDogruFieldKeyReleased
        fenDogruYanlisIslemleri();
        fenNetHesapla();
    }//GEN-LAST:event_fenDogruFieldKeyReleased

    private void fenYanlisFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fenYanlisFieldKeyReleased
        fenDogruYanlisIslemleri();
        fenNetHesapla();
    }//GEN-LAST:event_fenYanlisFieldKeyReleased
    /*
    .
    */
    
    /*
    UYARI MESAJI
    */
    private void dogruYanlisKontrol()
    {
        String mesaj = "<html><b>UYARI:</b> Doğru ve Yanlış Sayıları Toplamı Soru Sayısını Geçemez</html>";
        
        if( (trDogru+trYanlis) > this.trSoruSayisi || (sosyalDogru+sosyalYanlis) > this.sosyalSoruSayisi //Dogru yanlis sayilarinin toplamı 
            || (mat1Dogru+mat1Yanlis) > this.mat1SoruSayisi || (fenDogru+fenYanlis) > this.fenSoruSayisi) //herhangi birinin soru sayisini geciyorsa
        {
            uyariMesaji.setText(mesaj); //mesajimiz gorunsun
        }
        else 
            uyariMesaji.setText(""); //mesaj kutumuz bos olsun
    }
    /*
    .
    */
    
    /*
    DOGRU YANLIS HESAPLAMALARININ SONU
    .
    .   
    */
    
    
    
    /*
    .
    TYT PUANINI EKLE BUTONUNUN OZELLIKLERI
    .
    */
    Color tytEkleButtonOriginalBgColor;    
    private void TYTEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TYTEkleButtonActionPerformed
        
        if(uyariMesaji.getText().equals("")) 
        {
            setVisible(false);
            AYTPuaniFrame aytPuaniFrame = new AYTPuaniFrame();
            aytPuaniFrame.setVisible(true);
        }
        else 
            JOptionPane.showMessageDialog(this, "Lütfen Uyarıyı Dikkate Alarak İşlem Yapınız");
    }//GEN-LAST:event_TYTEkleButtonActionPerformed

    private void TYTEkleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TYTEkleButtonMouseEntered

        this.tytEkleButtonOriginalBgColor = TYTEkleButton.getBackground(); //uzerine gelinmeden onceki(orijinal) rengini aliyoruz
        TYTEkleButton.setBackground(Color.yellow);  //rengini sari yapiyoruz
        
    }//GEN-LAST:event_TYTEkleButtonMouseEntered

    private void TYTEkleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TYTEkleButtonMouseExited
        
        TYTEkleButton.setBackground(this.tytEkleButtonOriginalBgColor); //orijinal rengini daha once aldigimiz icin
                                                                        //buton uzerinden cikilinca eski rengini alacak
    }//GEN-LAST:event_TYTEkleButtonMouseExited
    /*
    .
    .
    */
    
    
    
    /*
    .
    TEMIZLE BUTONUNUN OZELLIKLERI
    .
    */
    Color temizleButtonOriginalBgColor;
    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        int optionType = JOptionPane.YES_NO_OPTION;
        int operation = JOptionPane.showConfirmDialog(this, "Tüm Değerler Sıfırlanacak.\nOnaylıyor musun?", "UYARI", optionType);
        
        if(operation == optionType)
        {
           verileriSifirla();
           dogruYanlislariSifirla();
           uyariMesaji.setText("");
        }        
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void temizleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizleButtonMouseEntered
        this.temizleButtonOriginalBgColor = temizleButton.getBackground(); 
        temizleButton.setBackground(Color.green);
    }//GEN-LAST:event_temizleButtonMouseEntered

    private void temizleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizleButtonMouseExited
        temizleButton.setBackground(temizleButtonOriginalBgColor);
    }//GEN-LAST:event_temizleButtonMouseExited
    /*
    .
    SON
    .    
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
            java.util.logging.Logger.getLogger(TYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TYTPuaniFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TYTPuaniFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TYTEkleButton;
    private javax.swing.JPanel TYTpuanPanel;
    private javax.swing.JTextField fenDogruField;
    private javax.swing.JTextField fenNetField;
    private javax.swing.JTextField fenYanlisField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mat1DogruField;
    private javax.swing.JTextField mat1NetField;
    private javax.swing.JTextField mat1YanlisField;
    private javax.swing.JTextField sosyalDogruField;
    private javax.swing.JTextField sosyalNetField;
    private javax.swing.JTextField sosyalYanlisField;
    private javax.swing.JButton temizleButton;
    private javax.swing.JTextField trDogruField;
    private javax.swing.JTextField trNetField;
    private javax.swing.JTextField trYanlisField;
    private javax.swing.JLabel uyariMesaji;
    // End of variables declaration//GEN-END:variables
}
