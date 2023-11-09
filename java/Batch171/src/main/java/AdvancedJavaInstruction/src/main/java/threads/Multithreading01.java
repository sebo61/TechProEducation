package threads;

public class Multithreading01 {
    public static void main(String[] args) throws InterruptedException {
        // task: 1 den 10 kadar sayıları ekrana 2 defa yazdırınız.
        /*Long start=System.currentTimeMillis();
        Counter counter1=new Counter("Abdullah");
        counter1.countMe();
        Counter counter2=new Counter("Halil");
        counter2.countMe();
        Long finish=System.currentTimeMillis();
        System.out.println("Thread kullanmadan geçen süre: "+(finish-start)); //10194*/
        System.out.println("***************multithreading***************");
        Long start=System.currentTimeMillis();
        CounterWithMultiThread counter3=new CounterWithMultiThread("süleyman");
        CounterWithMultiThread counter4=new CounterWithMultiThread("Hasan");
        counter3.start();
        counter4.start();


        counter3.join(); //hangi thread içinde çağrılmışsa bu threadi counter3 thredimiz işini bitirene kadar bekler
              counter4.join();
        Long finish=System.currentTimeMillis();
        System.out.println("Thread kullanarak geçen süre: "+(finish-start)); //

    }
}
class Counter{
    private String name;
    // paran constrector


    public Counter(String name) {
        this.name = name;
    }

    // 1 den 10  kadar yazdırma
    public  void countMe() throws InterruptedException {


        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500); //main thread 0.5 sn uyuyacak
            System.out.println(i+"-"+name);

        }
    }


}
class CounterWithMultiThread extends Thread{

    private String name;

    public CounterWithMultiThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(500);//main thread 0.5 sn uyusun
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" - "+name);
        }
    }
}