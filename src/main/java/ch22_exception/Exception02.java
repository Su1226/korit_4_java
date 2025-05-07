package ch22_exception;

// 사용자 정의 예외
class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

public class Exception02 {
   public static void login(String id, String password) throws LoginFailedException {
       // 지역 변수
       String correctId = "admin";
       String corredtPassword = "1q2w3e4r";

       if(!id.equals(correctId) || !password.equals(corredtPassword)) {
           throw new LoginFailedException("ID 또는 Password가 틀렸습니다.");
       }
   }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";
        
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}


/*
    String age = "123";
    자료형이 String이기 때문에 수학적인 연산은 불가능하다.
    그러나 Java의 특정 클래스의 특정 메소드는 저런 식으로 String 숫자 형태의 int로 바꿔주는 메소드도 있다.

    - Integer.parseInt(String s)
    - Integer.valueOf(String s)
 */