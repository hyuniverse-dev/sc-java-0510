package part2.section26_io;

import java.io.FileInputStream;
import java.io.IOException;

/*
    입력 스트림
 */
public class ReadEx {
    public static void main(String[] args) {

        try {
            // 입력 스트림
            FileInputStream is = new FileInputStream("src/part2/section26_io/test.db");

            while (true) {
                int data = is.read();
                // 입력 스트림은 파일을 다 읽으면 -1을 반환
                if (data == -1) {
                    break;
                }
                // 읽은 데이터 출력
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
