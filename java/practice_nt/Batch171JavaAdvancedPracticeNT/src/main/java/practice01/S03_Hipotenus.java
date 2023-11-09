package practice01;

import com.sun.tools.javac.Main;

public class S03_Hipotenus {
    public static void main(String[] args) {
            /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
        double a=3;
        double b=4;

        double hipotenus= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println (hipotenus);


        }
    }

