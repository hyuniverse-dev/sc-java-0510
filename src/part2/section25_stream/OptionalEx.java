package part2.section25_stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
    Optional 클래스
        - 집계값이 존재하지 않는 경우 기본값을 설정하거나 집계값을 안전하게 처리하기 위한 클래스이다.
        - isPresent(): 집계값이 있는지 여부
        - orElse(): 집계값이 없을 경우 기본값을 설정
        - ifPresent(): 집계값이 있는 경우에만 처리

    사용하는 이유
        - 컬렉션에 요소가 존재하지 않으면 집계 값을 산출할 수 없기 때문에 예외(NoSuchElementException)가 발생한다.
        - 따라서 예외 상황을 안전하게 처리하기 위한 방법이다.
 */
public class OptionalEx {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Integer> list = Arrays.asList();

        // NoSuchElementException 발생!
        /*
        double average = list.stream()
                .mapToInt(item -> item.intValue())
                .average()
                .getAsDouble();
        System.out.println("평균 값: " + average);
        */

        // 방법(1)
        OptionalDouble optional = list.stream()
                .mapToInt(item -> item.intValue())
                .average();

        if (optional.isPresent()) {
            double average = optional.getAsDouble();
            System.out.println("평균 값: " + average);
        } else {
            System.out.println("평균 값: 0.0");
        }

        // 방법(2)
        double average = list.stream()
                .mapToInt(item -> item.intValue())
                .average()
                .orElse(0.0);
        System.out.println("평균 값: " + average);

        // 방법(3)
        list.stream()
                .mapToInt(item -> item.intValue())
                .average()
                .ifPresent(item -> System.out.println("평균 값: " + item));
    }
}
