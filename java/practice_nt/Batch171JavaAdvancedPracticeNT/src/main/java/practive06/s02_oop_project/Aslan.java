package practive06.s02_oop_project;

public class Aslan extends Hayvan{
    @Override
    public void yemekYer() {

    }

    @Override
    public void sesCikarir() {

    }

    public Aslan(String ad, int yas, String tur) {
        super(ad, yas, tur);
        System.out.println("Bir adet aslan objesi oluşturuldu.");
    }
}
