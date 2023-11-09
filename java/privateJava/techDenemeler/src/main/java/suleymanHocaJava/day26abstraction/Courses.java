package suleymanHocaJava.day26abstraction;
/*
1) Bazen Parent Classtaki metodun bodysi hiç bir child class trafından kullanılmaz. bu durumda parent classdaki metoda
yazmak hiç kullanılmadığı için mantıklı değildir. Bizde o metod body yazmayız.
2) body si hiç yazılmayan method'a "abstract metod" derler. Abstract ingilizcede "vücutsuz" veya "soyut" anlamındadır.
3) metodun bodysini yazmayonca Java hata verir. bizde absrtract keywordunu kullanarak bu metodun bodysi olmayacak deriz.
4) abstract keywordunu kullaninca elde ettiğimiz abstract metod normal classlara konulamaz. o yüzden classıda abstract yaparız.
5)Parenttaki metod abstract ise bütün child classlar o metodu override etmek zorundadır. Bu yüzden tim child classlar için mecburi olmasını istediğimiz
    fonksiyonları abstract etmek mantıklıdır.
6) bodysi olam metodlar (concrete method) abstract classların içine yazılabilir. bastract metodlar concrete classların içine yazılamazlar.
7) absract metod ile metod body bir arada olmaz.
8) abstract clasların içinde absr-tract metodlar olur. abstract metodlar body si olmadığı için eksik metodlar olarak düşünülebilir.
    yani abstrct class içinde eksik bir yapı barındırır. siz abstract classdan obje üretirseniz abstract class içindeki eksiklik objeye yansır ve obje eksiği
    olan bir object olur. java bunu istemez. eksik object eksik iş yapar. buda applicationın yanlış çalışmasına sebep olur. bu sebeple java abstract classdan object
    oluşturulmasını engellemiştir.

9) abstract classların constructorı var ama object oluşturamazlar.
10) final metodlar abstract olamazlar.
11)private metodlar abstract olamzlar.
12)abstract classın abstract childı olabilir.



 */
/*
Final keywordu açıklar mısınız.
i) finall keyword variablelarda, metodlarda, classalarda kullanılır.
variablarda kullanıldığında a) o variablea kesinlikle değer ataması yapılmalıdır.
    b) ilk atanan değer değiştirilemez.

 ii) metodlarda kullanıldığında bodysi değiştirilemez. metod override edilemez.
 iii) classlarda kullanıldığında o classin child classı olamaz. final clasın kendisi child olabilir.

 */

public abstract class  Courses {
    public abstract void math();
    public void art(){
        System.out.println("Learn art");
    }


}


