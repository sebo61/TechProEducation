package practive06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya=new Medya("sesdosyasi.mp3");

        System.out.println(medya.toString());
        Medya medya1= new Medya("sesdosyasi2.mp3");
        System.out.println("medya 1"+medya1);

        medya.setDosyaAdi("sadece sitem.mp3");
        System.out.println("medya"+ medya);

        System.out.println(medya.getDosyaAdi());

        SesDosyasi sd=new SesDosyasi("yenidosya.mp3");
        sd.oynat();

    }

}
