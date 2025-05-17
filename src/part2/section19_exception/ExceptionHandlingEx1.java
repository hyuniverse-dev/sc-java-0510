package part2.section19_exception;

/*
    예외처리
        - 하드웨어 & 소프트웨어 에서 실행 오류가 발생하는 것을 "에러(Error)" 라고 표현한다.
        - 에러 중에서 개발자가 처리할 수 있는 종류를 "예외(Exception)" 라고 표현한다.
        - 예외란 잘못된 사용 또는 코딩 오류를 얘기한다.
        - 예외가 발생하면 프로그램은 곧바로 종료된다. 따라서 사전에 방어하는 방법이 필요하다.
        - 이것이 "예외처리" 라고 한다.

    예외의 종류
        - 일반 예외(Exception)
        - 실행 예외(Runtime Exception) *

    예외 처리 구문
        - try {
            예외 발생할 가능성이 있는 코드
          } catch (예외객체 e) {
            예외 발생시 처리할 코드
          } finally {
            예외가 발생을 하든 / 안하든 반드시 실행되는 코드
          }

 */
public class ExceptionHandlingEx1 {
    public static void printLength(String str) {
        try { // 2번
            int result = str.length();
            System.out.println("문자열의 수 = " + result);
        } catch (NullPointerException e) {
            System.out.println("str = " + str);

            // 예외 정보를 얻는 방법(1) -> 발생한 이유
//            System.out.println(e.getMessage());

            // 예외 정보를 얻는 방법(2) -> 예외 종류 + 발생한 이유
//            System.out.println(e.toString());

            // 예외 정보를 얻는 방법(3) -> 예외 발생 위치 + 종류 + 이유
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("Hello world!");
        printLength(null);


        System.out.println("프로그램 종료");
    }
}
