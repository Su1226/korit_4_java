package ch08_method;

import java.util.Scanner;

public class Method02 {

    public static void introduce() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요. >>> ");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요. >>> ");
        String address = scanner.nextLine();

        System.out.println("제 이름은 " + name + "입니다. \n" +
                        address + "에 살고 있습니다.");

    }

    public static void main(String[] args) {
        introduce();
    }
}
