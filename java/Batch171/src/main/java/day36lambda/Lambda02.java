package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        // example 1: verilen txt file içindeki text i consola yazdıran kodu yazınız.
        Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).forEach(System.out::println);

        // example 2: verilen text fil eiçinde ki text i büyük harflarle yazdırın.
        Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        // example 3: verilen text içindeki textlerde "get" kelimesinin olup olmadığını kontrol eden kodu yazınız.
        boolean result1= Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).anyMatch(t->t.contains("getx"));
        System.out.println(result1);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words= Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).map(t->t.replaceAll("\\p{Punct}}","").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        long words2= Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).map(t->t.replaceAll("[^a-zA-Z]","")).map(t->t.split("")).flatMap(Arrays::stream).count();

        System.out.println(words2);
        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.

       List<String> letters= Files.lines(Paths.get("C:\\Users\\sebo6\\Desktop\\TechProEducation\\java\\Batch171\\src\\main\\java\\day36lambda\\LambdaTextFile.txt")).map(t->t.replaceAll("[^a-zA-Z]","")).map(t->t.split("")).flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);


    }
}
