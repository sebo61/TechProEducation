package suleymanHocaJava.day18consructor;

public class Student {
    /*
    1) "static" "class memberlar (variable+ method+constructor+code blocks)" tüm objctcle tarafaından paylaşılır.
    2) static class memberlardaki değişiklikler tüm objectler tarafından görülür.
    3) static class memberlar gökteki ay in dünyay bağlıolduğu gibi class a bağlıdırlar.
    bu yüzden static variablara class variable denir. (-class seviyesinde-)
    4) static class memberların nasıl çalıştığını anlamak için cizim yapıp statiz olanları clasa olmayanları objeye bağlayarak düşünmek bu konuyu kolaulaştırırı
     5) static class memberları cağırmak için object oluşturmak gerekmez ve tabsiye edilmez.
        nno-static class memberları çağırmak için object oluşturmak şarttır.
         */


    public static int numOfRegisteredStd = 0;
    public int num = 0;


    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(numOfRegisteredStd);
        Student s2=new Student();
        System.out.println(numOfRegisteredStd);
        Student s3=new Student();
        System.out.println(numOfRegisteredStd);

        System.out.println(s1.num);

    }
}
