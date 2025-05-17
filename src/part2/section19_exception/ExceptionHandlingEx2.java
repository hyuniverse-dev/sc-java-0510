package part2.section19_exception;

/*
    다중 예외 처리
        - try 블록 안에서는 다양한 종류가 발생할 수 있다. 이 경우 다중 catch문을 사용해야 한다.
        - 발생할 수 있는 예외 종류를 모두 기술하고 처리한다.
        - 해당 타입의 예외가 발생하면 해당 catch 블록만 실행된다.

    Exception 클래스
        - Exception 클래스는 최상위 클래스이기 때문에 하나로 작성하면 모든 예외를 catch 할 수 있다.
        - 하지만 현업에서는 이런식으로 사용하진 않는다. (예외 종류에 따른 분기 불가 / 보안 및 감리 통과가 어렵다)
        - Exception 클래스 사용 시에는 반드시 맨 마지막에 기술해야 한다.

    예외처리 주의할 점
        - 불안한 코드에 대해서 예외처리를 하는건 나쁜 것은 아니지만 무분별하게 남용하는 것은 코드 퀄리티를 떨어트린다.
        - 따라서 적절한 코드에 대해서만 예외처리를 사용하는 것을 권장한다.
 */
public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없습니다. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 인덱스를 초과했습니다. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
            }
        }

    }
}
