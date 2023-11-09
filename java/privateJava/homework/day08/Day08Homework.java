package homework.day08;

import java.util.Scanner;

public class Day08Homework {
    public static void main(String[] args) {
        // 1) Bir string variable oluşturunuz ve u string deki rakam olamayan tüm karakterlerin sayısını  konsola yazdırınız.

        String sentence = "Java 25 programlama dilinin zirvesinde";
        int karakter = sentence.replaceAll("[0-9]", "").length();
        System.out.println("Rakam olmayan karakter sayısı toplamı..: = " + karakter);
        // 2) bir string variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakteri konsola büyük harflerle yazdırınız.

        System.out.println("------------------------------------------------------");
        String firstLetter= sentence.substring(0,1);
        String lastLetter=sentence.substring(sentence.length()-1);

        String basiVeSonuEksik = sentence.substring(1, sentence.length() - 1).toUpperCase();
        System.out.println(firstLetter+ basiVeSonuEksik+lastLetter);

        System.out.println("------------------------------------------------------");
        // 3)bir strşing variable oluşturunuz. ilk ve son karakterlerin acsii değerleri toplamını konsola yazdırınız.

        char first = sentence.charAt(0);
        char end = sentence.charAt(sentence.length() - 1);
        System.out.println("first = " + first);
        System.out.println("end = " + end);
        System.out.println("İlk ve son karakter ASCII değer toplamları..:" + (first + end));
        System.out.println("------------------------------------------------------");
        //   4) tek kelimeli şehir ismi için string variable oluşturun. şehir ismini ilk harfini büyük harfle diğer
        // harflerini küçük harflerle konsola yazdırınız.
        String city = "aDANA";
        String newCity = city.toUpperCase().charAt(0) + city.toLowerCase().substring(1);
        System.out.println("newCity = " + newCity);
        /*
        5) aşağıdaki kurallara göre kullanıcının girdiği password u ontrol ediniz.

        a) en az 6 karakter olsun
        b) en az 1 tane büyük harf olsun.
        c) en az 1 tane küçük harf olsun
        d) en az 1 tane rakam olsun

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir password giriniz.");
        String passWord = input.nextLine();

        boolean passwordLenght = passWord.length() > 6;

        boolean upperCharacter = passWord.replaceAll("[^A-Z]", "").length() > 0;

        boolean lowerLetter = passWord.replaceAll("[^a-z]", "").length() > 0;

        boolean numberControl = passWord.replaceAll("[^0-9]", "").length() > 0;

        // System.out.println("" + passwordLenght + upperCharacter + lowerLetter + numberControl);

        if (passwordLenght && upperCharacter && lowerLetter && numberControl) {

            System.out.println("Password kurallara uygundur");
        }


    }
}