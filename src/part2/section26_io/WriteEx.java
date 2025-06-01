package part2.section26_io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    출력 스트림
 */
public class WriteEx {
    public static void main(String[] args) {

        try {
            //  어떤 파일에 저장할 것인지?
            FileOutputStream os = new FileOutputStream("src/part2/section26_io/test.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 출력 스트림에 데이터 쓰기
            os.write(a);
            os.write(b);
            os.write(c);

            // 출력 스트림 비워내기
            os.flush();

            // 스트림 지우기(닫기)
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
