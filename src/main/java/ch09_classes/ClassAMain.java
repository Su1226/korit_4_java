package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        // 위와 같이 볼 수 있듯
        // Scanner 클래스를 import한다고 했으나,
        // Scanner 클래스의 인스턴스를 생성하고 있었다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체의 속성 접근 방법
        // 객체명.속성명
        classA1.num = 100;
        classA1.name = "김일";

        ClassA classA2 = new ClassA();
        classA2.num = 200;
        classA2.name = "김이";

        System.out.println(classA2.name + "의 번호는 " + classA2.num + "입니다.");

        classA1.callName();
        classA2.callName();

        /*
            Scanner의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3을 생성한 다음
            다음과 같이 실행될 수 있도록 작성하시오.

            이름을 입력하세요 >>> 김삼
            번호를 입력하세요 >>> 20250003
            점수를 입력하세요 >>> 4.5

            그리고 displayProfile()을 ClassA에 정의한 후
            classA3.displayProfile();을 호출했을 때

            [ 실행 결과 ]
            20250003 학번의 이름은 김삼이고, 4.5입니다.
         */

        Scanner sc = new Scanner(System.in);
        ClassA classA3 = new ClassA();

        System.out.print("이름을 입력하세요 >>> ");
        classA3.name = sc.next();
        System.out.print("번호를 입력하세요 >>> ");
        classA3.num = sc.nextInt();
        System.out.print("점수를 입력하세요. >>> ");
        classA3.score = sc.nextDouble();

        classA3.displayProfile();
    }
}
