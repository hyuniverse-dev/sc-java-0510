package part2.section23_collection;

import java.util.ArrayList;
import java.util.List;

/*
    ArrayList
        - List 컬렉션에서 가장 많이 사용되는 컬렉션이다.
        - ArrayList에 객체를 추가하면 내부 배열에 객체가 저장된다.
        - 앞 단원에서 학습했던 배열과 유사하다.
        - 기존 배열과의 차이점은 제한 없이 객체를 추가할 수 있다는 것이다.
    ArrayList 관련된 메소드
        - 객체 추가: add(), set()
        - 객체 검색: contains(), get(), isEmpty(), size()
        - 객체 삭제: clear(), remove()
    ArrayList 특징
        - ArrayList 컬렉션에 객체를 추가하면 차례대로 저장된다.
        - 특정 인덱스의 객체를 제거하거나 추가하면 모두 순서가 조정된다.
        - 따라서 빈번한 객체 삽입/삭제가 일어나는 곳에서는 ArrayList 컬렉션을 사용하면 성능 저하를 발생시킬 수 있따.
 */
public class ArrayListEx {
    public static void main(String[] args) {

        // ArrayList 컬렉션 객체 생성
        List<Board> list = new ArrayList<>();

        // list 에 객체를 추가 - add() 메소드 호출
        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));
        list.add(new Board("제목4", "내용4", "작성자4"));
        list.add(new Board("제목5", "내용5", "작성자5"));

        // list 에 저장된 총 객체의 수 읽기 - size() 메소드 호출
        int size = list.size();
        System.out.println("저장된 총 객체 수 = " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board board = list.get(1);
        System.out.printf("%s\t %s\t %s\n", board.getSubject(), board.getContent(), board.getWriter());

        // 모든 객체를 가져오기
        for (Board item : list) {
            // printf() 메소드를 사용해서 모든 객체의 정보를 위와 같이 출력하세요.
            System.out.printf("%s\t %s\t %s\n", item.getSubject(), item.getContent(), item.getWriter());
        }

        System.out.println("------------");

        // 특정 객체 삭제
        list.remove(2);

        // 2번 인덱스 삭제 후 결과 확인하기
        for (Board item : list) {
            // printf() 메소드를 사용해서 모든 객체의 정보를 위와 같이 출력하세요.
            System.out.printf("%s\t %s\t %s\n", item.getSubject(), item.getContent(), item.getWriter());
        }

        System.out.println("------------");
        // 전체 객체 삭제
        list.clear();
        System.out.println("저장된 객체 수 = " + list.size());
    }
}
