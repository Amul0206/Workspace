package Java.Day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParse {
    public static void main(String[] args) {

        //Format 

        System.out.println();

        LocalDateTime dtnow = LocalDateTime.now();
        System.out.println(dtnow);

        System.out.println();

        String mydate = dtnow.format(DateTimeFormatter.ofPattern("YYYY/MM/DD hh:mm:ss"));
        System.out.println(mydate);

        System.out.println();

        String date = "25/03/10 10:40:28";
        LocalDateTime dt = LocalDateTime.parse(date, DateTimeFormatter
                        .ofPattern("yy/MM/dd HH:mm:ss"));
                    
        System.out.println(dt);

        System.out.println();
        
    }
}