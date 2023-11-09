import java.util.List;
import java.util.Scanner;

// student ile ilgili metodlar için studentService metodu oluşturuldu
public class StudentService {

// reponun metodlarını kullanmak için obje oluştur.

    Scanner inp=new Scanner(System.in);

    StudentRepository repository=new StudentRepository();
    //10- tablo oluşturmak için metod

    public void createTable(){
        repository.createTable();
    }

    //11 - öğrenci kaydetme

    public void saveSatudent(){
        System.out.println("Ad: ");
        String name=inp.nextLine().trim();

        System.out.println("Soyad: ");
        String lastname=inp.nextLine().trim();

        System.out.println("Şehir: ");
        String city=inp.nextLine().trim();

        System.out.println("Yaş: " );
        int age=inp.nextInt();

        inp.nextLine();

        Student newStudent=new Student(name,lastname,city,age);
        repository.save(newStudent);

    }
    // 13- tüm öğrencileri listele
    public void getAllStudent(){
        repository.findAll();

    }
    // 15- öğrenciyi silme
    public void deleteStudent(int id){
        repository.delete(id);
    }
    // 17 - id ile öğrenci getirme
    public Student getStudentById(int id){
       Student student= repository.findStudentById(id);
       return student;

    }
    // 19- öğrenciyi güncelleme
    public void updatedStudent(int id) {

        Student student=getStudentById(id);
        if(student==null){
            System.out.println("öğrenci bulunamadı");
        }else {
            System.out.println("Ad: ");
            String name=inp.nextLine().trim();

            System.out.println("Soyad: ");
            String lastname=inp.nextLine().trim();

            System.out.println("Şehir: ");
            String city=inp.nextLine().trim();

            System.out.println("Yaş: " );
            int age=inp.nextInt();
            inp.nextLine();

            // yeni değerlerle fieldları güncelle

            student.setName(name);
            student.setLastname(lastname);
            student.setCity(city);
            student.setAge(age);
            repository.updateStudent(student);



        }

    }
    // 21- girilen kelime, ad veya soyad da olan studentleri listele
    // kelime ay --> olduğunda ad veya soyaddda -ay- .çerenler gelecek

    public void listStudentsByNameorLastname(){
        System.out.println("Ad veya soyad");
        String nameOrLastName= inp.nextLine();
        List<Student> studentList=repository.findStudentByNameOrLastName(nameOrLastName);
        //listedeki öğrencileri yazdıralım
        // list boş ise
        if(studentList.size()==0){
            System.out.println("öğrenci bulunamadı...");

        }else {
            studentList.forEach(System.out::println);
        }




    }



}
