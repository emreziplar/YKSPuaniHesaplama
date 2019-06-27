
public class TYT extends TYT_Katsayilar
{
    static double trNet;
    static double sosNet;
    static double matNet;
    static double fenNet;

    public TYT(double trNet, double sosNet, double matNet, double fenNet) 
    {
        this.trNet = trNet;
        this.sosNet = sosNet;
        this.matNet = matNet;
        this.fenNet = fenNet;
    }

    @Override
    double puanHesapla() 
    {
        return trNet*TR_KATSAYI + sosNet*SOS_KATSAYI + matNet*MAT_KATSAYI + fenNet*FEN_KATSAYI ; //TYT Puani 
    }

    
    
    
}
