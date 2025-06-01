package part2.section25_stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
    요소 조건 만족 여부(매칭)
        - 컬렉션 안에 요소들이 특정 조건에 만족을 하는지 여부를 조사하는 최종 처리 기능이다.
        - allMatch(모든 요소가 만족하는지), anyMatch(최소한 하나라도 만족하는지), noneMatch(모든 요소가 만족하지 않는지)
 */
public class MatchingEx {
    public static void main(String[] args) {
        // 숫자 배열이 존재 -> 모든 수가 짝수 / 하나라도 짝수 / 짝수가 하나도 없는지
        int[] intArray = {2, 4, 6};

        boolean result = Arrays.stream(intArray)
                .allMatch(item -> item % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        result = Arrays.stream(intArray)
                .anyMatch(item -> item % 2 == 0);
        System.out.println("2의 배수가 하나로 존재하는가? " + result);

        result = Arrays.stream(intArray)
                .noneMatch(item -> item % 5 == 0);
        System.out.println("5의 배수가 하나도 존재하지 않는가? " + result);

        // 컬렉션으로 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        result = numbers.stream()
                .allMatch(item -> item > 2);
        System.out.println("모든 요소가 2보다 큰가? " + result);

        // 연습
        //  numbers2 리스트의 숫자들에 *2 한 결과 중 하나라도 50보다 작은 정수가 있는지 검사
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);
        result = numbers2.stream()
                .anyMatch(item -> item * 2 < 50);
        System.out.println("원래 숫자 * 2 한 결과 중 50보다 작은 정수가 하나라도 있는가? " + result);
    }
}
