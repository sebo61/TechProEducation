package day31mapsexceptions;

import java.security.PublicKey;

public class E04 {
    public static void main(String[] args) {
        String arr[] ={"J","A","V","A"};
        getElementArray(arr,1);
    getElementArray(arr,5);

    }
//arraylerde olamayan index kullanıldığında Java ArrayIndexOutOfBoundsException atar.
    public static void getElementArray(String []s,int idx){

        try {
            String el= s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause()); //null
        }

    }


}
