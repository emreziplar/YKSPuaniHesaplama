
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EsitAgirlikBolumu extends AnaIslemler
{
    public static float edbNet;
    public static float tarih1Net;
    public static float cog1Net;
    
    public void baslangicNetleri(JTextField edbNetField,JTextField tarih1NetField,JTextField cog1NetField)
    { 
       //baslangic netleri olarak net kutucuklarinda yer alan 0'lar gelecek
       this.edbNet = Float.valueOf(edbNetField.getText());
       this.tarih1Net = Float.valueOf(tarih1NetField.getText());
       this.cog1Net = Float.valueOf(cog1NetField.getText());
    }
    
    
    
    private final int EDB_SORUSAYISI = 24;
    private final int TARIH1_SORUSAYISI = 10;
    private final int COG1_SORUSAYISI = 6;
    
              
    private int dogru;
    private int yanlis;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField); 
       
        this.dogru = super.getDogru();
        this.yanlis = super.getYanlis();
    }
      
   
    
    private int edbDogruSayisi,edbYanlisSayisi;        
    public void edbNetHesapla(JTextField edbNetField,JLabel uyariMesajiLabel)
    {
        edbDogruSayisi = this.dogru;
        edbYanlisSayisi = this.yanlis;
        
        this.edbNet = edbDogruSayisi - (edbYanlisSayisi / 4.0f);
        edbNetField.setText(String.valueOf(edbNet));
        
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    private int tarih1DogruSayisi,tarih1YanlisSayisi;
    public void tarih1NetHesapla(JTextField tarih1NetField,JLabel uyariMesajiLabel)
    {
        tarih1DogruSayisi = this.dogru;
        tarih1YanlisSayisi = this.yanlis;
        
        this.tarih1Net = dogru - (yanlis / 4.0f);
        tarih1NetField.setText(String.valueOf(tarih1Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    private int cog1DogruSayisi,cog1YanlisSayisi;
    public void cog1NetHesapla(JTextField cog1NetField,JLabel uyariMesajiLabel)
    {
        cog1DogruSayisi = this.dogru;
        cog1YanlisSayisi = this.yanlis;
        
        this.cog1Net = dogru - (yanlis / 4.0f);
        cog1NetField.setText(String.valueOf(cog1Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    public void dogruYanlislariSifirla() //temizle butonunda kullanilacak
    {
        this.dogru = 0;  
        this.yanlis = 0;       
        
        this.edbDogruSayisi = 0;
        this.edbYanlisSayisi = 0;
        
        this.tarih1DogruSayisi = 0;
        this.tarih1YanlisSayisi = 0;
        
        this.cog1DogruSayisi = 0;
        this.cog1YanlisSayisi = 0;
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {  
        if((edbDogruSayisi+edbYanlisSayisi > this.EDB_SORUSAYISI) || (tarih1DogruSayisi+tarih1YanlisSayisi > this.TARIH1_SORUSAYISI)
                || (cog1DogruSayisi+cog1YanlisSayisi > this.COG1_SORUSAYISI))
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");      
    }

    
}
