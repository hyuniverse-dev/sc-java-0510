package part2.section22_thread;

import java.awt.*;

/*
    작업 스레드 생성과 실행
        - Java 프로그램은 메인 스레드가 반드시 존재하기 때문에 메인 스레드 작업 이외에
          추가적인 작업 수만큼 필요하면 작업 스레드를 생성하면 된다.

    작업 스레드 생성 방법
        1. Thread() 객체로 직접 작업 스레드를 생성하는 방법
        2. Thread 객체를 상속받아서 자식 객체로 구현하는 방법

    Thread() 객체로 직접 생성하기
        1. Runnable 구현체를 매개값으로 갖는 생성자를 호출해야 한다.
        2. 생성된 구현체는 Thread() 객체에 전달한다.
 */
public class ThreadEx1 {

    public static void main(String[] args) {
        // Java 내장 툴킷 중 비프음을 내는 툴킷 사용
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                // sleep() 메소드는 내부적으로 InterruptedException 을 발생시켜서 '실행 대기 상태'로 돌아온다.
                // 따라서 해당 메소드를 사용할 때는 예외처리를 필요로 한다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // beep 효과음이 5번(5초) 실행이 끝나야지만 출력문을 실행시킨다.
        for (int i = 0; i < 5; i++) {
            System.out.println("띵~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 프로세스 종료까지 총 10초 소요된다.
    }
}
