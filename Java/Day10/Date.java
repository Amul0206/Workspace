package Java.Day10;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// @SuppressWarnings("unused")
public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println();

        LocalDate diwali = LocalDate.of(2025, 10, 20);
        System.out.println(diwali);

        System.out.println(

        );
        Period tillDiwali = today.until(diwali);
        // System.out.println(tillDiwali);
        System.out.println("Time left for Diwali: " + tillDiwali.getMonths() + " months " + tillDiwali.getDays() + " days");

        System.out.println(); 

        LocalTime now = LocalTime.now();
        System.out.println(now);

        long timeToDiwali = today.until(diwali, ChronoUnit.DAYS);
        System.out.println("Time left for Diwali: " + timeToDiwali + " days");

        System.out.println();

        Stream<LocalDate> allyear = LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
        
        List<LocalDate> blackfridays = allyear.filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13)
            .collect(Collectors.toList());

        System.out.println(blackfridays);

        System.out.println("___________________");
        System.out.println();
        System.out.println(diwali.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(diwali.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY)));
        System.out.println(diwali.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
        System.out.println(diwali.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(diwali.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
    }
}