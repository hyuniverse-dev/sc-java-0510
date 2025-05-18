package part2.section20_java_base_module;

public class Member2Ex {
    public static void main(String[] args) {
        Member2 member1 = new Member2("winter", "겨울", 30);
        Member2 member2 = new Member2("summer", "여름", 20);

        System.out.println("member1.id() = " + member1.id());
        System.out.println(member1.toString());

        System.out.println("member2.id() = " + member2.id());
        System.out.println(member2.toString());
    }
}
