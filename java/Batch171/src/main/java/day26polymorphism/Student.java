package day26polymorphism;

public class Student {
    // Encapsulation ==>kapsülleme
    /*
    Encapsulation nedir? Data Hiding (veri gizleme)
    Data nasıl saklanır?
    Acces modifierlarını private yaparak datayi diğer classlardan gorunmez hale getiririm. bölece datayı saklarız
      Emcapsulation yaptığımız datayı istersek diğer classlardan okuyabiliriz.
      nasıl okuruz?
      getmethod oluşturarak encapsulation edilmiş datanın değerini okuyabiliriz.

       1) get methodlar public olur.
       2) get metodun return type ı okuduğum variadla ın typeı ile ayna olur.
       3) get method bir boolean variable için oluşturulduysa ismi is ile başlar
        not:set metod kullanarak var olan obje üzerinde değiliklikler yaparak o objeyi sanki yeni bir obje imiş gibi kulanabiliriz.
        not 2: get metodların diğer adı getter, set metodların diğer adı setter dır.
               getter ve setter ların ikisine birden "java Beans" denir.

       örnek ==>isSuccessful()
     */

    private String stdId = "AC323424";
    public String stdNames = "ali can";
    public int age = 13;
    private double notOrt = 3.13;
    private boolean isSuccessful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
    /*
    Encapsulation yaptığımız datayı istersek diğer classlardan nasıl değiştirebiliriz?
    "set method" oluşturarark encapsulate edilmiş datanın değerini değiştirebiliriz.
     1) set metodlar hep public olur.
     2) set metodların return type ı her void olur.
     3) set metodlar parametre kullanır, parametrenin data typeı değişkenin data type ı olur



         */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {

        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {

        isSuccessful = successful;
    }
}
