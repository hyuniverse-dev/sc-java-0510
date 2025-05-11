package part2.section15_interface;

public class CarEx {
    public static void main(String[] args) {
        // 자동차 인스턴스 생성
        Car car = new Car();
        car.run();

        System.out.println();

        // 타이어 교체
        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();
        car.run();
    }
}
