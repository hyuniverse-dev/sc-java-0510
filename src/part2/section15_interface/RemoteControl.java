package part2.section15_interface;

/*
    노션
        - [인터페이스의 역할]https://hyuniverse-space.notion.site/1202c9c18dcc8047b50ac1eecb5dbc44?pvs=4
        - [인터페이스와 구현 클래스]https://hyuniverse-space.notion.site/1202c9c18dcc80c8af82d9055dbc8155?pvs=4
    인터페이스 개념
        - 인터페이스는 사전적으로는 '접속기'라고 한다.
        - 두 장치(객체) 사이에서 연결해주는 역할한다.
        - 따라서 A객체가 B객체를 직접 호출하는 것이 아니라 중간에 인터페이스를 거쳐서 호출하도록 구현한다.
        - 인터페이스를 사용하면 A객체를 인터페이스만 참조하기 때문에 B객체가 변경되더라도 관심이 없다.
        - 객체 간의 결합도를 낮추는 방법이다.
        
    인터페이스가 가질 수 있는 멤버
        - public 상수 필드 (*)
        - public 추상 메소드 (**)
        - public 디폴트 메소드 (*)
        - public 정적 메소드
        - private 정적 메소드
        - private 메소드
 */
public interface RemoteControl {
    /*
        노션: [상수 필드] https://hyuniverse-space.notion.site/1202c9c18dcc80a99674dbfb306ed4d8?pvs=4
        public 상수 필드: [public static final] 타입 상수명 = 값;
        인터페이스 선언된 필드는 모두 public static final 특성을 갖기 때문에 생략이 가능하다.
     */
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    /*
        노션: [추상 메소드] https://hyuniverse-space.notion.site/1222c9c18dcc803d807bf29000e56676?pvs=4
        public 추상 메소드 선언: [public abstract] 리턴타입 메소드명(매개변수 목록);
        [public abstract] 키워드는 생략이 가능하다.
        구현체에서 반드시 실행부를 구현해야 한다. (재정의 한다.)
        추상 메소드는 기본적으로 public 접근 제한자를 갖기 때문에 public 보다 낮은 접근 제한으로 재정의 할 수 없습니다.
     */
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    /*
        노션: [default 메소드] https://hyuniverse-space.notion.site/1222c9c18dcc806da495dff86183f8cb?pvs=4
        default 메소드 선언:  [public] default 리턴타입 메소드명(매개변수 목록) {...}
        [public] 키워드는 생략이 가능하다.
        추상메소드는 구현체에서 실행부를 구현하지만 default 메소드는 인터페이스에서 실행부를 가진다.
        상수 필드를 읽거나 추상 메소드를 호출하는 코드를 작성할 수 있다.
     */
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음을 처리합니다.");
        } else {
            System.out.println("무음을 해제합니다.");
        }
    }

    ;

    /*
        노션: [정적 메소드] https://hyuniverse-space.notion.site/1222c9c18dcc80eeb3dff7273f6949a0?pvs=4
        public 정적 메소드: [public | private] static 리턴타입 메소드명(매개변수 목록) {...}
        [public | private] 은 생략이 가능하다.
        구현체가 없어도 인터페이스만으로 호출이 가능하다. 따라서 상수 필드와 동일하다.
     */
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
