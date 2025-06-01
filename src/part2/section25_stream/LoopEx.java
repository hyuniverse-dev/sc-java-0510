package part2.section25_stream;

import java.util.Arrays;
import java.util.List;

/*
    반복하면서 요소 처리하기(루핑)
        - 루핑은 스트림에서 요소를 하나씩 반복해서 가져와 처리하는 것을 말한다.
        - 앞서 사용했던 forEach() 외에도 peek() 메소드가 있다.
        - forEach() 최종 처리 기능을 가지고 있는 peek() 중간 처리 기능을 가지고 있다.
 */
public class LoopEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        long count = numbers.stream()
                .filter(item -> item % 2 == 0) // numbers 리스트에서 짝수만 필터
                .peek(item -> System.out.println(item)) // 중간 처리 메소드
                .count(); // 최종 처리 메소드
        System.out.println("numbers 리스트의 짝수 개수: " + count);

        numbers.stream()
                .filter(item -> item % 2 == 0)
                .forEach(item -> System.out.println(item));

    }
}
