package part2.section20_java_base_module.chapter4_date;

import java.util.Calendar;

/*
    Calendar 클래스
        - 달력을 표현하는 클래스이다.
 */
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.toString());

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);


        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);
    }
}
