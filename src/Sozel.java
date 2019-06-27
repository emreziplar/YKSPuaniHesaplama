
public class Sozel extends AYT_Katsayilar
{
    private double tarih2Net;
    private double cog2Net;
    private double felsefeNet;
    private double dinNet;
    
    public Sozel(double tarih2Net, double cog2Net, double felsefeNet, double dinNet) 
    {
        this.tarih2Net = tarih2Net;
        this.cog2Net = cog2Net;
        this.felsefeNet = felsefeNet;
        this.dinNet = dinNet;
    }

    @Override
    double puanHesapla() 
    {       
        double esitAgirlikHesabi = EsitAgirlik.edbNet*EDB_KATSAYI + EsitAgirlik.tar1Net*TARIH1_KATSAYI + EsitAgirlik.cog1Net*COG1_KATSAYI;
        
        double sozelHesabi = tarih2Net*TARIH2_KATSAYI + cog2Net*COG2_KATSAYI + felsefeNet*FELSEFE_KATSAYI + dinNet*DINKLTR_KATSAYI;
        
        return tytPuani + esitAgirlikHesabi + sozelHesabi; //YKS Sozel Puani
    }
       
}
