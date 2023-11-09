package threads;
/*
    Birden fazla thread kullanılan bir uygulamada ,değişkenler performans nedeniyle CPU
    cache'inde tutulabilir.
    Bilgisayarın birden fazla CPU'su(çekirdek) olduğunu düşünürsek her thread farklı
     CPU üzerinde çalısabilir
    bu nedenle her thread değişkenlerin değerini CPU cache'ine farklı değerde yazabilir.

    "volatile" keywordü değişken üzerinde bir değişiklik olduğunda diğer threadler tarafından
     görünmesini garanti eder.
    "volatile" ile bir değişken CPU cache yerine bilgisayarın main memory'sinden okunur ve
     CPU cache yerine main memory'sine yazılır.
    non-volatile değişkenler için böyle bir garanti yoktur.
 */

public class Volatile {
    public static volatile int flag=0; // flag değerinin main memory ye yazılıp yine oradan okunmasını volatile garanti eder.


    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {// core1
            @Override
            public void run() {
                while (flag==0){
                    System.out.println("multithreading uygulamalar harika");
                }

            }
        });
thread1.start();
        Thread thread2=new Thread(new Runnable() { // core2
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
                flag++;
              System.out.println("flag değeri artırıldı.");
            }
        });
        thread2.start();



    }
}
