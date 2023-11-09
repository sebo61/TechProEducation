package Arrays;

import java.util.ArrayList;

public class ArrayListKitap151 {
    public static void main(String[] args) {
        ArrayList<String> Ad=new ArrayList<>();
        Ad.add("ahmet");
        Ad.add("Ali");
        Ad.add("Bade");
        Ad.add("Ceyda");
        Ad.add(1,"Vedat");
        System.out.println("dizinin yeni boyutu"+ Ad.size());
        for (int i=0;i< Ad.size();i++)
            System.out.println("İndis No "+i+ ": "+Ad.get(i));

        Ad.remove(Ad.indexOf("Ali"));
        Ad.remove(0);
        System.out.println("dizinin yeni eleman sayısı"+ Ad.size());
        for (int j=0;j<Ad.size();j++)
            System.out.println("İndir No"+j+":"+Ad.get(j));






    }
}
