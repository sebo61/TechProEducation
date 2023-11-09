import java.sql.SQLOutput;
import java.util.Scanner;

/*Proje:Student Management System
        -1-Herhangi bir eğitim kurumu için öğrenci yönetim uygulaması geliştiriniz.
        -2-Kullanıcı
        -C:create:öğrenci kayıt
        -R:read:öğrenci veya öğrencileri görüntüleme
        -U:update: id ile öğrenci güncelleme
        -D:delete: id ile öğrenci silme
        -R: ad-soyad ile öğrenci filtreleme
        işlemlerini yapabilmeli.
        -3-öğrenci:id,name,lastname,city,age özelliklerine sahiptir.
*/
public class Runner {
    public static void main(String[] args) {

        // 1-uygulama işlemleri için menü
        // 2- student class ini olustur.

        start();
    }

    private static void start() {
       Scanner inp = new Scanner(System.in);


        StudentService service=new StudentService();
        service.createTable();
       // int id;
        int select;

        do {
            System.out.println("==========================================");
            System.out.println("Öğrenci Yönetim Paneli");
            System.out.println("1- Öğrenci Kayıt");
            System.out.println("2- Öğrencileri Listele");
            System.out.println("3- Öğrenci Güncelle");
            System.out.println("4- Öğrenci Sil");
            System.out.println("5- Öğrenci Bul");
            System.out.println("6- Ad veya Soyad ile Öğrenci Listeler");
            System.out.println("0- Çıkış");
            System.out.println("İşlem seçiniz");
            select = inp.nextInt();
           int id;

            switch (select) {

                case 1:
                    //save
                    service.saveSatudent();

                    break;
                case 2:
                    //listeler
                    service.getAllStudent();

                    break;
                case 3:

                    //güncelle
                    id=getId(inp);
                    service.updatedStudent(id);
                    break;
                case 4:
                    //sil
                    id=getId(inp);
                    service.deleteStudent(id);
                    break;
                case 5:
                    // öğrenci Bul
                    id=getId(inp);
                    Student student=service.getStudentById(id);
                    if(student==null){
                        System.out.println("öğrenci bulunamadı");
                    }else {
                        System.out.println(student);
                    }


                    break;
                case 6:
                    //ad veya soyad ile çürenci listele
                    service.listStudentsByNameorLastname();
                    break;
                case 0:
                    System.out.println("iyi günler......");
                    break;
                default:
                    System.out.println("Hatalı giriş!!");
            }


        } while (select != 0);


    }

    private static int getId(Scanner inp){
        System.out.println("Öğrenci id:");
        int id= inp.nextInt();
      //  inp.nextLine();
        return id;

    }


}

