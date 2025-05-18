package part2.section20_java_base_module.chapter2_string;

import java.util.StringTokenizer;

/*
    String 클래스
        - StringBuilder
        - StringTokenizer -> split() 메소드 사용
 */
public class StringEx {
    public static void main(String[] args) {
        // StringBuilder
        //  문자열을 이어붙이거나, 삭제하거나, 자르거나 등의 작업을 수행할 때 사용한다.
        //  append(), insert(), delete(), replace() 등이 대표적이다.
        String message = "ABC";
        message += "DEF";
        System.out.println("message = " + message);

        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();

        System.out.println(data);

        // StringTokenizer 클래스와 split() 메소드
        //  - 문자열이 구분자로 연결되어 있는 경우 해당 구분자를 기준으로 데이터를 분리할 때 사용한다.
        String data2 = "홍길동,이수홍,박연수,김자바-박자바-이자바";
        String[] names = data2.split(",|-"); // 주어진 구분자를 기준으로 데이터를 분리해서 배열로 반환한다.
                                                   // split() 메소드는 '정규표현식'을 기반으로 검사(분리)한다.
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-------------");
        String data3 = "홍길동/이수홍/박연수/김자바";
        StringTokenizer names2 = new StringTokenizer(data3, "/");
        while (names2.hasMoreTokens()) {
            String token = names2.nextToken();
            System.out.println(token);
        }
    }
}
