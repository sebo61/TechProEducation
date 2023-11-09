import java.util.Scanner;

public class ModulusHomework {
    public static void main(String[] args) {
        //3 basamaklı sayının rakamları toplamı nedir?

        Scanner input=new Scanner(System.in);

        System.out.println("lütfen 3 basamaklı bir sayı giriniz..:");
        int number=input.nextInt();
        System.out.println("Girilen sayı..:");

        int birlerBasamagi=number%10;
        number=number/10;

        int onlarBasamagi=number%10;
        number=number/10;
        int yuzlerBasamagi=number%10;

        System.out.println("Girilen sayı rakamları toplamı="+(birlerBasamagi+onlarBasamagi+yuzlerBasamagi));





    }
}
