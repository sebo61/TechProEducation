package day36Lambda;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        // verilen txt içindeki kodu consola yazdıran kod

        Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).forEach(System.out::println);

        // txt i büyük harflerle
        Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).map(t -> t.toUpperCase()).forEach(System.out::println);

        // verilen txt de "?" kelimesinin olup olmadığını

        boolean result1 = Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).anyMatch(t -> t.contains("lambda01"));

        System.out.println(result1);

        // farklı kelimeleri liste return ediniz.
        List<String> word = Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).map(t -> t.replaceAll("\\p{Punct}", "").
                split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        System.out.println(word);

        // verilen txt içinde kaç harf var.

        Long numOfLetters = Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).map(t -> t.replaceAll("^a-zA-Z", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).count();
        System.out.println(numOfLetters);


        // txt içindeki tüm harfleri ters sırada list içinde
       List<String> letters= Files.lines(Paths.get("day36Lambda/LambdaTextFile.txt")).map(t -> t.replaceAll("^a-zA-Z", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);
    }

}
