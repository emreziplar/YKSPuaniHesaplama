
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EsitAgirlikBolumu 
{
    private float edbNet;
    private float tarih1Net;
    private float cog1Net;
    private float mat2Net;
    
    public void baslangicNetleri(JTextField edbNetField,JTextField tarih1NetField,JTextField cog1NetField,JTextField mat2NetField)
    { 
       //baslangic netleri olarak net kutucuklarinda yer alan 0'lar gelecek
       this.edbNet = Float.valueOf(edbNetField.getText());
       this.tarih1Net = Float.valueOf(tarih1NetField.getText());
       this.cog1Net = Float.valueOf(cog1NetField.getText());
       this.mat2Net = Float.valueOf(mat2NetField.getText());
    }
    
    
    
    private final int edbSoruSayisi = 24;
    private final int tarih1SoruSayisi = 10;
    private final int cog1SoruSayisi = 6;
    
    private float dogru,yanlis;
    
    public void dogruYanlisAl(JTextField dogruField , JTextField yanlisField)
    {
        String dogruAlani = dogruField.getText();
        String yanlisAlani = yanlisField.getText();
        
        if (!dogruAlani.equals("") && !yanlisAlani.equals(""))
        {
            dogru = Float.valueOf(dogruAlani);
            yanlis = Float.valueOf(yanlisAlani);      
        }
        else if (!dogruAlani.equals("") &&  yanlisAlani.equals(""))
        {
            dogru = Float.valueOf(dogruAlani);
            yanlis = 0;            
        }
        else if (dogruAlani.equals("") && !yanlisAlani.equals(""))
        {
            dogru = 0;
            yanlis = Float.valueOf(yanlisAlani);           
        }
        else 
        {
            dogru = 0;
            yanlis = 0;            
        }        
    }
    
    
    private float edbDogruSayisi,edbYanlisSayisi;    
    public void edbNetHesapla(JTextField edbNetField,JLabel uyariMesajiLabel)
    {
        edbDogruSayisi = this.dogru;
        edbYanlisSayisi = this.yanlis;
        
        this.edbNet = edbDogruSayisi - (edbYanlisSayisi / 4.0f);
        edbNetField.setText(String.valueOf(edbNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    private float tarih1DogruSayisi,tarih1YanlisSayisi;
    public void tarih1NetHesapla(JTextField tarih1NetField,JLabel uyariMesajiLabel)
    {
        tarih1DogruSayisi = this.dogru;
        tarih1YanlisSayisi = this.yanlis;
        
        this.tarih1Net = dogru - (yanlis / 4.0f);
        tarih1NetField.setText(String.valueOf(tarih1Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    private float cog1DogruSayisi,cog1YanlisSayisi;
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
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {
        String mesaj = "<html><b>UYARI:</b> Doğru ve Yanlış Sayıları Toplamı Soru Sayısını Geçemez</html>";
        
        if((edbDogruSayisi+edbYanlisSayisi > this.edbSoruSayisi) || (tarih1DogruSayisi+tarih1YanlisSayisi > this.tarih1SoruSayisi)
                || (cog1DogruSayisi+cog1YanlisSayisi > this.cog1SoruSayisi))
            uyariMesajiLabel.setText(mesaj);
        else 
            uyariMesajiLabel.setText("");
    }
}
