package part2.section17_nested_interface;

/*
    중첩 인터페이스 사용하기
        - 특정한 이벤트를 처리하는 "이벤트 리스너 패턴"을 사용하는 경우 주로 중첩된 인터페이스를 사용한다.
        - Button 객체는 껍데기에 불과하고 실제 실행되는 기능은 ClickListener 에 대입된 구현체에 따라 달라진다.
        - 이런식으로 하면 동일한 역할을 버튼을 하나로 관리할 수 있게 된다.
        - 만약 필요한 동작을 가진 여러 Button 을 종류 별로 생성하면 클래스의 양이 상당히 방대해진다. 이런 경우 유지보수가 복잡해진다.
 */
public class ButtonEx {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button button = new Button();

        // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스를 선언
        // class OkListener implements Button.ClickListener {
        //    @Override
        //    public void onClick() {
        //        System.out.println("Ok 버튼을 클릭했습니다.");
        //    }
        // } -> 익명 구현 객체로 변경하면 다음과 같다.

        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });
        button.click();

        // ---------------------------------------

        // Cancel 버튼 객체 생성
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        button.setClickListener(new CancelListener());
        button.click();
    }
}
