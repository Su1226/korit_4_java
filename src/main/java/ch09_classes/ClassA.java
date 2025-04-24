package ch09_classes;

public class ClassA {

    int num;
    double score;
    String name;

    public void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

    public void displayProfile() {
        System.out.println(num + " 학번의 학생의 이름은 " + name + " 이고, " + score + " 점 입니다.");
    }
}
