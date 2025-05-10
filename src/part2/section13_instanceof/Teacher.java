package part2.section13_instanceof;

public class Teacher extends Person { // Person 상속
    // 필드 선언
    // String 타입의 subject 선언
    public String subject;

    // 생성자
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }


    // 메소드 선언
    // teach() 메소드를 선언하고, "교육합니다." 출력하도록 기술
    public void teach() {
        System.out.println("교육합니다.");
    }
}
