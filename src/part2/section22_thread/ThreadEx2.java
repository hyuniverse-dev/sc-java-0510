package part2.section22_thread;

import java.awt.*;

// Thread() 객체를 직접 생성하여 작업 스레드 사용하는 방법

public class ThreadEx2 {
    public static void main(String[] args) {
        // Runnable 인터페이스의 구현체를 Thread() 객체에 전달해준다.
        Runnable task = new Runnable() {
            @Override
            public void run() {
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
        };

        Thread thread = new Thread(task);
        thread.start();

        // 1초 간격으로 콘솔에 "띵~" 문자열 출력하는 반복문 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("띵~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
