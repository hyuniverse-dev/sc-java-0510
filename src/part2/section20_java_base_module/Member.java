package part2.section20_java_base_module;


public class Member {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "id = " + id;
    }
}
