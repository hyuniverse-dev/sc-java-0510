package part2.section25_stream;

import java.util.Arrays;
import java.util.List;

/*
    요소 걸러내기(필터링)
        - distinct(), filter() 를 사용한다.
        - distinct(): 중복 제거하는 메소드
        - filter(): 조건 필터링
 */
public class FilteringEx {
    public static void main(String[] args) {
        // List 객체 생성
        List<String> list = Arrays.asList(
                "박길동",
                "김길동",
                "이길동",
                "최길동",
                "홍길동",
                "박영희",
                "이길동"
        );

        // 중복 요소 제거
        list.stream()
                .distinct()
                .forEach(item -> System.out.println(item));

        System.out.println();

        // '박' 으로 시작하는 이름 필터링
        list.stream()
                .filter(item -> item.startsWith("박"))
                .forEach(item -> System.out.println(item));

        // 중복 요소를 먼저 제거하고, '박'으로 시작하는 이름만 필터링
        list.stream()
                .distinct()
                .filter(item -> item.startsWith("박"))
                .forEach(item -> System.out.println(item));

        // 연습
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );

        // 원시 문법
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println();

        // stream
        numbers.stream()
                .filter(item -> item % 2 == 0)
                .forEach(item -> System.out.println(item));
    }
}
