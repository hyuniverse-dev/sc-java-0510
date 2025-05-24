package part2.section22_thread;

/*
    스레드 이름
        - 스레드는 자신의 이름을 가지고 있다.
        - 메인 스레드는 'main' 이라는 이름 가지고 있다.
        - 작업 스레드는 'Thread-n' 이라는 이름을 가지게 된다.
        - 따라서 특정 작업에 맞는 스레드 이름을 부여해야 식별이 편리해진다.
 */
public class ThreadNameEx {
    public static void main(String[] args) {
        // 스레드 이름 확인
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread = " + mainThread);

        // 작업 스레드 생성 - 3개
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " - 작업 실행");
                }
            };
            thread.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " - 작업 실행");
            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
