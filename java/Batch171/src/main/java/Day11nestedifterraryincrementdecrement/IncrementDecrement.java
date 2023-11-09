package Day11nestedifterraryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        // Increment:arttırmak
        int a = 5;
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);

        //ornek 1: bir int variable oluşturun, ve 2 şekilde 5 arttıtrın

        int b = 7;
        b = b + 5;
        System.out.println(b);
        b += 5;
        System.out.println(b);
        // decrement
        int c = 8;
        c = c - 3;
        System.out.println(c);
        c -= 3;
        System.out.println(c);

        //Increment 2:

        int d = 6;
        d = d * 6;
        System.out.println(d);
        d *= 2;//boşluk olmayacak
        System.out.println(d);

        //Decrement 2:
        int e = 24;
        e = e / 2;
        System.out.println(e);
        e /= 2;
        System.out.println(e);
        // "1" ile increment
        int f = 12;
        f = f + 1;
        f += 1;
        f++;//"1" arttırmak

        //"1" le decrement
        int h = 10;
        h = h - 1;
        h -= 1;
        h--;//ideal yol
        // "post-increment" ve "pre-incremenr"
        int i = 10;
        int k = i++;
        System.out.println("i = " + i);
        System.out.println(k);

        int m=15;
        int n=++m;
        System.out.println(m);
        System.out.println(n);
        //ornek
        int p=17;
        int r=p--;
        System.out.println("p = " + p);
        System.out.println("r = " + r);

        int s=20;
        int t=--s;

        System.out.println("s= "+s);
        System.out.println("t = " + t);
        //increment arttırmak,decrement azaltmak demektir.
        //increment toplama ve carpma ile, decrementm çıkarma ve bölme ile yapılabilir
        /* ıncrement
            a)i=i+5;
            b)i+=5;
            c)Eger 1 ile artirma sozkonusu ise ozaman i++; tavsiye edilir

            Decrement
            a)i=i-5;
            b)i-=5;
            c)Eger 1 ile azaltma sozkonusu ise ozaman i--; tavsiye edilir

         */


    }
}
