package part2.section20_java_base_module.chapter4_date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Date 클래스
        - 날짜를 표현하는 클래스이다. 객체 간에 날짜 정보를 주고 받을 때 사용된다.
        - 컴퓨터의 현재 날짜를 읽어서 Date 객체로 만듭니다.
 */
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();

        String strNow1 = now.toString();
        System.out.println("strNow1 = " + strNow1);

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // 사용할 날짜의 형식(패턴)을 지정
        String strNow2 = format.format(now);
        System.out.println("strNow2 = " + strNow2);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String strNow3 = format2.format(now);
        System.out.println("strNow3 = " + strNow3);


        // SimpleDateFormat 클래스의 형식 지정자
        /*
            y - 년 (연도를 4자리로 표현하려면 yyyy 형식으로 지정)
            M - 월
            d - 일
            D - 월 구분이 없는 일
            E - 요일
            a - 오전/오후
            
            H - 24시 기준의 시간
            h - 12시 기준의 시간
            m - 분
            s - 초
            S - 밀리세컨드
         */
    }
}
