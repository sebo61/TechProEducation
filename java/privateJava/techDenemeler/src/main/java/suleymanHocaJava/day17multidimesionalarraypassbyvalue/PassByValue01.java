package suleymanHoca.day17multidimesionalarraypassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {
        int shirtPrice = 200;
        // main metodun içindeki tüm metodlar "static" olmalıdır.
        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);

    }
    //discount methodu oluşturunuz.

    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;

        }
        return price;

    }
}
