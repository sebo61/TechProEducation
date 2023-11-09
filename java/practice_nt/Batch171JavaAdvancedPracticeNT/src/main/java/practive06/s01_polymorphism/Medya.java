package practive06.s01_polymorphism;

import javax.xml.transform.sax.SAXTransformerFactory;

public class Medya {
    private String dosyaAdi;

    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public String getDosyaAdi() {
        return dosyaAdi;
    }

   public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public void oynat(){
        System.out.println("dosya oynatılıyor");

    }
    public void durdur(){
        System.out.println("dosya durduruluyor");
    }

    @Override
    public String toString() {
        return "Dosya Adi = " + dosyaAdi ;
    }
}
