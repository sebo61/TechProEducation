package practice01;

public class S05_Sayiyi_Basamaklarina_Ayirma {
    public static void main(String[] args) {
         /*
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız.
        İpucu: / ve % kullanınız
        Sayı: 12345
        Çıktı: 1
               2
               3
               4
               5
    */

        int number=12345;

        int birler=number%10;
        int onlar=(number/10)%10;
        int yuzler=(number/100)%10;
        int binler=(number/1000)%10;
        int onBinler=(number/10000);

        System.out.println("Onbinler:"+onBinler+"\n"+"Onbinler:"+binler+"\n"+
                "Onbinler:"+yuzler+"\n"+"Onbinler:"+onlar+"\n"+"Onbinler:"+birler+"\n");




    }
}
