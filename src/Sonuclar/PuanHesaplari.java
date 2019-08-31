
import javax.swing.JTextField;


public class PuanHesaplari extends Katsayilar
{    
    private final int OSYM_TABANPUAN = 100; //puanlara ek olarak osym'nin vermis oldugu puan
    private final float BASARI_PUANI = OBPFrame.obp; //yerlestirme puanina eklenecek olan puan

    
    private float tytPuan;
    
    private float trNet = TYTBolumu.trNet;
    private float sosyalNet = TYTBolumu.sosyalNet;
    private float mat1Net = TYTBolumu.mat1Net;
    private float fenNet = TYTBolumu.fenNet;
    
    public void tytPuanHesapla(JTextField tytHamPuanField , JTextField tytYerPuanField)
    {
        this.tytPuan = (float)(trNet * TR_KATSAYI + sosyalNet * SOS_KATSAYI + mat1Net * MAT1_KATSAYI + fenNet * FEN_KATSAYI);        
        
        float tytHamPuanSonucu = tytPuan + OSYM_TABANPUAN;
        float tytYerPuanSonucu = tytPuan + OSYM_TABANPUAN + BASARI_PUANI;
        
        tytHamPuanField.setText(String.valueOf(tytHamPuanSonucu));
        tytYerPuanField.setText(String.valueOf(tytYerPuanSonucu));
    }
    
    private float tytPuaniAl() {       
        return  trNet * TYT_TRKATSAYI + sosyalNet * TYT_SOSKATSAYI + mat1Net * TYT_MAT1KATSAYI + fenNet * TYT_FENKATSAYI; //ayt puanlarinda kullanilcak
    }
  
    
    
    private float mat2Net = MatematikBolumu.mat2Net;
    private float fizikNet = FenBolumu.fizikNet;
    private float kimyaNet = FenBolumu.kimyaNet;
    private float biyoNet = FenBolumu.biyoNet;
    
    public void sayPuanHesapla(JTextField sayHamPuanField , JTextField sayYerPuanField)
    {
        float sayPuan = (float)(mat2Net * MAT2_KATSAYI + fizikNet * FIZIK_KATSAYI + kimyaNet * KIMYA_KATSAYI + biyoNet * BIYO_KATSAYI); 
        
        float sayHamPuanSonucu = sayPuan + tytPuaniAl() + OSYM_TABANPUAN; //tyt'den gelen puani da ekliyoruz
        float sayYerPuanSonucu = sayPuan + tytPuaniAl() + OSYM_TABANPUAN + BASARI_PUANI; 
        
        sayHamPuanField.setText(String.valueOf(sayHamPuanSonucu));
        sayYerPuanField.setText(String.valueOf(sayYerPuanSonucu));
    }
    
    
    private float edbNet = EsitAgirlikBolumu.edbNet;
    private float tarih1Net = EsitAgirlikBolumu.tarih1Net;
    private float cog1Net = EsitAgirlikBolumu.cog1Net;
    
    public void eAgirlikPuanHesapla(JTextField eAgirlikHamPuanField , JTextField eAgirlikYerPuanField)
    {             
        float eAgirlikPuan = (float)(mat2Net * MAT2_KATSAYI + edbNet * EDB_KATSAYI + tarih1Net * TARIH1_KATSAYI + cog1Net * COG1_KATSAYI); 
        
        float eAgirlikPuanSonucu = eAgirlikPuan + tytPuaniAl() + OSYM_TABANPUAN; 
        float eAgirlikYerPuanSonucu = eAgirlikPuan + tytPuaniAl() + OSYM_TABANPUAN + BASARI_PUANI; 
        
        eAgirlikHamPuanField.setText(String.valueOf(eAgirlikPuanSonucu));
        eAgirlikYerPuanField.setText(String.valueOf(eAgirlikYerPuanSonucu));
    }
    
    
    private float tarih2Net = SozelBolumu.tarih2Net;
    private float cog2Net = SozelBolumu.cog2Net;
    private float felsefeNet = SozelBolumu.felsefeNet;
    private float dinNet = SozelBolumu.dinNet;
    
    public void sozelPuanHesapla(JTextField sozelHamPuanField , JTextField sozelYerPuanField)
    {
        float eA = edbNet * EDB_KATSAYI + tarih1Net * TARIH1_KATSAYI + cog1Net * COG1_KATSAYI ;
        float sozelPuan = eA + tarih2Net * TARIH2_KATSAYI + cog2Net * COG2_KATSAYI + felsefeNet * FELSEFE_KATSAYI + dinNet * DINKLTR_KATSAYI; 
        
        float sozelHamPuanSonucu = sozelPuan + tytPuaniAl() + OSYM_TABANPUAN; 
        float sozelYerPuanSonucu = sozelPuan + tytPuaniAl() + OSYM_TABANPUAN + BASARI_PUANI; 
        
        sozelHamPuanField.setText(String.valueOf(sozelHamPuanSonucu));
        sozelYerPuanField.setText(String.valueOf(sozelYerPuanSonucu));
    }
    
    
    
    private float dilNet = DilBolumu.dilNet;
    
    public void dilPuanHesapla(JTextField dilHamPuanField , JTextField dilYerPuanField)
    {
        float dilPuan = dilNet * 3; 
        
        if(dilNet > 0 ) //kullanici dil puanini hesaplamassa puan kutucugunda bir sey yazmasin
        {
            float dilHamPuanSonucu = dilPuan + tytPuaniAl() + OSYM_TABANPUAN; //tyt'den gelen puani da ekliyoruz
            float dilYerPuanSonucu = dilPuan + tytPuaniAl() + OSYM_TABANPUAN + BASARI_PUANI; 
            
            dilHamPuanField.setText(String.valueOf(dilHamPuanSonucu));
            dilYerPuanField.setText(String.valueOf(dilYerPuanSonucu));
        }   
            
    }
    
}
