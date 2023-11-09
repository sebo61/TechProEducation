package Day15Loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        /*
        başlangic değeri
        while(){
        çalışacak kodlar
        arttirma/azaltama
        }

         */
        /*
        //do while
        //başlangıç değeri
        do {
          çalışacak kodlar
          arttirma/azaltma
        }while(çalışma kuralı)
        */
        //ornek 1: 5 dahil den 3 (dahil tamsayıları konsola yazdırınız)

        int a = 5;
        do {
            System.out.println(a);
            a--;
        } while (a > 2);
        // 1 while-loop
        int i = 1;
        while (a < 1) {
            System.out.println("sen bir while loopsun");
            i++;
        }
        //2 do while
        int k = 1;
        do {
            System.out.println("sen bir do while loopsun");

            k++;
        } while (k < 1);

    }
}
