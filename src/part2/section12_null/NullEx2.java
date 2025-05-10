package part2.section12_null;

/*
    2. 문자열 데이터 비교 방법 - equals()
        - 문자열 데이터를 패턴 기준으로 비교할 땐 equals() 메소드를 사용해야 한다.
        - 스택 메모리에 저장된 참조주소가 달라도 패턴 기반으로 비교한다.
 */
public class NullEx2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // 문자열 데이터를 비교하는 방법 - .equals()
        boolean isSame = str1.equals(str2);
        System.out.println("isSame = " + isSame);

        isSame = str1.equals(str3);
        System.out.println("isSame = " + isSame);
    }
}
