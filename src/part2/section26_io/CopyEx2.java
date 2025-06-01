package part2.section26_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    파일 복사하기2 - transferTo() 메소드
        - Java 9 이상부터 사용가능
 */
public class CopyEx2 {
    public static void main(String[] args) {
        // 복사할 대상의 경로
        String originalFile = "src/part2/section26_io/test2.jpg";
        // 복사한 대상을 저장할 경로
        String copyFile = "src/part2/section26_io/copy2.jpg";

        try {
            // 입력 스트림 생성
            FileInputStream is = new FileInputStream(originalFile);
            // 출력 스트림 생성
            FileOutputStream os = new FileOutputStream(copyFile);

            is.transferTo(os);

            os.flush();
            os.close();
            is.close();

            System.out.println("복사가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
