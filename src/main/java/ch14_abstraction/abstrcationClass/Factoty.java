package ch14_abstraction.abstrcationClass;

public abstract class Factoty {

    private String name;

    public abstract void produce(String model);
    public abstract void manage();
    // 팝업을 확인하면 메소드 본문이라는 부분이 흔히 이야기하는 구현부에 해당한다.

    /*
        abstract가 메소드의 접근 지정자와 리턴 타입 사이에 명시되면,
        클래스도 동일하게 abstract가 있어야 한다.

        추상 클래스의 정의가 '추상 메소드가 하나라도 있으면 추상 클래스가 되기' 때문이다.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
        추상 클래스 내부에 일반 메소드가 있을 수 있다.

        그렇다면 객체를 만들지 못하지만 왜 getter와 setter를 쓸 수 있는 것인가?
        그것은 추상 클래스는 '상속'을 전재로 사용하기 때문이다.
     */

    public void displayInfo() {
        System.out.println("공장 이름 : " + name);
    }
}
