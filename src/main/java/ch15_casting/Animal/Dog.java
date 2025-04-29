package ch15_casting.Animal;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("강아지가 짖습니다.");
    }

    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }
}
