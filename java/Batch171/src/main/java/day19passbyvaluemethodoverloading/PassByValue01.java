package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //note java "pass by value" sayesinde variable ların orjinal değerlerini korur.
        int shirtPrice = 100;
        System.out.println( discount ("student",shirtPrice));
        System.out.println(discount("veteran",shirtPrice));
        System.out.println(discount("senior", shirtPrice));


        System.out.println(shirtPrice); //100

        shirtPrice=discount("veteran",shirtPrice);
        System.out.println("kampanya fiyatı "+shirtPrice);
    }
    // discount metodunu oluşturalım

    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price=price;
        }
        return price;

    }
    //java "pass by value kullanır"
    //yani java, methodların orjinal değeri değiştirmesine izin vermez.
    //java methodlara değer yollarken orjinal değeri korur. kopyayı yollar.
    //java esnek bir dildir.istersek yazdığımız kpod ile orjinal değerin dişmesini de temin edebiliriz.
    // bakınız line 14
    //pass by reference da methoda reference yollanır. reference adres demektir
    // adres yollanınca method adresi kullanarak otjinal değere ulaşır ve orjinal değeri değiştirir.
    // bu yüzden C# gibi pass by reference kullanan dillerde method variable in orjinal değerini değiştirir.
 }
