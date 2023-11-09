package day03methodobjectcreationscanner;

public class Car {
    //variable'lar oluşturuyoruz.

    public String model = "Tesla";
    public int fiyat = 20000;

    //aktif özellikler , methodları oluşturalım
    //not: "return type void olduğunda method içinde "return" keyword u kullanılmaz.
    public void hareket() {
        System.out.println("Tesla çok ızlı hareket eder");

    }

    public void dur() {
        System.out.println("Çok güvenli bir şekilde durur.");
    }


}
