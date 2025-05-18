package part2.section20_java_base_module.chapter3_wrapper_class;

/*
    포장 클래스(Wrapper Class)
        - 기본 타입(byte, char, short, int, long, float, double, boolean)을
          값는 갖는 객체로 생성해주는 클래스.
        - char 와 int 를 제외하고는 나머지는 첫 글자만 대문자로 사용하면 된다.
 */
public class WrapperClassEx {
    public static void main(String[] args) {
        // 기본형과 래퍼 클래스의 차이 (null 사용 가능 유무)
        int num = 1;
        Integer num2 = 1;
        num2 = null;

        // 각 기본 타입의 래퍼 클래스
        Byte bValue = null;
        Character cValue = null;
        //..
        Boolean boolValue = null;

        // boxing 과 unboxing
        // boxing 은 기본 타입의 값을 래퍼 클래스로 만드는 과정
        // unboxing 은 래퍼 클래스에서 기본 타입의 값을 얻는 과정
        Integer obj = 100; // 박싱
        int value = obj; // 언박싱

        // 포장 클래스 사용시 클래스에 정의된 기능을 사용할 수 있다.
        String numStr = "100";
        int value2 = Integer.parseInt(numStr);

        // 포장 클래스 타입의 변수끼리 값 비교하기
        Integer obj2 = 500;
        Integer obj3 = 500;
        System.out.println(obj2 == obj3);
        System.out.println(obj2.equals(obj3));

    }
}
