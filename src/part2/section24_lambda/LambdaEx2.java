package part2.section24_lambda;

/*
    1. 매개변수가 없는 람다식
    2. 매개변수가 있는 람다식
 */
public class LambdaEx2 {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person();

        person.work(() -> {
            System.out.println("일을 합니다.");
        });

        person.work(() -> System.out.println("공부를 합니다."));
    }
}
