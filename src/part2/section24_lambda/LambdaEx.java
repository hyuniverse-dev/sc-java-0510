package part2.section24_lambda;

/*
    람다식(lambda expressions)
        - (파라미터, 파라미터, ...) -> { 본문 - 기능을 정의 }
 */
public class LambdaEx {
    public static void action(Calculable calculable) {
        // 데이터
        int a = 10;
        int b = 20;

        // 인터페이스의 추상 메소드 호출
        calculable.calculate(a, b);
    }

    public static void main(String[] args) {
        action((a, b) -> {
            // 람다식으로 인터페이스의 추상 메소드 구현
            System.out.println("a + b = " + (a + b));
        });

        action((a, b) -> {
            // 람다식으로 인터페이스의 추상 메소드 구현
            System.out.println("a - b = " + (a - b));
        });
    }
}
