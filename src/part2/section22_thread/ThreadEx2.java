package part2.section22_thread;

import java.awt.*;

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


    }
}
