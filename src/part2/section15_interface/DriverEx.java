package part2.section15_interface;

/*
    메소드 다형성
        - 매개변수 타입을 인터페이스로 선언하여 여러 구현체를 파라미터로 넘겨 받을 수 있다.
          추상 메소드를 호출하여 넘겨준 객체의 실행부를 호출한다.
          따라서 다형성을 구현할 수 있다.
 */
public class DriverEx {
    public static void main(String[] args) {
        // 운전자 객체 생성
        Driver driver = new Driver();

        // 버스 객체 생성
        Bus bus = new Bus();
        driver.drive(bus);

        // 택시 객체 생성
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
