package suleymanHocaJava.day16;

import java.util.Scanner;

public class Arrays02 {
        // kullanıcı +,-,/,* işlemleri için hesap makinası yapınız.
    // kullanıcı 'q basıp çıkmadığı sürece devam etsin.'
        public static void main(String[] args) {
            /*
            1) sayı için scanner işlemi olmalı
            2)işlemi almalıyız.
            3)2 sayı almalıyız.
            4)loop olmalı
             */
            Scanner input = new Scanner(System.in);

                char opr=' ';
           do {

               System.out.println("Please enter the operation you want to do (+,-,*,/,% )");
               opr = input.next().toLowerCase().charAt(0);
               if(opr=='q') {
                   System.out.println("see you again");
                   break;
               }
               boolean r=opr=='+' || opr=='-'|| opr=='*'|| opr=='/' || opr=='%';
               if(!r){
                   System.out.println("undefined operation");
                   break;
               }
               System.out.println("First number:");
               int n1=input.nextInt();
               System.out.println("Second number:");
               int n2=input.nextInt();

                   switch (opr){
                       case'+':
                           System.out.println(n1+"+"+n2+"="+(n1+n2));
                           break;
                       case'-':
                           System.out.println(n1+"-"+n2+"="+(n1-n2));
                           break;
                       case'*':
                           System.out.println(n1+"*"+n2+"="+(n1*n2));
                           break;
                       case'/':
                           System.out.println(n1+"/"+n2+"="+(n1/n2));
                           break;
                       case'%':
                           System.out.println(n1+"%"+n2+"="+(n1*n2)/100);
                           break;


                   }
           }while(opr!='q');




        }

}
