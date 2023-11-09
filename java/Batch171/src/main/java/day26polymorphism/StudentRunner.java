package day26polymorphism;



public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());

        System.out.println("===============================");
        s1.setStdId("MT4423234");
        s1.setNotOrt(56);
        s1.setSuccessful(true);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());
        System.out.println("===============================");
        s1.setStdId("LS4423234");
        s1.setNotOrt(36);
        s1.setSuccessful(false);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());

    }

}
