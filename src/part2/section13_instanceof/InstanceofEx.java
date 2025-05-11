package part2.section13_instanceof;

/*
    노션: https://hyuniverse-space.notion.site/11a2c9c18dcc80888f0fed256a2ada0a?pvs=4
    객체 타입 확인
        - 상속 관계가 생성되면 다형성을 구현할 수 있다.
        - 다형성은 부모 클래스의 타입을 공유해서 사용한다.
        - 부모 클래스의 타입을 사용하면 자식 클래스의 특정 메소드 또는 필드에 접근 불가능하다.
        - 따라서 다형성이 적용된 부분에서 특정 자식 클래스의 메소드 또는 필드에 접근하기 위하여
          인스턴스를 검사해야 한다.
        - 이것을 instanceof 연산자로 처리한다.
 */
public class InstanceofEx {

    public static void personInfo(Person person) {
        // 학생인 경우는 학생 이름과 번호를 출력합니다.
        // 강사인 경우는 강사 이름과 과목을 출력합니다.
        if (person instanceof Student student) {
            int studentNo = student.studentNo;
            String name = student.name;

            System.out.println("학생 이름: " + name + " / 학생 번호: " + studentNo);
            student.study();
        } else if (person instanceof Teacher teacher) {
            // 출력문 작성: 강사 이름: 000 / 강의 과목: 000
            System.out.println("강사 이름: " + teacher.name + " / 강의 과목: " + teacher.subject);
            teacher.teach();
        } else {
            // 출력문 작성: 이름: 000
            System.out.println("이름: " + person.name);
        }
    }

    public static void main(String[] args) {
        // 사람 객체 생성
        Person person = new Person("홍길동");
        personInfo(person);

        // 학생 객체 생성
        Student student = new Student("김길동", 1);
        personInfo(student);

        // 강사 객체 생성
        Teacher teacher = new Teacher("박길동", "컴퓨터");
        personInfo(teacher);

    }
}
