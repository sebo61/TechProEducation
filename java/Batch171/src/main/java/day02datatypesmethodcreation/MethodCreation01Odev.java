package day02datatypesmethodcreation;

public class MethodCreation01Odev {

    public static void main(String[] args) {
    int result=areaRectangle(3,5);
        System.out.println(result);

        System.out.println(perimeterRectangle(3,5));

    }
    public static int areaRectangle(int x,int y){
        return x*y;

    }
    private  static long perimeterRectangle(int a,int b)
    {
        return 2*(a+b);
    }


}
