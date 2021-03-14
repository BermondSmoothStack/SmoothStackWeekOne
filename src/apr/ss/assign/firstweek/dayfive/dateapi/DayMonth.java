package apr.ss.assign.firstweek.dayfive.dateapi;

import java.util.Objects;

public class DayMonth {
    private int days;
    private String month;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public DayMonth(String month, int days) {
        this.days = days;
        this.month = month;
    }

    @Override
    public String toString(){
        return month + ":" + days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayMonth dayMonth = (DayMonth) o;
        return days == dayMonth.days && month.equals(dayMonth.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, month);
    }
}
