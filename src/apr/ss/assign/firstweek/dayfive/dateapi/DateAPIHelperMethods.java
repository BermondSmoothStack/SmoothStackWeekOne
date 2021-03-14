package apr.ss.assign.firstweek.dayfive.dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class DateAPIHelperMethods {

    public static boolean isFriday13(LocalDate date){
        return (null != date && date.getDayOfWeek() == DayOfWeek.FRIDAY) && date.getDayOfMonth() == 13;
    }

    public static List<LocalDate> getMondaysOfMonth(LocalDate date){
        LocalDate delta = date.withDayOfMonth(1);
        Integer monthInt = delta.getMonthValue();
        List<LocalDate> mondayList = new ArrayList<>();

        while(delta.getMonth().getValue() <= monthInt){
            if (delta.getDayOfWeek().getValue() == DayOfWeek.MONDAY.getValue()){
                mondayList.add(delta);
            }
            delta = LocalDate.from(delta.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        }

        return mondayList;
    }

    public static List<DayMonth> yearMonthCheck(Integer year){
        List<DayMonth> monthDays = new ArrayList<>();
        LocalDate yearDate = LocalDate.ofYearDay(year,1);

        for(int i = 1; i <= 12; i++){
            LocalDate month = yearDate.withMonth(i);
            Integer days = month.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
            monthDays.add(new DayMonth(month.getMonth().name(), days));
        }

        return monthDays;
    }
}
