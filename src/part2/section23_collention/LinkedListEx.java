package part2.section23_collention;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    LinkedList
        - 사용방법은 ArrayList 동일하다. 하지만 내부 구조가 완전히 다르다.
        - ArrayList 내부에 배열을 저장하지만, LinkedList 는 인접 객체를 체인처럼 연결한 구조이다.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        // ArrayList 객체 생성
        List<String> list1 = new ArrayList<>();

        // LinkedList 객체 생성
        List<String> list2 = new LinkedList<>();

        // 시작 시간과 끝 시간을 저장할 변수
        long startTime;
        long endTime;

        // ArrayList에 객체 추가 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간: " + (endTime - startTime) + "ns");

        // LinkedList에 객체 추가 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + "ns");
    }
}
