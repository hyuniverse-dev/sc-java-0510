package part2.section26_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    입출력 스트림으로 파일 복사
 */
public class CopyEx {
    public static void main(String[] args) {
        // 복사할 대상의 경로
        String originalFile = "src/part2/section26_io/test.jpg";
        // 복사한 대상을 저장할 경로
        String copyFile = "src/part2/section26_io/copy.jpg";

        try {
            // 입력 스트림 생성
            FileInputStream is = new FileInputStream(originalFile);
            // 출력 스트림 생성
            FileOutputStream os = new FileOutputStream(copyFile);

            // 읽은 바이트를 저장할 배열을 생성
            byte[] data = new byte[1024];

            // 입력 -> 출력
            while (true) {
                int num = is.read(data);
                if (num == -1) {
                    break; // 파일을 다 읽으면 반복문 종료
                }
                // 읽은 바이트 수만큼 처음(0) 인덱스부터 내보내기
                os.write(data, 0, num);
            }

            os.flush();
            os.close();
            is.close();

            System.out.println("복사가 완료되었습니다!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
