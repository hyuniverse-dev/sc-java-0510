package part2.section12_null;
/*
    노션: https://hyuniverse-space.notion.site/null-NullPointerException-7b9432a93525481bb2da4c9cb4e390b8?pvs=4
    1. 문자열 데이터 비교 방법
        - == (동등연산자) 로 비교할 땐 참조 타입의 경우 해당 객체의 참조 주소를 기준으로 비교한다.
        - 문자열 데이터의 경우 메모리를 효율적으로 사용하기 위해 동일한 패턴은 공유한다.
        - 하지만 new String()으로 새로운 인스턴스를 생성하면 패턴은 동일해도 참조주소가 달라진다.
 */

public class NullEx {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1 == str2); // 단축어: sout

        int str1HashCode = System.identityHashCode(str1);
        int str2HashCode = System.identityHashCode(str2);

        System.out.println("str1HashCode = " + str1HashCode); // soutv 단축어 사용하면 변수명 + 값의 형식으로 출력문 생성
        System.out.println("str2HashCode = " + str2HashCode);

        String str3 = new String("hello");

        int str3HashCode = System.identityHashCode(str3);
        System.out.println("str3HashCode = " + str3HashCode);
        System.out.println(str1 == str3);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
