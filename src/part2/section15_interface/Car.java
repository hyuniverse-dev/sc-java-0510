package part2.section15_interface;

/*
    필드의 다형성
        - Car 객체의 타이어 속성에 어떤 제품의 타이어가 장착될 수 있도록
          다형성을 사용하여 구현한다.
        - 새로운 타이어 제품이 출시되면 Tire 인터페이스를 구현하여
          해당 필드에 대입하여 사용할 수 있다.
 */
public class Car {
    // 필드
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    // 메소드
    void run() {
        tire1.roll();
        tire2.roll();
    }
}
