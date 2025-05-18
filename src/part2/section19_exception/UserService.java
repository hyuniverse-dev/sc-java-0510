package part2.section19_exception;

/*
    사용자 정의 예외 객체 실습하기
        - 
 */
public class UserService {
    public static void main(String[] args) {
        String userId = "abc";
        String userPassword = "1234";

        // User 객체 생성
        User userA = new User("abc", "1234");

        // 사용자가 입력한 아이디가 저장되어 있는 아이디와 다르면 UserIdException 예외 발생
        // 사용자가 입력한 아이디가 저장되어 있는 비밀번호와 다르면 UserPasswordException 예외 발생
        // 각 예외의 종류별로 예외 처리 -> printstacktrace() 메소드 호출해서 예외 정보 모두 출력하기
        try {
            userA.validIdAndPassword(userId, userPassword);
        } catch (UserIdException | UserPasswordException e) {
            e.printStackTrace();
        }
    }
}
