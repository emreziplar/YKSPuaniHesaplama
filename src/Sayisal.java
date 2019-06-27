
public class Sayisal extends AYT_Katsayilar
{
    static double matNet;
    private double fizikNet;
    private double kimyaNet;
    private double biyoNet;

    public Sayisal(double matNet, double fizikNet, double kimyaNet, double biyoNet) 
    {
        this.matNet = matNet;
        this.fizikNet = fizikNet;
        this.kimyaNet = kimyaNet;
        this.biyoNet = biyoNet;
    }

    @Override
    double puanHesapla() 
    {
        double sayisalPuani = matNet*MAT_KATSAYI + fizikNet*FIZIK_KATSAYI + kimyaNet*KIMYA_KATSAYI + biyoNet*BIYO_KATSAYI;
        return tytPuani + sayisalPuani; //YKS Sayısal Puani
    }
       
    
}
