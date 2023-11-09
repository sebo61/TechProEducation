package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitiv: char,boolean,byte,short,int,long,float,double
        //Wrapper Class: Character, Boolean, Byte, Short, Integer, Long, Float, Double
        // n yazıp nokta koyarsanız hiç method göremezsiniz çünkü primitivler method içermez.
        //Wrapper Classlar non-primitive dir. o yüzden de memory de çok yer kaplarlar.
        //dolayısıyla şart değilse Wrapper Class kullanmayı tercih etmeyiz.


        int n = 13;
//m yazıp nokta koyarsanız birçok method görebilirsiniz.
        //Wrapper Classlar method içerir.
        Integer m = 13;

        byte no = 34;

        Byte s = 34;
        //örnek: short data type'ın minimum ve maximum değerleri kod yazarak bulunuz.

        short maxShort=Short.MAX_VALUE;
        short minShort=Short.MIN_VALUE;

        System.out.println("maxShort = " + maxShort);
        System.out.println("minShort = " + minShort);
        //int data type ının tüm min, byte tipinin max değeri

        int min=Integer.MIN_VALUE;
        int max=Byte.MAX_VALUE;
        System.out.println(min+max);
        //ornek 3: primitive int i Wrapper Integera ceviriniz.Autoboxing

        int num=12;
        Integer wrapperNum=num;

        //örnek 4: Warpper byte ı primitive byte a ceviriniz. (unboxing)
        Byte k=12;
        byte primitiveK=k;
        //primitive char ı Wrapper Character e ceviriniz.
        char a='a';
        Character b=a;
        //Wrapper boolean ı primitive boolean a ceviriniz:

        Boolean x=true;
        boolean y=x;
        System.out.println(y);












        

    }
}
