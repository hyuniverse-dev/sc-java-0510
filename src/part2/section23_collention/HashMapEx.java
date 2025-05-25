package part2.section23_collention;

import java.util.*;
import java.util.Map.Entry;

/*
    HashMap
        - '키' 로 사용할 객체가 hashCode() 메소드의 리턴값이 같고 equals() 메소드가 true 를 리턴하면
          동일한 '키' 로 간주하고 중복 저장을 허용하지 않습니다.
 */
public class HashMapEx {
    public static void main(String[] args) {
        // HashMap 객체 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("김길동", 85);
        map.put("홍길동", 95);
        map.put("박길동", 81);
        map.put("이길동", 69);
        map.put("최길동", 90);
        map.put("최길동", 70);

        // map 사이즈 검사(엔트리 개수)
        System.out.println("총 엔트리 수: " + map.size());

        System.out.println("--------");

        // 객체 찾기 (키를 사용해서 값을 찾기)
        Integer score = map.get("최길동");
        System.out.println("최길동 점수: " + score);

        System.out.println("--------");

        // 키를 Set 컬렉션으로 변환
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        List<String> students = new ArrayList<>();
        students.add("박길동");
        students.add("홍길동");

        while (iterator.hasNext()) {
            String key = iterator.next();

            // 단순한 코드인 경우 아래와 같이 조건문 작성해도 되지만 하드코딩된 값 때문에 확장성(유연성)이 떨어진다.
//            if (key.equals("박길동") || key.equals("홍길동")) {
//                System.out.println(key + "의 점수: " + map.get(key));
//            }
            // 특정 학생의 점수만 출력하기
            if (students.contains(key)) {
                System.out.println(key + "의 점수: " + map.get(key));
            }
        }

        System.out.println("--------");

        // 엔트리 Set 컬렉션을 얻고, 반복자를 사용해서 키와 값을 출력하기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
