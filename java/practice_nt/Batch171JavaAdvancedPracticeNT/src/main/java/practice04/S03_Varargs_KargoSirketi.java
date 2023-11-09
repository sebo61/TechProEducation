package practice04;

public class S03_Varargs_KargoSirketi {
    /*
       Bir kargo şirketi, gönderilen paketlerin toplam ağırlığını hesaplayan bir metot yazmanızı istiyor.
       Metot, paketlerin ağırlıklarını almalıdır. Paketlerin toplam ağırlığını döndüren ve
       hiç paket gönderilmediğinde 0 döndüren bir metot yazın.
   */
    public static void main(String[] args) {

           double toplam= toplamAgirlikHesapla(); //istediğimiz kadar gireriz.
        System.out.println(toplam);
    }



    public static double toplamAgirlikHesapla(double... a) {
        double sum = 0;
        for (double w : a) {
            sum += w;


        }
        return sum;
    }

}
