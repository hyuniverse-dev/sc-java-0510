package part2.section19_exception;

/*
    예외 떠넘기기
        - 기본은 메소드 내부에서 발생하는 예외를 try-catch 문으로 처리하는 것이 기본이다.
        - 하지만 모든 메소드 내부에서 처리하게 되면 예외처리가 "떡칠"되는 현상이 발생된다.
        - 따라서 호출한 쪽에서 처리하도록 예외를 떠넘긴다.
        - 이때 사용하는 키워드는 throws 이다.

    다중 예외 떠넘기기
        - 예외 객체를 ,(콤마)로 구분하여 이어서 기술한다.
 */

public class ExceptionHandlingEx3 {
    public static void findClass() throws ClassNotFoundException {
        // 기본 예외처리 방법
//        try {
//            Class.forName("java.lang.String");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 예외 떠넘기기 적용
        Class.forName("java.lang.String2");
    }

    public static void someMethod() throws ClassNotFoundException {
        findClass();
    }

    public static void main(String[] args) {
        try {
//            findClass();
            someMethod();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
