package practice02;

import java.util.Arrays;

public class S07_Array_IsimSiralama {
    public static void main(String[] args) {
        /*
        Bir sınıfta bulunan öğrencilerin isimlerini içeren bir array verildiğinde,
        bu öğrencilerin isimlerini sıralayan bir program yazın.
        {"Ali", "Zeynep", "Mehmet", "Ayşe"}

    */
        String names[]=   {"Ali", "Zeynep", "Mehmet", "Ayşe"};

        Arrays.sort(names);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

    }
}
