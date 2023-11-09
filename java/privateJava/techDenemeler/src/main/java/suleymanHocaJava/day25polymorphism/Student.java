package suleymanHoca.day25polymorphism;

public class Student {
    //Encapsulation: data saklamak (data hiding)
    // datayı nasıl saklarsınız. acces mpdifierını private yaparak
    // 1) get metodları hep public olur.
    // 2) get metodun return type ı okuduğu variaBLE IN RETURN type ı ile ayno olur.
    // set metod hep public olur. set metodun return typeı het void olur.
    // set metod parametre kullanır. parametrenin data typeı variable ile aynı olur.

    private String stdId="AC2023102T";
    public String stdName="Tom Hanks";
    public int age=23;
    private double gpa=3.87;
    private  boolean successful=false;
    // encaopsulation yaptığımız datayı istersek diğer classlardan okuyabiliriz.
    // get metod oluşturarark encapsulate edilmiş datanın dğerini okuruz.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
        // encapsulationda data type boolen ise get metod ismi "is" ile başlar.
    public boolean isSuccessful() {
        return successful;
    }
    //encapsulation yağtığımız datayı diğer classlardan nasıl değiştiririz?
    // set metod oluşturarak encapsulation edilmiş data nın değerini değiştirebiliriz.
    // set metod kullanarak var olan object üzerinde değişiklik yaparak o objecti sanki yeni bir objectmiş gibi kullanabiliriz.
    // set--> setter, get-->getter 'dır.


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
