package part2.section25_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    요소 정렬하기
        - 오름차순 정렬 또는 내림차순 정렬을 하는 중간 처리 방법입니다.
        
 */
public class SortingEx {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("박길동", 87),
                new Student("김길동", 60)
        );

        // 점수를 기준으로 오름차순 정렬한 새로운 스트림 얻기
        students.stream()
                .sorted() // 정렬 메소드
                .forEach(item -> System.out.println(item));

        // 점수를 기준으로 내림차순 정렬한 새로운 스트림 얻기
        students.stream()
                .sorted(Comparator.reverseOrder()) // 정렬 메소드(내림 차순으로)
                .forEach(item -> System.out.println(item));
    }
}
