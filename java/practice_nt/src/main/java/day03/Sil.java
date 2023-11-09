package day03;

public class Sil {
    public static void main(String[] args) {
        String cinsiyet = "Kadin";
        int yas = 13;
        if (cinsiyet.equals("Erkek")) {
            if (yas < 18) {
                System.out.println("elma");
            } else {
                System.out.println("armut");
            }


        } else if (cinsiyet.equals("Kadin")) {
            if (yas < 18) {
                System.out.println("portakal");
            } else {
                System.out.println("erik");
            }

        } else {
            System.out.println("domates");
        }
    }
}
