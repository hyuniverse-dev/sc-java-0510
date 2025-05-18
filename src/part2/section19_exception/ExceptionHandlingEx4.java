package part2.section19_exception;

/*
    사용자 정의 예외
        - 내 프로그램에 필요한 예외가 기본 예외 객체에 존재하지 않는 경우 사용자가 정의한 예외 객체를 사용한다.
        - 예를 들어, 은행앱에서 잔고 부족인 경우 발생시킬 예외가 필요한데 Java 기본 예외 객체에는 존재하지 않는다.
        - 이런 경우 예외 객체를 생성하여 사용한다.
 */
public class ExceptionHandlingEx4 {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (AccountException e) {
            e.printStackTrace();
        }

        System.out.println("==프로그램 종료==");
    }
}
