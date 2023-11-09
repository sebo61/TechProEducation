package suleymanHocaJava.day28interface;


public interface Animal {
    void eat();
    void drink();
    // interfacedeki tüm variable lar final dır. Bu yüzden interface içindeki variable ı oluşturduğunuda mutlaka değer ataması
    // yapmalıyız.
    // Bilindiği gibi final variable ların değerleri değştirilemez.
    // interface'de ki tüm variable'lar varsayılan public'dir.
    // interfacede'ki tüm varible'lar varsayılan "static" dir.
    int age=4;
}
