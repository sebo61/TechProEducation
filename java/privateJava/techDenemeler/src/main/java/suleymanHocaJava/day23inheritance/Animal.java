package suleymanHoca.day23inheritance;

public class Animal {
    /*
    1) eat() metodu gibi bir çok classin kullanması gereken methodları her class a ayrı ayrı yazarsak;
        i) tekrar yapmış oluruz, tekrar ideal kodda olmamalıdır.
        ii) aynı metodu tekrar tekrar yazmak zaman kaybıdır.
        iii) tekrar tekrar yazılam metodun tamiri çok zaman alır.
        iv) geliştirilmesi çok zaman alır.
        v) metodu tekrar tekrar yazmak atomic yapıya terstir.
    2) private class memberlar child class'lar tarafından kullanılamaz.
        public class memberlar child class lar tarafından kkullanılabilir.
        default class memberlar aynı package da child classlar tarafından kullaılabilir.
         protected class memberlar farklı package da da olsalar child classlar tarafından kullanılabilir.
    3) Javada bir childın bir parent ı olabilir.
        Çoklu parent multiple inheritance, tekli parent single inheritance dır. Java single inheritance ı destekler.
    4) apartan şeklindeki inheritance yapısına multilevel inheritance denir. Java multilevel inheritance ı destekler.

     */
  protected void eat()
  {
      System.out.println("animals eats...");
  }
  public void drink(){
      System.out.println("animals drinks...");
  }
}
