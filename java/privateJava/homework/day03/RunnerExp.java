package homework.day03;

public class RunnerExp {
    public static void main(String[] args) {
        //homework: içinde isim ve yaş olan (en az) ile teach methodu da olan bir teacher objesi oluşturun ve obje üzerinde bu özellikleri kullanın

        HomeworkTeacher teacher=new HomeworkTeacher();
        System.out.println("teacher.age = " + teacher.age);
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.isRegular = " + teacher.isRegular);
        teacher.teach();
        teacher.hardWorking();
    }
}
