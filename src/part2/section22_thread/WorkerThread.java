package part2.section22_thread;

import java.awt.*;

/*
    Thread 의 자식 객체로 정의한다.
    run() 메소드를 재정의하여 실행할 작업을 작성한다.
    병렬 처리에 반복적으로 사용이 필요한 작업은 자식 객체로 정의하여 재사용 한다.
 */
public class WorkerThread extends Thread {
    @Override
    public void run() {
        // 스레드가 실행할 코드를 작성
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
