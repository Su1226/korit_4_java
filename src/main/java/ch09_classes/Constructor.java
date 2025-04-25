package ch09_classes;

/*
    생성자(Constructor) : 객체가 생성될 때 호출되는 '특별한' 메소드
    - 클래스명 객체명 new = 클래스명();

    CarClass car = new CarClass();에서 CarClass()는 생성자였다.

    특징 1:
        1. 클래스의 이름과 생성자의 이름은 동일하다.
           (다른 메소드와 달리 대문자로 시작하고, 명사일 확률이 높다.)
        2. return 값이 없다.
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

    생성자 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자
            - 주로 클래스를 만들 때 default로 생성되기 때문에 정의하지 않는 경우가 많다.
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */

public class Constructor {

    int num;
    String name;

    // 기본 생성자를 정의하면, 다음과 같은 형태가 된다.
    public Constructor() {
        System.out.println("기본 생성자를 통해 객체가 생성되었습니다.");
        System.out.println("NoArgsConstructor");
    }

    public Constructor(int num){
        System.out.println("int 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");

        this.num = num;
        // argument로 받은 int 자료형의 데이터를 해당 클래스의 필드에 있는
        // num에 대입하겠다는 의미이다.
        // this는 해당 클래스에서 객체를 만들게 되면, 객체 이름으로 대체되는 임시의 이름이다.
    }

    public Constructor(String name){
        System.out.println("String 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");

        this.name = name;
    }

    public Constructor(int num, String name) {
        System.out.println("int, String 매개변수 모두를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("AllArgsConstructor");

        this.num = num;
        this.name = name;
    }

    public Constructor(String name, int num) {
        System.out.println("int, String 매개변수 모두를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("AllArgsConstructor");

        this.num = num;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("이 객체의 num 값 : " + num);
        System.out.println("이 객체의 name 값 : " + name);
    }
}
