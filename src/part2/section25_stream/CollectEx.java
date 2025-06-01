package part2.section25_stream;

import java.util.Arrays;
import java.util.List;

/*
    필터링한 요소를 수집하기
        - stream의 collect() 메소드는 필터링 또는 매핑된 요소들을 새로운 컬렉션으로 수집한다.
 */
public class CollectEx {
    public static void main(String[] args) {
        // 학생 List 컬렉션 생성
        List<Student2> students = Arrays.asList(
                new Student2("박길동", "남", 98),
                new Student2("김길동", "남", 89),
                new Student2("박길순", "여", 99),
                new Student2("김길순", "여", 88)
        );

        // 남학생만 모아서 새로운 컬렉션 생성
        List<Student2> males = students.stream()
                .filter(item -> item.getGender().equals("남"))
                .toList();

        // 향상된 for 문으로 학생 이름 출력
        for (Student2 male : males) {
            System.out.println(male.getName());
        }

        // forEach()로 학생 이름 출력
        males.forEach(male -> System.out.println(male.getName()));

        // 여학생이면서 점수가 90점 이상인 학생만 필터링해서 새로운 컬렉션으로 생성하기
        List<Student2> females = students.stream()
                .filter(item -> {
                    if (item.getGender().equals("여") && item.getScore() >= 90) {
                        return true;
                    }
                    return false;
                })
                .toList();

        // forEach()로 학생 이름 출력
        females.forEach(item -> System.out.println(item.getName()));


    }
}
