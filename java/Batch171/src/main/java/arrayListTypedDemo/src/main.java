import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Trabzon");
        sehirler.add("İzmir");
        sehirler.add("İstanbul");
        sehirler.add("Aydın");

      // sehirler.remove("İstanbul");
        Collections.sort(sehirler);
        for(String sehir:sehirler){

            System.out.println(sehir);

        }


    }
}
