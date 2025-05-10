package part2.section13_instanceof;

public class Student extends Person {
    // 필드 선언
    public int studentNo;

    // 자식 객체 생성자
    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    // 메소드 선언
    public void study() {
        System.out.println("공부합니다.");
    }
}
