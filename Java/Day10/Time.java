package Java.Day10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

    LocalTime noon = LocalTime.of(12, 0);

    long timetonoon = time.until(noon, ChronoUnit.MINUTES);
        System.out.println("Time to noon: " + timetonoon + " minutes");

    Duration interval = Duration.between(time, noon);
        System.out.println("Time to noon: " + interval.toMinutes() + " minutes");

    LocalTime now = LocalTime.now();
    LocalDateTime dt = now.atDate(LocalDate.of(2025, 3, 11));
    System.out.println("dt: " + dt);
    }
}