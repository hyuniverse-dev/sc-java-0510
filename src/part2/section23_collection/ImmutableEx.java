package part2.section23_collection;

import java.util.*;

/*
    수정할 수 없는 컬렉션
        - 새로운 요소를 추가, 기존 요소를 삭제할 수 없는 컬렉션을 얘기한다.
        - 컬렉션 생성 시 저장된 요소를 변경하고 싶지 않을 때 주로 사용한다.
        - 가장 대표적인 방법은 List, Set, Map 인터페이스의 정적 메소드 of()로 생성한다.
        - copyOf() 정적 메소드도 기존 컬렉션을 복사하여 수정할 수 없는 새로운 컬렉션을 반환한다.
 */
public class ImmutableEx {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "cherry");
//        list1.add("orange"); -> UnsupportedOperationException 이 발생한다.

        Set<String> set1 = Set.of("apple", "banana", "cherry");
//        set1.add("orange");

        Map<String, Integer> map1 = Map.of("apple", 1, "banana", 2, "cherry", 3);
//        map1.put("orange", 4);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");

        // list2 를 복사하여 사용
        List<String> copyList = List.copyOf(list2);
//        copyList.add("orange");

        // HashSet 구현체로 Set 컬렉션을 생성 -> 변수명은 set2
        Set<String> set2 = new HashSet<>();

        // "apple", "banana" 요소를 추가한다.
        set2.add("apple");
        set2.add("banana");

        // Set의 정적 메소드 copyOf() 사용해서 컬렉션 복사
        Set<String> copySet = Set.copyOf(set2);

        // 복사된 컬렉션 출력 - iterator() 호출해서 순회
        Iterator<String> iterator = copySet.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
