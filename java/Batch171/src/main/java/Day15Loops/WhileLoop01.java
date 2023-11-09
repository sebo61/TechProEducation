package Day15Loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Kalıbını oluşturalım.
        /*
        while loop kalibi
        baslangic gegeri
        while(loop calisma kuralı){
        çalışacak kodlar
        arttirma/azaltama
        }
         */
        // örnek 1: 3 den 6 ya kadar tamsayıları yazdirin

        // 1. yol for-loop

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. yol while-loop

        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // örnek 2: 23 den 12 ye kadar çift tam sayoları konsola yazdırınız.
        int k=23;

        while (k>11){
            if(k%2==0){
                System.out.print(k+" ");
            }


            k--;
        }
        System.out.println();
        // örnek 3: 6 dan 19 'a kadar tek tamsayıları

        int j=6;

        while (j<20){

            if(j%2 !=0){
                System.out.print(j+" ");
            }

            j++;
        }

        // örnek 4:
    }
}
