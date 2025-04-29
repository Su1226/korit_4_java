package ch14_abstraction.abstrcationClass;

public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.setName("Apple Smart Factory"); // 부모 메소드 사용
        phoneFactory.produce("iPhone17"); // 재정의 된 메소드 #1 - 추상 메소드
        phoneFactory.manage();                  // 재정의 된 메소드 #2 - 추상 메소드
        phoneFactory.displayInfo();             // 부모 메소드 사용

        System.out.println();

        Factoty factoty = new Factoty() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ] 을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 실행합니다. ");
            }
        } ; // 추상 메소드를 main 단계에서 구현했다. 그리고 객체를 생성을 안한 상태라고 할 수 있다.
        // 그렇다면 일반적인 클래스를 기준으로 봤을 때, 메소드를 정의한 부분까지 작성했다고 볼 수 있다.
        // 객체 생성이기 때문에 마지막에 ' ; '을 꼭 작성해줘야 한다.

        factoty.setName("가전 제품 공장");        // 메소드 호출에 해당.
        factoty.produce("백색 가전 ");     // 메소드 호출에 해당.

        /*
            위의 개념은 추상 클래스의 개념에서 벗어난다.
            (객체 생성이 불가능하다고 했는데, Factory 클래스의 객체가 생성되었다는 부분에서.)

            java17 or 11에서 도입된 익명 클래스 개념인데,
            재사용하지 않고 한 번만 쓰고 치울 것이라면, 즉 이 Main 클래스에서만 사용하고 다른 클래스에서는
            허
            용하지 않을 것이라면, 사용하기에는 편리하다.
         */

        System.out.println();

        PhoneFactory phoneFactory2 = new PhoneFactory();
        phoneFactory2.setName("Samsung smart Phone Factory");
        phoneFactory2.produce("Galaxy S 26");
    }
}
