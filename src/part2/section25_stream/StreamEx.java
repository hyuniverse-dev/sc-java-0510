package part2.section25_stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    스트림
        - Java 8 이상부터 사용 가능한다.
        - 앞서 사용했던 for문 / Iterator 외에 다른 방법으로 컬렉션 및 배열의 요소를 처리하는 방법이다.

    스트림과 Iterator/for문의 차이점
        1. 스트림은 내부 반복자이므로 처리 속도 빠르고 병렬 처리에 효율적이다.
        2. 람다식을 사용하기 때문에 문법이 간결하고 확장성이 높다.
        3. 중간 처리와 최종 처리를 수행하도록 파이프라인(메소드 체이닝 기법)을 형성할 수 있다.

    내부 반복자 / 외부 반복자
        1. 외부 반복자: 컬렉션의 요소를 외부로 가져오는 코드와 처리하는 코드를 모두 개발자가 처리한다.
        2. 내부 반복자: 개발자가 제공한 코드(람다식)를 가지고 컬렉션 내부에서 요소를 처리한다.

    병렬 처리
        1. 대표적으로 parallelStream() 메소드를 사용해서 병렬 처리 스트림으로 사용이 가능한다.
 */
public class StreamEx {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();

        // Set 에 요소 추가
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // 기존 방법
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
        }

        System.out.println();

        // Stream 사용 방법
        Stream<String> stream = set.stream();

        // Stream 객체의 forEach() 메소드 호출
        stream.forEach((item) -> {
            System.out.println("item = " + item);
        });

        // parallelStream() 사용하기
        List<String> list = new ArrayList<>();

        // list 에 요소 추가
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("berry");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach((item) -> {
            // 현재 item을 처리하고 있는 스레드 정보 출력
            System.out.println(item + " - " + Thread.currentThread().getName());
        });

        // 파이프 라인 형성하기(메소드 체이닝)
        List<Student> students = Arrays.asList(
                new Student("John", 85),
                new Student("Alice", 92),
                new Student("Bob", 78)
        );

        // 방법(1)
        Stream<Student> studentStream = students.stream();
        IntStream scoreStream = studentStream.mapToInt(item -> item.getScore());
        double average = scoreStream.average().getAsDouble();
        System.out.println("학생 평균: " + average);

        // 방법(2)
        double average2 = students.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("학생 평균 = " + average2);

        // 연습
        // 위의 스트림을 for 문으로 변환하여 작성해보세요.
        int total = 0;
        for (Student student : students) {
            total += student.getScore();
        }
        double average3 = (double) total / students.size();

    }
}
