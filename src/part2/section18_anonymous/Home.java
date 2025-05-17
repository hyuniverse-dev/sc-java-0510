package part2.section18_anonymous;
/*
    익명 구현 객체
        - 대표적으로 특정 인터페이스 타입의 필드를 기본값으로 초기화할 때 사용한다.
        - 별도의 구현 객체를 생성하고 싶지 않을 때 익명 객체를 사용해서 대입한다.
        - 기존 인터페이스와 동일하게 익명 객체 내부에서 추상 메소드를 구현한다.
 */
public class Home {

    // 필드 (Home 객체 생성과 동시에 리모콘 구현체 초기화)
    private RemoteControl rc = new RemoteControl() {

        @Override
        public void turnOn() {
            System.out.println("기본 리모콘 / 전원이 켜집니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("기본 리모콘 / 전원이 꺼집니다.");
        }
    };

    // 메소드
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드
    public void use2() {
        rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV 전원을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV 전원을 끕니다.");
            }
        };

        rc.turnOn();
        rc.turnOff();
    }
}
