package part2.section19_exception;

public class User {
    private String userId;
    private String userPassword;

    public User(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public void validIdAndPassword(String userId, String userPassword) throws UserIdException, UserPasswordException{
        // 저장되어 있는 사용자 아이디&비밀번호와 사용자가 입력한 아이디&비밀번호가 유효성 체크를 진행한다.
        // 아이디 또는 비밀번호가 일치하지 않으면 예외 떠넘기기

        if (!this.userId.equals(userId)) {
            // UserIdException 예외 발생시키기
            throw new UserIdException("사용자 아이디가 일치하지 않습니다.");
        } else if (!this.userPassword.equals(userPassword)) {
            // UserPasswordException 예외 발생시키기
            throw new UserPasswordException("사용자 비밀번호가 일치하지 않습니다.");
        }
    }
}
