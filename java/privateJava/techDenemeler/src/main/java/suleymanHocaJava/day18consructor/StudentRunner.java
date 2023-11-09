package suleymanHocaJava.day18consructor;

public class StudentRunner {
    public static void main(String[] args) {
        //static olan "numOffRegisteredStd" variablenı çağırmak için class ismini kullantık, oıbject oluşturmatık.

        System.out.println(Student.numOfRegisteredStd);
        Student s1=new Student();
        //static olmayan "num" variable ını çağırmak için object oluşturduk.
        System.out.println(s1.num);




    }
}
