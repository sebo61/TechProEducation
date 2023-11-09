package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGenericType {
    public static void main(String[] args) {
        // generics ile hangi data tipini kullanacağımıza sonradan karar verebiliyoruz.
        // Java 7 den sonra sağ tarafta data tipini belirlemeye gerek kalmadı.

        GenericClass<String> obj1=new GenericClass<>();
        obj1.setField("generics type");

        String str= obj1.getField(); // CTE vermedi.CAST probleminden kurtulduk.
                                    // ClassCastException 'dan kurtulduk.

        //--------------------------------------------------

        GenericClass<String> obj2=new GenericClass<>();
       // obj2.setField(123); //generics tür-güvenliğini sağlar.

        GenericClass<Integer> obj3= new GenericClass<>();
        obj3.setField(123);
        Integer integer=obj3.getField();


        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        //list.add(123);

        String s=list.get(0);

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Generics",54);

        //map.put(23,"generics");

        //========================ÇOK PARAMETRELİ CLASSLAR======================

        GenericClassTwoParam<String,Double> mymap=new GenericClassTwoParam<>("generic",12.3);
        GenericClassTwoParam<Integer,Integer> mymap2=new GenericClassTwoParam<>(12,34);





    }
}
