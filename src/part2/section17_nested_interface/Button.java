package part2.section17_nested_interface;

/*
    중첩 인터페이스
        - 클래스의 멤버로 선언된 인터페이스를 얘기한다.
        - 해당 클래스랑 긴밀한 관계를 맺는 구현 객체를 만들때 사용한다.
        - 특히 모바일 개발에서 이벤트 처리의 목적으로 많이 활용했던 예시이다.
    중첩 인터페이스 종류
        - 멤버 인터페이스
        - 정적 인터페이스
 */
public class Button {

    // 정적 중첩 인터페이스 - 어떤 종류의 클릭이 발생했는지 정의한 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // Setter
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    
    // click 메소드
    public void click() {
        // 구현 객체의 onClick() 메소드 호출
        clickListener.onClick();
    }
}
