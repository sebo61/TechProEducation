package generics.classes;

public class RunnerNonGereric {
    public static void main(String[] args) {
        // 2 farklı object oluşturalım
        NonGenericType obj1 = new NonGenericType();
        NonGenericType obj2 = new NonGenericType();

        obj1.setField("advanced java"); // field değişkeni set ettik
        obj2.setField(12); // field ı integer ile set ettik
        String string = (String)obj1.getField(); // CTE --> CAST problemi
        System.out.println(string);

        String  str=( String) obj2.getField();
        System.out.println(str);


    }


}
