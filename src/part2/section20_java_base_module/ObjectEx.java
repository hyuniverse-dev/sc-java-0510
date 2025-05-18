package part2.section20_java_base_module;

/*
    Object 클래스
        - 클래스를 선언할 때 extends 키워드로 다른 클래스를 명시적으로 상속받지 않으면
          암시적으로 java.lang.Object 상속하게 된다.
        - 자바의 모든 클래스는 Object 자식이거나 자손 클래스이다.
        - Object 클래스가 가진 메소드는 모든 클래스에서 사용할 수 있다.
          1) equals() - 객체의 번지를 비교하고 결과를 리턴
          2) hashCode() - 객체의 해시코드를 리턴
                        - equals()에서 얘기하는 '번지수'와 비슷하지만
                          객체를 식별하는 정수값이 부여되는데 그 값을 얘기한다.
          3) toString() - 객체 문자 정보를 리턴
 */
public class ObjectEx {
    public static void main(String[] args) {
        Member mem1 = new Member("blue");
        Member mem2 = new Member("blue");
        Member mem3 = new Member("red");

        // 동일한 member 인지 확인하기
        if (mem1.equals(mem2)) {
            System.out.println("mem1과 mem2는 동등합니다.");
        } else {
            System.out.println("mem1과 mem2는 동등하지 않습니다.");
        }

        if (mem1.equals(mem3)) {
            System.out.println("mem1과 mem3은 동등합니다.");
        } else {
            System.out.println("mem1과 mem3은 동등하지 않습니다.");
        }
        
        // 객체의 hasCode() 확인하기
        int mem1HashCode = mem1.hashCode();
        System.out.println("mem1HashCode = " + mem1HashCode);
        int mem2HashCode = mem2.hashCode();
        System.out.println("mem2HashCode = " + mem2HashCode);

        // 객체의 문자 정보 확인하기
//        String mem1Str = mem1.toString();

        // 객체를 직접 출력문에 안에 넣으면 toString() 메소드가 자동으로 호출된다.
        System.out.println(mem1);
    }
}
