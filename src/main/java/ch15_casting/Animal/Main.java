package ch15_casting.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();

        // 업캐스팅
        Animal animal = new Dog(); // 방법 1 ) A a = new B();
        animal.makeSound();
        // 결과값
        // 동물이 소리를 냅니다.
        // 강아지가 짖습니다.
        // Animal animal2 = new Animal();에서
        // animal2.makeSound();의 결과값과 차이점을 명확하게 알아야 한다.

        Animal animal2 = dog; // 방법 2 ) 다른 객체를 대입한다.
        animal2.makeSound();

        // instanceof 연산자
        boolean result1 = animal instanceof Animal;
        System.out.println(result1); // true

        boolean result2 = animal instanceof Dog;
        System.out.println(result2); // true
        // instanceof의 결과값이 true일 때는
        // 확인하고자 하는 Object가 해당 클래스의 인스턴스이거나 '하위 클래스'의 인스턴스일 때.

        boolean result3 = dog instanceof Dog;
        System.out.println(result3); // true

        boolean result4 = dog instanceof Animal;
        System.out.println(result4); // true

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5); // true

        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6); // false

        // 다운 캐스팅
        Dog dog2 = (Dog) animal2;
        dog2.makeSound();
        dog2.fetch();
        animal2.makeSound();
        ((Dog) animal2).fetch();

        /*

        Dog dog3 = (Dog) animal3;
        dog3.makeSound();
        dog3.fetch();

            위 방법은 오류가 난다.
            이유는 애초에 animal3을 생성할 때, new Animal();로 생성했기 때문에 다운 캐스팅이 불가능하다.
            즉, 다운 캐스팅의 전제 조건은
            A a = new B();에서 출발한다는 점을 확인할 수 있다.

            따라서 지금 경우의 수가 animal**이라는 객체가 있을 때, 해당 객체가 Animal() 생성자로 생성 됐는지
            Dog() 생성자로 생성되었는지에 따라 프로그램에 오류가 날 수 있고 안 날 수도 있다는 양자역학적 상황이다.
         */

        Animal animal4 = new Dog();
        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }

        System.out.println("animal3 검증 파트");
        if(animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운 캐스팅 입니다.");
        }


    }
}
