
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MatematikBolumu extends AnaIslemler
{
    public static float mat2Net;
    
    public void baslangicNetleri(JTextField mat2NetField) {
        this.mat2Net = Float.valueOf(mat2NetField.getText());
    }
    
    
    private final int MAT2_SORUSAYISI = 40;
    
    private int mat2DogruSayisi,mat2YanlisSayisi;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField); 
        
        this.mat2DogruSayisi = super.getDogru();
        this.mat2YanlisSayisi = super.getYanlis();
    }
    
    
    public void mat2NetHesapla(JTextField mat2NetFied,JLabel uyariMesajiLabel)
    {
        this.mat2Net = this.mat2DogruSayisi - (this.mat2YanlisSayisi / 4.0f);
        mat2NetFied.setText(String.valueOf(mat2Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {
        if( (mat2DogruSayisi+mat2YanlisSayisi) > this.MAT2_SORUSAYISI )
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");      
    }
    
    public void dogruYanlislariSifirla()
    {
        this.mat2DogruSayisi = 0;
        this.mat2YanlisSayisi = 0;
    }

}
