package part2.section25_stream;

import java.util.Arrays;
import java.util.List;

/*
    요소 집계
        - 집계(Aggregate)는 최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등
          하나의 결과로 값이 산출되는 것을 의미한다.
        - 즉, 대량의 데이터를 가공해서 하나의 값으로 산출시키는 것을 의미한다.
 */
public class AggregateEx {
    public static void main(String[] args) {
        // 정수 배열
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 카운팅 - .count()
        long count = Arrays.stream(intArray)
                .filter(item -> item % 2 == 0)
                .count();
        System.out.println("2의 배수의 개수: " + count);

        // 총합
        int total = Arrays.stream(intArray)
                .filter(item -> item % 2 == 0)
                .sum();
        System.out.println("2의 배수의 총합: " + total);

        // 평균
        double average = Arrays.stream(intArray)
                .average()
                .getAsDouble();
        System.out.println("전체 요소의 평균: " + average);

        // 최대값
        int maxValue = Arrays.stream(intArray)
                .max()
                .getAsInt();
        System.out.println("전체 요소 중 최대값: " + maxValue);

        // 최소값
        int minValue = Arrays.stream(intArray)
                .min()
                .getAsInt();
        System.out.println("전체 요소 중 최소값: " + minValue);

    }
}
