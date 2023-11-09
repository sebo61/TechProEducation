package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//stringin ters cevrilmesi looplR İLE DE YAPILIR.
        System.out.println(sb1);
        sb1.deleteCharAt(6);
        System.out.println(sb1); //verilen indexteki karakteri siler.
        sb1.delete(4, 7); // başlangıç indexi dhil bitiş indexi hariç olan karakterleri siler.
        System.out.println(sb1);
        sb1.replace(2, 5, "00000");//2 dahil 5 hariç yani index 2,3,4 karakterleri yerine "0" koyar.
        System.out.println(sb1);

        sb1.insert(3, "XXX"); // 3 adet say atla
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Hava");
        //SONUÇ SIFIR İSE ALFABETİK OLARAK AYNı sıradalar demektir.
        //-1 ise sb2 sb3 den alfabetik olarak önde demektir.
        //1 ise sb2 sb3 den alfabetik olarak bir sonra demektir.
        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);
        //StringBuilder nasıl stringe cevrilir.
         String str= sb2.toString().toUpperCase();
        System.out.println(str);// JAVA
        //string nasıl tekrar Stringe cevrilir.
        StringBuilder newSb2=new StringBuilder(str); //
        System.out.println(newSb2);

    }
}
