package part2.section25_stream;

import java.util.Arrays;
import java.util.List;

/*
    요소 변환(매핑)
        - 스트림의 요소를 다른 요소로 변환하는 중간 처리 기능이다.
        - 앞선 예제에서 학생 객체에서 점수만 추출하여 IntStream 반환받은 것을 매핑이라고 표현한다.

    매핑의 종류
        - Int, Long, Double, Object 등이 있다.
 */
public class MapEx {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("박길동", 98),
                new Student("김길동", 77),
                new Student("이길동", 89)
        );

        // Student의 score만 모아서 새로운 스트림(IntStream)으로 반환 받기
        students.stream()
                .mapToInt(student -> student.getScore())
                .forEach(score -> System.out.println(score));

        System.out.println();

        // 80점 이상의 학생 score만 모아서 새로운 스트림(IntStream)으로 반환 받기
        students.stream()
                .filter(student -> student.getScore() >= 80)
                .mapToInt(student -> student.getScore())
                .forEach(score -> System.out.println(score));
    }
}
