package part2.section23_collection;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        // Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<>();

        // 데이터저장 - push()
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(1000));
        coinBox.push(new Coin(2000));
        coinBox.push(new Coin(5000));

        // 데이터 꺼내기 - pop() 메소드
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop(); // 스택에서 꺼낸 동전
            System.out.println("꺼낸 동전: " + coin.getValue());
        }
    }
}
