package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {
        //hashMap arkasında çalışan mekanizma nasıl?
        HashMap<String,String> capitals=new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Türkiye","Ankara");
        capitals.get("Türkiye");

        capitals.put("Italy","Florensa");

        System.out.println(capitals.hashCode());


    }
}
