
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TYTBolumu extends AnaIslemler
{
    
    public static float trNet;
    public static float sosyalNet;
    public static float mat1Net;
    public static float fenNet;
        
    public void baslangicNetleri(JTextField trNetField , JTextField sosyalNetField , JTextField mat1NetField , JTextField fenNetField) 
    {
        this.trNet = Float.valueOf(trNetField.getText());
        this.sosyalNet = Float.valueOf(sosyalNetField.getText());
        this.mat1Net = Float.valueOf(mat1NetField.getText());
        this.fenNet = Float.valueOf(fenNetField.getText());
    }
    
    
    
    private final int TR_SORUSAYISI = 40;
    private final int SOSYAL_SORUSAYISI = 20;
    private final int MAT1_SORUSAYISI = 40;
    private final int FEN_SORUSAYISI = 20;
    
    private int dogru , yanlis;
    
    @Override
    public void dogruYanlisGonder(JTextField dogruField, JTextField yanlisField) {
        super.dogruYanlisGonder(dogruField, yanlisField); 
        
        this.dogru = super.getDogru();
        this.yanlis = super.getYanlis();
    }
    
        
    private float trDogruSayisi , trYanlisSayisi;
    public void trNetHesapla(JTextField trNetField , JLabel uyariMesajiLabel)
    {
        trDogruSayisi = this.dogru;
        trYanlisSayisi = this.yanlis;
        
        this.trNet = trDogruSayisi - (trYanlisSayisi / 4.0f);
        trNetField.setText(String.valueOf(trNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    
    private float sosyalDogruSayisi , sosyalYanlisSayisi;
    public void sosyalNetHesapla(JTextField sosyalNetField , JLabel uyariMesajiLabel)
    {
        sosyalDogruSayisi = this.dogru;
        sosyalYanlisSayisi = this.yanlis;
        
        this.sosyalNet = sosyalDogruSayisi - (sosyalYanlisSayisi / 4.0f);
        sosyalNetField.setText(String.valueOf(sosyalNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    
    private float mat1DogruSayisi , mat1YanlisSayisi;
    public void mat1NetHesapla(JTextField mat1NetField , JLabel uyariMesajiLabel)
    {
        mat1DogruSayisi = this.dogru;
        mat1YanlisSayisi = this.yanlis;
        
        this.mat1Net = mat1DogruSayisi - (mat1YanlisSayisi / 4.0f);
        mat1NetField.setText(String.valueOf(mat1Net));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
    
    
    
    private float fenDogruSayisi , fenYanlisSayisi;
    public void fenNetHesapla(JTextField fenNetField , JLabel uyariMesajiLabel)
    {
        fenDogruSayisi = this.dogru;
        fenYanlisSayisi = this.yanlis;
        
        this.fenNet = fenDogruSayisi - (fenYanlisSayisi / 4.0f);
        fenNetField.setText(String.valueOf(fenNet));
        
        dogruYanlisKontrol(uyariMesajiLabel);
    }
   
    
    
    public void dogruYanlisKontrol(JLabel uyariMesajiLabel)
    {  
        if((trDogruSayisi+trYanlisSayisi > this.TR_SORUSAYISI) || (sosyalDogruSayisi+sosyalYanlisSayisi > this.SOSYAL_SORUSAYISI)
                || (mat1DogruSayisi+mat1YanlisSayisi > this.MAT1_SORUSAYISI) || (fenDogruSayisi+fenYanlisSayisi > this.FEN_SORUSAYISI))
            uyariMesajiLabel.setText(super.uyariMesaji);
        else 
            uyariMesajiLabel.setText("");      
    }
    
    
    
    public void dogruYanlislariSifirla() //temizle butonuna basildiginda kullanilacak
    {
        this.trDogruSayisi = 0;
        this.trYanlisSayisi = 0;
        
        this.sosyalDogruSayisi = 0;
        this.sosyalYanlisSayisi = 0;
        
        this.mat1DogruSayisi = 0;
        this.mat1YanlisSayisi = 0;
        
        this.fenDogruSayisi = 0;
        this.fenYanlisSayisi = 0;
    }
}
