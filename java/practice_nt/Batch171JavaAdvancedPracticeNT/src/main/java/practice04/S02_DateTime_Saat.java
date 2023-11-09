package practice04;

import java.time.LocalTime;
import java.util.Scanner;

public class S02_DateTime_Saat {
    public static void main(String[] args) {
        /*
         Kullanıcıya anlık saati ve dakikayı soran bir program yazmanız isteniyor.
         Ardından kullanıcının girdiği saat ve dakikayı kullanarak 1 saat 30 dakika sonrasının saatini ve dakikasını bulun.
         Elde edilen sonucu Türkçe olarak ekrana yazdırın.
    */
        Scanner input=new Scanner(System.in);
        System.out.println("saat bilgisini giiniz");
        int saat=input.nextInt();

        System.out.println("dakika bilgisini giiniz");
        int dakika=input.nextInt();

        LocalTime girilenSaat=LocalTime.of(saat,dakika);
       LocalTime ilerikiSaat= girilenSaat.plusHours(1).plusMinutes(30);
        int yeniSaat=ilerikiSaat.getHour();
        int yeniDakika=ilerikiSaat.getMinute();
        System.out.println("1 saat 30 dakika sonrası"+ yeniSaat+":"+yeniDakika);

    }
}
