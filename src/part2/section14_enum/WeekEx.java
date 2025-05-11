package part2.section14_enum;

import java.util.Calendar;

/*
    노션: https://hyuniverse-space.notion.site/Enum-396e5dc07cc642cb806d6093fd3c8a8e?pvs=4
    열거 타입을 사용하여 요일 분기하기
        - Week 타입 사용
        - Calendar 객체 사용
 */
public class WeekEx {

    public static void main(String[] args) {
        // Week 타입 변수 선언
        Week today = null;

        // Calendar 객체 얻기
        Calendar cal = Calendar.getInstance();

        // cal 인스턴스로 오늘의 요일 정보 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("week = " + week);

        // cal 인스턴스가 반환한 숫자를 변환하기
        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> throw new IllegalArgumentException("해당되는 요일이 없습니다.");
        };

        // 열거 타입 변수를 사용하여 출력하기
        if (today == Week.SATURDAY) {
            System.out.println("오늘은 토요일 입니다.");
        } else {
            System.out.println("오늘은 토요일이 아닙니다.");
        }
    }
}
