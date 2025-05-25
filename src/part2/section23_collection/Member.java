package part2.section23_collection;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}
