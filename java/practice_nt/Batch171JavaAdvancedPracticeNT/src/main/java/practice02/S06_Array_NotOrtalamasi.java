package practice02;

public class S06_Array_NotOrtalamasi {
    public static void main(String[] args) {
        /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
        */
        int notlar[]={84, 91, 76, 85, 98};
        int toplam=0;
        for (int w:notlar){

            toplam+=w;

        }
       double ortalama= (double)toplam/notlar.length;

        System.out.println("ortalama="+ortalama);
    }
}
