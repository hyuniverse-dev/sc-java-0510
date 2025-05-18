package part2.section20_java_base_module.chapter1_object;

public class Member3Ex {
    public static void main(String[] args) {
        Member3 member = new Member3("summer", "여름", 20);

        System.out.println(member.getId());
        System.out.println(member.getName());
        System.out.println(member.getAge());

        member.setAge(30);
        System.out.println(member.getAge());

        System.out.println(member);


    }
}
