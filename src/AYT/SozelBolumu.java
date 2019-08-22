
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SozelBolumu extends AnaIslemler
{
    public static float tarih2Net;
    public static float cog2Net;
    public static float felsefeNet;
    public static float dinNet;
    
    public void baslangicNetleri(JTextField tarih2NetField, JTextField cog2NetField, JTextField felsefeNetField, JTextField dinNetField)
    {
        this.tarih2Net = Float.valueOf(tarih2NetField.getText());
        this.cog2Net = Float.valueOf(cog2NetField.getText());
        this.felsefeNet = Float.valueOf(felsefeNetField.getText());
        this.dinNet = Float.valueOf(dinNetField.getText());
    }

    
    private final int TARIH2_SORUSAYISI = 11;
    private final int COG2_SORUSAYISI = 11;
    private final int FELSEFE_SORUSAYISI = 12;
    private final int DIN_SORUSAYISI = 6;
    
    private int dogru,yanlis;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField); 
        
        this.dogru = super.getDogru();
        this.yanlis = super.getYanlis();
    }
    
    
    private int tarih2DogruSayisi , tarih2YanlisSayisi;
    public void tarih2NetHesapla(JTextField tarih2NetField , JLabel uyariMesajiLabel)
    {
        tarih2DogruSayisi = this.dogru;
        tarih2YanlisSayisi = this.yanlis;
        
        this.tarih2Net = tarih2DogruSayisi - (tarih2YanlisSayisi / 4.0f);
        tarih2NetField.setText(String.valueOf(tarih2Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    private int cog2DogruSayisi , cog2YanlisSayisi;
    public void cog2NetHesapla(JTextField cog2NetField , JLabel uyariMesajiLabel)
    {
        cog2DogruSayisi = this.dogru;
        cog2YanlisSayisi = this.yanlis;
        
        this.cog2Net = cog2DogruSayisi - (cog2YanlisSayisi / 4.0f);
        cog2NetField.setText(String.valueOf(cog2Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    private int felsefeDogruSayisi , felsefeYanlisSayisi;
    public void felsefeNetHesapla(JTextField felsefeNetField , JLabel uyariMesajiLabel)
    {
        felsefeDogruSayisi = this.dogru;
        felsefeYanlisSayisi = this.yanlis;
        
        this.felsefeNet = felsefeDogruSayisi - (felsefeYanlisSayisi / 4.0f);
        felsefeNetField.setText(String.valueOf(felsefeNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    private int dinDogruSayisi , dinYanlisSayisi;
    public void dinNetHesapla(JTextField dinNetField , JLabel uyariMesajiLabel)
    {
        dinDogruSayisi = this.dogru;
        dinYanlisSayisi = this.yanlis;
        
        this.dinNet = dinDogruSayisi - (dinYanlisSayisi / 4.0f);
        dinNetField.setText(String.valueOf(dinNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {  
        if((tarih2DogruSayisi+tarih2YanlisSayisi > this.TARIH2_SORUSAYISI) || (cog2DogruSayisi+cog2YanlisSayisi > this.COG2_SORUSAYISI)
             || (felsefeDogruSayisi+felsefeYanlisSayisi > this.FELSEFE_SORUSAYISI)  || (dinDogruSayisi+dinYanlisSayisi > this.DIN_SORUSAYISI))
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");      
    }
    
    
    public void dogruYanlislariSifirla()
    {
        this.dogru = 0;  
        this.yanlis = 0;       
        
        this.tarih2DogruSayisi = 0;
        this.tarih2YanlisSayisi = 0;
        
        this.cog2DogruSayisi = 0;
        this.cog2YanlisSayisi = 0;
        
        this.felsefeDogruSayisi = 0;
        this.felsefeYanlisSayisi = 0;
        
        this.dinDogruSayisi = 0;
        this.dinYanlisSayisi = 0;
    }
}
