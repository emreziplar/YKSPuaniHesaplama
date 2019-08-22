
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DilBolumu extends AnaIslemler
{
    public static float dilNet;

    
    private final int DIL_SORUSAYISI = 80;
    private int dilDogruSayisi , dilYanlisSayisi;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField); 
      
        this.dilDogruSayisi = super.getDogru();
        this.dilYanlisSayisi = super.getYanlis();
    }
    
    
    public void dilNetHesapla(JTextField dilNetField , JLabel uyariMesajiLabel)
    {
        this.dilNet = dilDogruSayisi - (dilYanlisSayisi / 4.0f);
        dilNetField.setText(String.valueOf(dilNet));
        dogruYanlisKontrol(uyariMesajiLabel);
        
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {
        if( (dilDogruSayisi+dilYanlisSayisi) > this.DIL_SORUSAYISI )
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");      
    }
    
}
