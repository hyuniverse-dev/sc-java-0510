package part2.section24_lambda;

/*
    매개변수가 있는 람다식
 */
public class LambdaEx3 {
    public static void main(String[] args) {
        // Person2 객체 생성
        Person2 person = new Person2();

        // 인스턴스 메소드 action1() 호출
        //  name + "은(는)" + job + "입니다."
        person.action1((name, job) -> {
            System.out.println(name + "은(는)" + job + "입니다.");
        });

        // 인스턴스 메소드 action2() 호출
        //  "말하기: " + content
        person.action2(content -> System.out.println("말하기: " + content));
    }
}
