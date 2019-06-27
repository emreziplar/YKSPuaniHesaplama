
public class EsitAgirlik extends AYT_Katsayilar 
{  
    static double edbNet;
    static double tar1Net;
    static double cog1Net;
    private double matNet;
    
    public EsitAgirlik(double edbNet,double tar1Net,double cog1Net,double matNet)  
    {
        this.edbNet=edbNet;
        this.tar1Net=tar1Net;
        this.cog1Net=cog1Net;
        this.matNet=matNet;
    }

    
    @Override
    double puanHesapla() 
    {                
        double esitAgirlikPuani = edbNet*EDB_KATSAYI + tar1Net*TARIH1_KATSAYI + cog1Net*COG1_KATSAYI + matNet*MAT_KATSAYI;
        return tytPuani + esitAgirlikPuani; //YKS Esit Agirlik Puani    
    } 
    
}
