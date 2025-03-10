package Java.Day10;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate diwali = LocalDate.of(2025, 10, 20);
        System.out.println(diwali);

        Period tillDiwali = today.until(diwali);
        // System.out.println(tillDiwali);
        System.out.println("Time left for Diwali: " + tillDiwali.getMonths() + " months " + tillDiwali.getDays() + " days");

        LocalTime now = LocalTime.now();
        System.out.println(now);

        long timeToDiwali = today.until(diwali, ChronoUnit.DAYS);
        System.out.println("Time left for Diwali: " + timeToDiwali + " days");

    //     Stream<LocalDate> allyear = LocalDate.of(0, 0, 0).datesUntil(LocalDate.of(0, 0, 0));
        
    //     List<LocalDate> blackfridays = allyear.filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13)
    //         .collect(Collectors.toList());

    //     System.out.println(blackfridays);

    // }
}
}