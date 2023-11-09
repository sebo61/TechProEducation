package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static olduğundan ona ulaşmak için
        // sadece class ismini kullamak yeterlidir.
        System.out.println(Student.stdName);
        // age non-static olduğundan ona ulaşmak için obje oluşturmak zorundayız.
        Student std1 = new Student();
        System.out.println(std1.age);//13
        Student.staticMethod();

        std1.nonStaticMetod();


    }
}
