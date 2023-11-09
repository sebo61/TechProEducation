package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_DoWhile_TopunSicramasi {
    public static void main(String[] args) {
        /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç metreden bırakalım");
        double yukseklik= input.nextDouble();
        double toplamYol=0;
        int yereVurmaSayisi=0;

        do{
            yereVurmaSayisi++;



            toplamYol=toplamYol+yukseklik;

            yukseklik=yukseklik*0.75;

            toplamYol=toplamYol+yukseklik;



        }while(yukseklik>1);
        yereVurmaSayisi++;
        toplamYol=toplamYol+yukseklik;

        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(yereVurmaSayisi);
        System.out.println(df.format(toplamYol));
    }
}
