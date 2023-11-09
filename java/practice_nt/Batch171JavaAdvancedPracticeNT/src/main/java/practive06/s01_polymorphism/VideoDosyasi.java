package practive06.s01_polymorphism;

public class VideoDosyasi  extends Medya{
    public VideoDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("video dosyası oynatılıyor.");
    }

    @Override
    public void durdur() {
        System.out.println("videos dosyası durduruluyor.");
    }
}
