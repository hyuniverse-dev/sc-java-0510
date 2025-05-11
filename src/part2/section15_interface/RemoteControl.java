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
        - public 상수 필드
        - public 추상 메소드 (*)
        - public 디폴트 메소드
        - public 정적 메소드
        - private 메소드
        - private 정적 메소드
 */
public interface RemoteControl {
    // public 추상 메소드 선언
    public void turnOn();
}
