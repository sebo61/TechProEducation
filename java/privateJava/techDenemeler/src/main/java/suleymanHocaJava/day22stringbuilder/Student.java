package suleymanHoca.day22stringbuilder;

public class Student {
    // studentname public olduğu için diğer classlardan ulaşılabilir.
    //acces modifier ı default olan ile public olan class memberlar aynı package içinde kullanıldıklarında aynı özellikleri gösterirler.
    // fakat farklı package gectiğimöizde public olanlara ulaşılabilir fakat default olanlara ulaşılamaz.
    //acces modifier ı private olan class memberlar sadece oluşturuldukları class içinden görülebilirler.
    // oluşturuldukları class ın dışına çıktıklarında görünmez ulaşılmaz olurlar.

   public String stdName="Ali Can";
   int age=23;
   private String healthCondition="Cancer";
   // acces modifierı protected olan calass memberlar aynı package içinde iken public gibi davranırlar.
    //farklı package geçtiğinizde protected olanlar sadece child class lardan görülebilir.

    protected int slary=3000;
    // Class lar public ve default olabilir. private ve protected olamazlar.


}
