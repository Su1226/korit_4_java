package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(31);
        constructor2.name = "홍길동";
        Constructor constructor3 = new Constructor("김일");
        constructor3.num = 20;
        Constructor constructor4 = new Constructor(25, "이수원");
        Constructor constructor5 = new Constructor("김오", 25);

        constructor1.displayInfo();
        constructor2.displayInfo();
        constructor3.displayInfo();
        constructor4.displayInfo();
        constructor5.displayInfo();
    }
}
