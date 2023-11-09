package day24stringbuilder;

class Student {
    /*
    Acces Modifier
    1) public
    2)protected
    3)default // başına default yazılmaz.
    4)private

    note: public > protected > default > private
    public ==> her classtan ulaşılabilir.
    protected ==> protected olanlar başka package dan kullanılamaz. ancakk başka package da child class içinden kullanılabilir.
    default ==> default olanlar başka package dan kullanılamazlar.
    private ==> dafece oluşturuldukları class içinde kullanılabilirler.

    Note: "protected ile default " farkını söyleyiniz.

    protected olanlar başka package dan kullanılamaz ancak başka package da child class içinden kullanılabilir.
    default olanlar başka package dan kullanılamaz.

     */
    public String stdName = "Ali Can"; //jer class dan kullanılr.

    protected String address = "Istanbul"; //kendi package ve diğer package child class
    String email = "alican@gmail.com"; //sadece kendi package ı
    private String ssnId="68345738"; //sadece ouşturuldukları class içinde kullanılabilir.



}
