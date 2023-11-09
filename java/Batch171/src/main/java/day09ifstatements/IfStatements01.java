package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //örnek 1:sayı 3 basamaklı ise ekrana sayı 3 basamakşlıdrı yazdıralım.
        int number = -123;
        number = Math.abs(number);

        if (number > 99 && number < 1000) {

            System.out.println("Sayı 3 basamaklıdır.");

            //ornek 2: bir strigneki tekrarsız karakterleri ekrana yazdırınız.
            //abbccdc

            String str = "aac";
            char ch1 = str.charAt(0);

            if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
                System.out.println(ch1);
            }
            char ch2 = str.charAt(1);

            if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
                System.out.println(ch2);
            }
            char ch3 = str.charAt(2);

            if (str.indexOf(ch3) == str.lastIndexOf(ch3)) {
                System.out.println(ch3);
            }


        }


    }
}
