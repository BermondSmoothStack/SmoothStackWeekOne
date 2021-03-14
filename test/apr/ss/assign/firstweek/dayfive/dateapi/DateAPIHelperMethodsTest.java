package apr.ss.assign.firstweek.dayfive.dateapi;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DateAPIHelperMethodsTest {

    @Test
    public void isFriday13() {
        LocalDate friday13 = LocalDate.of(2020, 3, 13);
        LocalDate notFriday13A = LocalDate.of(2020, 4, 13);
        LocalDate notFriday13B = LocalDate.of(2020, 3, 14);

        assertTrue(DateAPIHelperMethods.isFriday13(friday13));
        assertFalse(DateAPIHelperMethods.isFriday13(notFriday13A));
        assertFalse(DateAPIHelperMethods.isFriday13(notFriday13B));
        assertFalse(DateAPIHelperMethods.isFriday13(null));

    }

    @Test
    public void getMondaysOfMonth() {
        LocalDate date = LocalDate.of(2021, 3, 13);
        List<LocalDate> expected = Arrays.asList(
                LocalDate.of(2021, 3, 1),
                LocalDate.of(2021, 3, 8),
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2021, 3, 22),
                LocalDate.of(2021, 3, 29)
        );

        assertArrayEquals(expected.toArray(), DateAPIHelperMethods.getMondaysOfMonth(date).toArray());
    }

    @Test
    public void yearMonthCheckNotLeap() {
        List<DayMonth> expected = Arrays.asList(
                new DayMonth("JANUARY", 31),
                new DayMonth("FEBRUARY", 28),
                new DayMonth("MARCH", 31),
                new DayMonth("APRIL", 30),
                new DayMonth("MAY", 31),
                new DayMonth("JUNE", 30),
                new DayMonth("JULY", 31),
                new DayMonth("AUGUST", 31),
                new DayMonth("SEPTEMBER", 30),
                new DayMonth("OCTOBER", 31),
                new DayMonth("NOVEMBER", 30),
                new DayMonth("DECEMBER", 31)
        );

        assertArrayEquals(expected.toArray(), DateAPIHelperMethods.yearMonthCheck(2021).toArray());
    }

    @Test
    public void yearMonthCheckLeap() {
        DayMonth[] expected = {
                new DayMonth("JANUARY", 31),
                new DayMonth("FEBRUARY", 29),
                new DayMonth("MARCH", 31),
                new DayMonth("APRIL", 30),
                new DayMonth("MAY", 31),
                new DayMonth("JUNE", 30),
                new DayMonth("JULY", 31),
                new DayMonth("AUGUST", 31),
                new DayMonth("SEPTEMBER", 30),
                new DayMonth("OCTOBER", 31),
                new DayMonth("NOVEMBER", 30),
                new DayMonth("DECEMBER", 31)
        };

        assertArrayEquals(expected, DateAPIHelperMethods.yearMonthCheck(2020).toArray());
    }
}