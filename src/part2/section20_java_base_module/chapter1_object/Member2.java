package part2.section20_java_base_module.chapter1_object;

/*
    레코드(record)
        - record 를 사용하여 클래스를 생성하는 경우 주어진 필드들은 자동으로 private final 로 선언된다.
        - 따라서 최초 대입된 값에서 변경이 불가능하기 때문에 읽기 전용 객체로 사용하는 경우 적합하다.
 */
public record Member2(String id, String name, int age) {
}
