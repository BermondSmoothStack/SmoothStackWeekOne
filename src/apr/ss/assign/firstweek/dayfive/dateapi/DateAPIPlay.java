package apr.ss.assign.firstweek.dayfive.dateapi;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class DateAPIPlay {

    public DateAPIPlay() {

        LocalDateTime birthday = LocalDateTime.of(1991, Month.JULY, 21, 0, 0, 0, 999);
        System.out.println(birthday.toString());

        LocalDate nextThursday = LocalDate.from(birthday.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(nextThursday.toString());

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds.toString());

        ZoneId zoneIdp8 = ZoneId.of("Asia/Shanghai");
        ZoneId zoneIdm8 = ZoneId.of("America/Los_Angeles");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(birthday, zoneIdp8);

        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant.toString());

        LocalDateTime fromInstant = LocalDateTime.ofInstant(instant, zoneIdm8);
        System.out.println(fromInstant.toString());

        System.out.println(DateAPIHelperMethods.yearMonthCheck(2020));
        System.out.println(DateAPIHelperMethods.getMondaysOfMonth(LocalDate.now()));

    }
}
