package part2.section23_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    HashSet
        - Set 컬렉션 중에서 가장 많이 사용한다.
        - 요소의 중복을 허용하지 않는다. 동등객체인지 검사해서 맞는 경우 추가하지 않는다.
        -
 */
public class HashSetEx {
    public static void main(String[] args) {
        // HashSet 객체 생성
        Set<String> set = new HashSet<>();

        // 객체 추가 - add()
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복값
        set.add("MyBatis");

        // 저장된 총 객체 수 얻기
        int size = set.size();
        System.out.println("저장된 총 객체 수: " + size);

        // HashSet 객체 생성
        Set<Member> set2 = new HashSet<>();

        // Member 객체 생성
        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("홍길동", 30);

        // set2 객체 추가
        set2.add(member1);
        set2.add(member2);

        // 저장된 총 객체 수 얻기
        size = set2.size();
        System.out.println("저장된 총 객체 수: " + size);

        // set 저장된 객체 가져오기
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("현재 요소: " + item);

            if (item.equals("JDBC")) {
                iterator.remove();
            }
        }

        size = set.size();
        System.out.println("저장된 객체 수 = " + size);
    }
}
