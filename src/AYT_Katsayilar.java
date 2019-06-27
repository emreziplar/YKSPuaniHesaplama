
public abstract class AYT_Katsayilar
{    
    /* ESIT AGIRLIK */
    
    final double EDB_KATSAYI=3;
    final double TARIH1_KATSAYI=2.8;
    final double COG1_KATSAYI=3.33;
    
    /***/
           
    
    /* SOZEL */
    
    final double TARIH2_KATSAYI=2.91;
    final double COG2_KATSAYI=2.91;
    final double FELSEFE_KATSAYI=3;
    final double DINKLTR_KATSAYI=3.33;
    
    /**/
           
    
    /* SAYISAL */
    
    final double MAT_KATSAYI=3;
    final double FIZIK_KATSAYI=2.85;
    final double KIMYA_KATSAYI=3.07;
    final double BIYO_KATSAYI=3.07;
    
    /**/
    
    
    /* TYT KISMINI EKLEMEK ICIN KATSAYILAR ve TYT'den GELECEK PUAN */
    
    final double TYT_TRKATSAYI=1.32;
    final double TYT_SOSKATSAYI=1.36;
    final double TYT_MATKATSAYI=1.32;
    final double TYT_FENKATSAYI=1.36;
    
    
    double tytPuani = TYT.trNet*TYT_TRKATSAYI + TYT.sosNet*TYT_SOSKATSAYI + TYT.matNet*TYT_MATKATSAYI + TYT.fenNet*TYT_FENKATSAYI;  
    //TYT class'ından gelen netleri ayt kisminda olusturdugumuz katsayilarla carparak tyt puanini elde ettik
    
    /**/

    public AYT_Katsayilar() {
    }
        
    
    
    abstract double puanHesapla();

        
}
