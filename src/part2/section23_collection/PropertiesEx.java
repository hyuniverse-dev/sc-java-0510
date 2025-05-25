package part2.section23_collection;

import java.io.IOException;
import java.util.Properties;

/*
    Properties
        - 키와 값을 String 타입으로 제한한다.
        - .properties 파일 확장자가 별도로 존재한다.
        - 따라서 .properties 파일의 내용을 읽어들일 때 사용하는 객체이다.
 */
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        // Properties 컬렉션 생성
        Properties properties = new Properties();

        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));

        // .properties 파일에 읽은 데이터를 추출
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // 출력
        System.out.println("driver = " + driver);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
