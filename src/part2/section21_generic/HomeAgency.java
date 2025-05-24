package part2.section21_generic;

/*
    Home을 대여해주는 렌트점(Rentable의 구현체이고, 현재 타입은 Home이다.)
    추상 메소드 rent()의 반환타입과 반환값을 재정의한다.
 */
public class HomeAgency implements Rentable<Home> {

    @Override
    public Home rent() {
        return new Home();
    }
}
