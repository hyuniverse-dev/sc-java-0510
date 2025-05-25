package part2.section23_collention;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
    Vector
        - ArrayList와 동일한 내부 구조를 가지고 있다.
        - 차이점은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드 환경에서 안전하게 객체를 관리할 수 있다.
        - 멀티 스레드 환경에서 ArrayList 사용 시 스레드 간에 경합이 발생하기 때문에 기대 결과가 나오지 않을 수 있다.
 */
public class VectorEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new Vector<>();

        // 작업 스레드 생성
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "작성자" + i));
                }
            }
        });

        // 작업 스레드 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "작성자" + i));
                }
            }
        });

        thread1.start();
        thread2.start();

        // 작업 스레드가 모두 종료될 때까지 대기
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 저장된 총 객체 수 읽기
        int size = list.size();
        System.out.println("저장된 총 객체 수 = " + size);
    }
}
