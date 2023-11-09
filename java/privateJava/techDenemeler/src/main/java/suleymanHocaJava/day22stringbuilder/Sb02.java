package suleymanHoca.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse(); // Stringin teers cevrilmesi looplar ile de yapılır. bu kısa yoldur.
        System.out.println(sb1);
        sb1.reverse();
        sb1.deleteCharAt(6); //verilen indexteki karakteri siler.
        System.out.println(sb1);
        sb1.delete(0,4); //başlangıç indexi dahil, bitiş indexi hariç.
        System.out.println(sb1 );

        sb1.replace(2,5,"Xxxxxxx"); // 2 dahi l 5 hariç koyar.
        System.out.println(sb1);

        sb1.insert(2,"2023");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Lava");

        System.out.println(sb2.compareTo(sb3));

        //String e çevirir.
        // .toString()

        String str= sb1.toString().toUpperCase();
        System.out.println(str); //string

        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1); //StringBuilder


    }
}
