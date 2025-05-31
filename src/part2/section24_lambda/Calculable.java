package part2.section24_lambda;

/*
    @functionalInterface 는 함수형 인터페이스임을 보장하기 위한 어노테이션이다.
 */
@FunctionalInterface
public interface Calculable {

    void calculate(int a, int b);
}
