package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name="Tom Hanks";
        System.out.println(addTitle("Dr.", name));

        System.out.println(name);



    }
    public static String addTitle(String title,String name){
        name=title+ " "+name;
        return name;

    }

}
