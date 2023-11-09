package day20statickeywordconstructors;

import javax.xml.transform.sax.SAXTransformerFactory;

public class Car {
    /*
    Constructer nedir?
    Class'dan object üretmemize yarayan kod bloklarıdır.
    Class oluşturduğumuzda java bize otomatik olarak bir contructor verir. Ama bu consructor gözle görülmez.
    Gözle görümeyen otomatik olarak java tarından verilen bu consructorlara "default constructor" denir.
    "default constructor" "Car() {}" şeklindedir.

    Bir klasta farklı parametreler kullanarak istediğimiz kadar constructor oluşturabiliriz.
    farklı constructorlar sayesinde bir clasttan farklı farklı objeler oluşturabilirsiniz.
    1) consructor nasıl oluşturulur?
     Access mpdifier +class ismi+()+{}
   Interview sorusu:
     2)method ile constroctur arasındaki farklar nelerdir?
    a)methodlarda return type olur, consrructorlarda olmaz.
    b) Methodlar yaptıkları ile, constructorlar ise her zaman Class ismi ile isimlendirilir.
    c) methodlar bir aksiyon yapmak için oluştururlur. Constructerlar ise object oluşturmak içindir.
    d) Method isimleri küçük harfle başlar, Consructor isimleri class isimleri ile aynı olduğu için büyük
    harfle başlar.
   3)Parametreli Constructorlar olusturarak ayni class dan farkli ozelliklere sahip objectler olusturabiliriz
     */
    Car() {

    }

    String make = "Honda";
    String model = "Accord";
    int year = 2013;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

    }

    public Car(String make, String model) {
     this.make=make;
     this.model=model;

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
