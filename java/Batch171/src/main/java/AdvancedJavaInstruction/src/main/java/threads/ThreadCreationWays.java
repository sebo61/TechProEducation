package threads;

public class ThreadCreationWays {

    public static void main(String[] args) throws InterruptedException {

        //her Java uygulaması en azından 1 thread kullanır:main thread
        System.out.println("Mevcut thread: "+Thread.currentThread().getName());

        MyThread thread1=new MyThread();
        //thread1.run();-->sadece codeları çalıştırır, thread oluşmaz, main thread devam eder
        thread1.start();//run başlatır ve run metodunu çağırır
        // 2. yöntem runable

        MyRunnable myRunnable=new MyRunnable();
        Thread thread2=new Thread(myRunnable);
        thread2.start();

        // anonymous class: isimsiz class
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); // 3 saniye uyu
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Çalışan thread:"+Thread.currentThread().getName());
                System.out.println("bu thread anonymous class ile oluşturuldu...");
            }
        });
        thread3.setName("threadcik");
        thread3.start();

        //runnable:functional interface-->lambda expression kullanılabilir
        Thread thread4=new Thread(()->{
            System.out.println("Çalışan thread:"+Thread.currentThread().getName());
            System.out.println("Bu thread lambda expression ile oluştu...");

        });
        thread4.start();


        System.out.println("burada main metodu sona erdi");

    }


}

//thread oluşturmanın 2 tane yolu var
//1.YOL:Thread Classını extend ederek
class MyThread extends Thread{

    @Override
    public void run() {
        //threade yaptırmak istediğimiz işler
        System.out.println("Çalışan thread:"+Thread.currentThread().getName());
        System.out.println("MyThread threadi çalışıyor...");
    }
}

//2.YOL: Runnable Interfaceini implemente ederek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Çalışan thread:"+Thread.currentThread().getName());
        System.out.println("Runnable interfaceinden oluşan thread çalışıyor...");

    }
}