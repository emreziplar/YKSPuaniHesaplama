
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FenBolumu extends AnaIslemler
{
    public static float fizikNet;
    public static float kimyaNet;
    public static float biyoNet;
    
    public void baslangicNetleri(JTextField fizikNetField , JTextField kimyaNetField , JTextField biyoNetField)
    {
        this.fizikNet = Float.valueOf(fizikNetField.getText());
        this.kimyaNet = Float.valueOf(kimyaNetField.getText());
        this.biyoNet = Float.valueOf(biyoNetField.getText());
    }
    
    
    
    private int dogru,yanlis;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField);
        
        this.dogru = super.getDogru();
        this.yanlis = super.getYanlis();
    }
    
    
    private final int FIZIK_SORUSAYISI = 14;
    private final int KIMYA_SORUSAYISI = 13;
    private final int BIYO_SORUSAYISI = 13;
    
    
    private int fizikDogruSayisi,fizikYanlisSayisi;
    public void fizikNetHesapla(JTextField fizikNetField , JLabel uyariMesajiLabel)
    {
        fizikDogruSayisi = this.dogru;
        fizikYanlisSayisi = this.yanlis;
        
        this.fizikNet = fizikDogruSayisi - (fizikYanlisSayisi / 4.0f);
        fizikNetField.setText(String.valueOf(fizikNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    private int kimyaDogruSayisi,kimyaYanlisSayisi;
    public void kimyaNetHesapla(JTextField kimyaNetField , JLabel uyariMesajiLabel)
    {
        kimyaDogruSayisi = this.dogru;
        kimyaYanlisSayisi = this.yanlis;
        
        this.kimyaNet = kimyaDogruSayisi - (kimyaYanlisSayisi / 4.0f);
        kimyaNetField.setText(String.valueOf(kimyaNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    private int biyoDogruSayisi,biyoYanlisSayisi;
    public void biyoNetHesapla(JTextField biyoNetField , JLabel uyariMesajiLabel)
    {
        biyoDogruSayisi = this.dogru;
        biyoYanlisSayisi = this.yanlis;
        
        this.biyoNet = biyoDogruSayisi - (biyoYanlisSayisi / 4.0f);
        biyoNetField.setText(String.valueOf(biyoNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    public void dogruYanlislariSifirla()
    {
        this.dogru = 0;
        this.yanlis = 0;
        
        this.fizikDogruSayisi = 0;
        this.fizikYanlisSayisi = 0;
        
        this.kimyaDogruSayisi = 0;
        this.kimyaYanlisSayisi = 0;
        
        this.biyoDogruSayisi = 0;
        this.biyoYanlisSayisi = 0;
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {
        if((fizikDogruSayisi+fizikYanlisSayisi > this.FIZIK_SORUSAYISI) || (kimyaDogruSayisi+kimyaYanlisSayisi > this.KIMYA_SORUSAYISI)
                || (biyoDogruSayisi+biyoYanlisSayisi > this.BIYO_SORUSAYISI))
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");     
        
            
    }
            
}
