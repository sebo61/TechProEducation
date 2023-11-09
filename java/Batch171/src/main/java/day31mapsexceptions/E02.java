package day31mapsexceptions;

public class E02 {
    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);

        String t = "1234a";
        convertStringToInt(t);


    }
    //içinde rakamlar dışında karakter olan stringi sayıya cevirmek isrseniz NumberformatException alırsınız.

    public static void convertStringToInt(String s) {

        try {

            Integer intS = Integer.valueOf(s);

            System.out.println(intS + 1);

        } catch (NumberFormatException e) {
            System.out.println("rakam dışı karakter olmamalı");
            System.out.println(e.getMessage());
        }
    }
}
