package suleymanHoca.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime02 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy - hh:mm a");
        String formattedLldt= dtf1.format(ldt);
        System.out.println(formattedLldt);


    }
}
