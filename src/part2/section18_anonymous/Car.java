package part2.section18_anonymous;

public class Car {

    // 필드
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("스노우 타이어가 굴러갑니다.");
        }
    };

    // 메소드
    public void run1() {
        tire1.roll();
        tire2.roll();
    }
}
