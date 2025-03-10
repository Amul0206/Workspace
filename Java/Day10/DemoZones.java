package Java.Day10;

import java.time.*;
import java.util.Set;
public class DemoZones {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Set<String> zones = ZoneId.getAvailableZoneIds();
        // System.out.println(zones); 

        LocalDateTime dt = LocalDateTime.of(2025, 3, 10, 6, 25, 55);
        LocalDateTime dtnow = LocalDateTime.now();

        // ZonedDateTime perth = dtnow.atZone(ZoneId.of("Australia/Perth"));
        // System.out.println(perth);

        ZonedDateTime ist = dtnow.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(ist);
        Instant india = ist.toInstant();
        System.out.println(india);

        System.out.println();

        ZonedDateTime perth = india.atZone(ZoneId.of("Australia/Perth"));
        System.out.println(perth);
    }
}

