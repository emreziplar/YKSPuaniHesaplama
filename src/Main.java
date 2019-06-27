
import java.util.Scanner;


public class Main 
{
    private static Scanner input=new Scanner(System.in);
    
    private static TYT tytObj;
    private static EsitAgirlik esitAgirlikObj;
    private static Sozel sozelObj;
    private static Sayisal sayisalObj;
    
    
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.println("YKS PUAN HESAPLAMA SISTEMINE HOSGELDINIZ \n\n");
        
        TYTHesaplama();  
        AYTEsitAgirlik();
        AYTSozel();
        AYTSayisal();
        
        sonDurumuYazdir();
    }
    
        
    /*      
    TYT PUANI  
    */
    
    public static void TYTHesaplama() throws InterruptedException
    {               
        System.out.println("TYT Puani Icin Istenilen Bilgileri Giriniz.\n");
        
        System.out.print("Turkce Testi Dogru Sayisi: ");
        int trD=input.nextInt();
        System.out.print("Turkce Testi Yanlis Sayisi: ");
        int trY=input.nextInt();
        
        double trNet = trD-(trY/4);
        
        System.out.print("\nSosyal Testi Dogru Sayisi: ");
        int sosD=input.nextInt();
        System.out.print("Sosyal Testi Yanlis Sayisi: ");
        int sosY=input.nextInt();
        
        double sosNet = sosD-(sosY/4);
        
        System.out.print("\nMatematik Testi Dogru Sayisi: ");
        int matD=input.nextInt();
        System.out.print("Matematik Testi Yanlis Sayisi: ");
        int matY=input.nextInt();
        
        double matNet = matD-(matY/4);
        
        System.out.print("\nFen Testi Dogru Sayisi: ");
        int fenD=input.nextInt();
        System.out.print("Fen Testi Dogru Sayisi: ");
        int fenY=input.nextInt();
        
        double fenNet = fenD-(fenY/4);
        
        tytObj=new TYT(trNet,sosNet,matNet,fenNet);
        
        System.out.println("\nTYT Puani Hesaplaniyor..");
        Thread.sleep(3000);
        System.out.println("TYT Puaniniz: " + (tytObj.puanHesapla()+100) ) ; //+100 OSYM Tarafindan Verilen Puandir
    }
    
    /*
    .
    .
    */
    
    
    /*    
    ESIT AGIRLIK PUANI  
    */    
    public static void AYTEsitAgirlik() throws InterruptedException
    {
        System.out.println("\nEsit Agirlik Puani Icin Istenilen Bilgileri Giriniz.\n");
        
        System.out.print("Edebiyat Testi Dogru Sayisi: ");
        int edbD=input.nextInt();
        System.out.print("Edebiyat Testi Yanlis Sayisi: ");
        int edbY=input.nextInt();
        
        double edbNet=edbD-(edbY/4);
        
        System.out.print("\nTarih-1 Testi Dogru Sayisi: ");
        int tar1D=input.nextInt();
        System.out.print("Tarih-1 Testi Yanlis Sayisi: ");
        int tar1Y=input.nextInt();
        
        double tar1Net=tar1D-(tar1Y/4);
        
        System.out.print("\nCografya-1 Testi Dogru Sayisi: ");
        int cog1D=input.nextInt();
        System.out.print("Cografya-1 Testi Yanlis Sayisi: ");
        int cog1Y=input.nextInt();
        
        double cog1Net=cog1D-(cog1Y/4);
        
        System.out.print("\nMatematik Testi Dogru Sayisi: ");
        int mat2D=input.nextInt();
        System.out.print("Matematik Testi Yanlis Sayisi: ");
        int mat2Y=input.nextInt();
        
        double mat2Net=mat2D-(mat2Y/4);
        
        esitAgirlikObj=new EsitAgirlik(edbNet, tar1Net, cog1Net,mat2Net);
        
        System.out.println("\nEsit Agirlik Puani Hesaplaniyor..");
        Thread.sleep(3000);
        System.out.println("ESIT AGIRLIK PUANI: " + (esitAgirlikObj.puanHesapla() + 100) ); //+100 OSYM Tarafindan Verilen Puandir
    }
    
    /*
    .
    .
    */
    
    
    /*    
    SOZEL PUANI  
    */
    public static void AYTSozel() throws InterruptedException
    {
        System.out.println("\nSozel Puani Icin Istenilen Bilgileri Giriniz.\n");
        
        System.out.print("Tarih-2 Testi Dogru Sayisi: ");
        int tar2D=input.nextInt();
        System.out.print("Tarih-2 Testi Yanlis Sayisi: ");
        int tar2Y=input.nextInt();
        
        double tar2Net=tar2D-(tar2Y/4);
        
        System.out.print("\nCografya-2 Testi Dogru Sayisi: ");
        int cog2D=input.nextInt();
        System.out.print("Cografya-2 Testi Yanlis Sayisi: ");
        int cog2Y=input.nextInt();
        
        double cog2Net=cog2D-(cog2Y/4);
        
        System.out.print("\nFelsefe Testi Dogru Sayisi: ");
        int felD=input.nextInt();
        System.out.print("Felsefe Testi Yanlis Sayisi: ");
        int felY=input.nextInt();
        
        double felNet=felD-(felY/4);
        
        System.out.print("\nDin Kulturu Testi Dogru Sayisi: ");
        int dinD=input.nextInt();
        System.out.print("Din Kulturu Testi Yanlis Sayisi: ");
        int dinY=input.nextInt();
        
        double dinNet=dinD-(dinY/4);
        
        sozelObj=new Sozel(tar2Net,cog2Net,felNet,dinNet);
        
        System.out.println("\nSozel Puani Hesaplaniyor..");
        Thread.sleep(3000);
        System.out.println("SOZEL PUANI: " + (sozelObj.puanHesapla() + 100) ); //+100 OSYM Tarafindan Verilen Puandir
    }
    
    /*
    .
    .
    */
    
    
    /*    
    SAYISAL PUANI  
    */
    public static void AYTSayisal() throws InterruptedException
    {
        System.out.println("\nSayisal Puani Icin Istenilen Bilgileri Giriniz.\n");
        
        System.out.print("Matematik Testi Dogru Sayisi: ");
        int mat2D=input.nextInt();
        System.out.print("Matematik Testi Yanlis Sayisi: ");
        int mat2Y=input.nextInt();
        
        double mat2Net=mat2D-(mat2Y/4);
        
        System.out.print("\nFizik Testi Dogru Sayisi: ");
        int fizD=input.nextInt();
        System.out.print("Fizik Testi Yanlis Sayisi: ");
        int fizY=input.nextInt();
        
        double fizNet=fizD-(fizY/4);
        
        System.out.print("\nKimya Testi Dogru Sayisi: ");
        int kimD=input.nextInt();
        System.out.print("Kimya Testi Yanlis Sayisi: ");
        int kimY=input.nextInt();
        
        double kimNet=kimD-(kimY/4);
        
        System.out.print("\nBiyoloji Testi Dogru Sayisi: ");
        int biyoD=input.nextInt();
        System.out.print("Biyoloji Testi Yanlis Sayisi: ");
        int biyoY=input.nextInt();
        
        double biyoNet=biyoD-(biyoY/4);
        
        sayisalObj=new Sayisal(mat2Net,fizNet,kimNet,biyoNet);
        
        System.out.println("\nSayisal Puani Hesaplaniyor..");
        Thread.sleep(3000);
        System.out.println("SAYISAL PUANI: " + (sayisalObj.puanHesapla() + 100) ); //+100 OSYM Tarafindan Verilen Puandir
    }
    
    
    public static void sonDurumuYazdir() throws InterruptedException
    {
        System.out.println("\nPUAN TABLOSU GETIRILIYOR...");
        Thread.sleep(4000);
        System.out.println("\nTYT Puani: " + (tytObj.puanHesapla()+100)
                          +"\nEsit Agirlik Puani: "+(esitAgirlikObj.puanHesapla()+100) 
                          +"\nSozel Puani: "+(sozelObj.puanHesapla()+100)
                          +"\nSayisal Puani: "+(sayisalObj.puanHesapla()+100)+"");
    }
}
