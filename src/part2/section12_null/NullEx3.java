package part2.section12_null;

/*
    3. null 과 NullPointerException
        - null 은 해당 변수가 참조하고 있는 객체가 없는 상태를 의미한다.
        - NullPointerException 은 참조하고 있는 객체 없는 상태(null)에서 특정 연산을 수행할 때 발생한다.
        - null 은 필요없는 참조타입 객체를 GC에 의해서 제거를 수행할 때 의도적으로 사용할 수도 있다.
        - 하지만 대부분의 경우는 일부로 null 로 참조를 끊는 경우는 많지 않기 때문에 GC 의 원리를 이해하는 것으로 정리한다.
 */
public class NullEx3 {
    public static void main(String[] args) {
        String str1 = null;

        // NullPointerException - 테스트할 땐 주석 해제하고 해보세요! (예외 발생)
//        boolean isSame = str1.equals("hello");
//        System.out.println("isSame = " + isSame);

    }
}
