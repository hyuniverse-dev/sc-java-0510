package part2.section21_generic;

/*
    제네릭(Generic)
        - 인스턴스를 생성할 때 타입을 파라미터 넘겨주고, 해당 인스턴스의 타입을 지정하는 방법이다.
        - Object 타입을 사용하면 '객체 검사' 와 '다운 캐스팅'을 반복해야 한다.
          따라서 이 불편함을 해소하기 위한 방법이다.
        - 객체를 생성할 때 어떤 종류의 content 인지를 명시적으로 지정하는 방법이다.
 */
public class GenericEx {

    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.content = "Apple";
        String content = box1.content;
        System.out.println("content = " + content);

        Box<String> box2 = new Box<>();
        box2.content = "Banana";
        String content2 = box2.content;
        System.out.println("content2 = " + content2);

        Box<Integer> box3 = new Box<>();
        box3.content = 100;
        Integer content3 = box3.content;
        System.out.println("content3 = " + content3);
    }
}
