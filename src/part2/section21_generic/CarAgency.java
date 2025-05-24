package part2.section21_generic;

/*
    Car를 대여해주는 렌트점(Rentable의 구현체이고, 현재 타입은 Car이다.)
    추상 메소드 rent()의 반환타입과 반환값을 재정의한다.
 */
public class CarAgency implements Rentable<Car2> {
    @Override
    public Car2 rent() {
        return new Car2();
    }
}
