package ch14_abstraction.abstrcationClass;

public class PhoneFactory extends Factoty{

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ]");
    }

    @Override
    public void manage() {
        System.out.println("공장이 작동 됩니다.");
    }
}
