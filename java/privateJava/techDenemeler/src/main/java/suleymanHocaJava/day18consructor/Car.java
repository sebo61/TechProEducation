package suleymanHocaJava.day18consructor;

/*
1) Acces Modifer+ () + {}
2)      i)constructor da return type yok, metodlarda var
        ii) metodlar yaptıkları işe göre isimlendirilir. constructorlar ise class ismi ile aynı
        iii) methodlar aksiyon için oluşturulur. consructorlar ise object oluşturmak içindir.
        iv) Constructor isimleri büyük harfle başlar.
3) farklı parametreli consructor lar kullanarak anyni class dan farkli özelliklere sahip objectler oluşturabiliriz.

 */
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;
    //default constructor. parametresi yok. dönüş tipi yok. body boş.java kıskanç.
    // siz default constructor yazarsanız java object class içindeki default constroctırı kullanttırmaz.

    public Car() {

    }

    //custom constrocter


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }
}
