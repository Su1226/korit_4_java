package ch05_conversion;
// 자료형 변환

public class Main {
    public static void main(String[] args) {
        // 1. Up-Casting(업캐스팅, 묵시적 변환) : 더 큰 용량의 자료형으로 변환시키는 것.
        // 방법 1 : '(바꿀데이터타입)변수명'으로 작성한다.
        char cast1 = 'A';
        char cast2 = 'a';
        // 'A'는 유니코드로 65이다.
        // 'a'는 유니코드는 97이다.
        // 위 두개 정도는 외워둘 것.

        System.out.println("원형 : " + cast1);
        System.out.println("변형 : " + (int)cast1);

        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);

        // 방법 2 : 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법.
        char cast3 = 'b';
        int cast3Number = cast3;

        System.out.println("변환 된 변수 : " + cast3Number);

        // 2. Down-Casting(다운캐스팅, 명시적 변환)
        int cast4 = 99;         // 방법 1 사용
        int cast5 = 100;        // 방법 2 사용

        char cast5Char = (char)cast5;

        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);

        System.out.println("변환 된 변수 : " + cast5Char);

        /*
            UpCasting의 경우, 메모리 용량이 커지기만 하면 되기 때문에,
            기존의 데이터가 변형이 일어나지 않아 암시적/묵시적(imlicit)으로 변형이 가능하지만,
            DownCasting의 경우, 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는 경우가 있다.
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는 명시적(explicit)으로만 변형이 가능하다.

            추후, 참조 자료형 캐스팅이라는 개념과 연결이 되므로 꼭 기억해둘 것.
         */

    }
}
