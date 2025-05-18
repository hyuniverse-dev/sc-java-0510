package part2.section19_exception;

public class Account {
    // 필드
    private long balance;

    // 기본 생성자
    public Account() {
    }

    // 잔고 확인 메소드
    public long getBalance() {
        return balance;
    }

    // 잔고 설정 메소드
    public void deposit(int money) {
        balance += money;
    }

    // 출금 메소드
    public void withdraw(int money) throws AccountException {
        if (balance < money) {
            // 예외를 발생시켜야 한다.
            throw new AccountException("잔고 부족: " + (money - balance) + "가 부족합니다.");
        }
        balance -= money;
    }


}
