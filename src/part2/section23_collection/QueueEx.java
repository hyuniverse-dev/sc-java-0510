package part2.section23_collection;

import java.util.LinkedList;
import java.util.Queue;

/*
    Queue(큐)
        - FIFO(First In First Out) 컬렉션이고 선입선출의 동작을 갖는다.
 */
public class QueueEx {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 데이터 저장
        messageQueue.offer(new Message("sendMail", "Alice"));
        messageQueue.offer(new Message("sendSMS", "Bob"));
        messageQueue.offer(new Message("sendKakao", "Noah"));

        // 데이터 가져오기
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            String body = switch (message.command) {
                case "sendMail" -> message.to + " 에게 메일을 보냅니다.";
                case "sendSMS" -> message.to + " 에게 문자를 보냅니다.";
                case "sendKakao" -> message.to + " 에게 카카오톡을 보냅니다.";
                default -> "알 수 없는 명령입니다.";
            };

            System.out.println(body);
        }
    }
}
