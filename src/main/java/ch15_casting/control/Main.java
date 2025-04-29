package ch15_casting.control;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        LED led = new LED();
        Mouse mouse = new Mouse();
        CentralControl control1 = new CentralControl(new Power[5]);
//        CentralControl control2 = new CentralControl(new Power[] {computer, led, mouse});
        // 빈 배열을 집어 넣는 것만 가능한 것이 아니라,
        // 미리 배열을 생성해놓고 (위 예시로 하면 암시적 업캐스팅이 일어남.)
        // 그 배열을 control2 생성 시에 집어넣는 방법이 가능하다.
        // 다만 위의 경우, 구글 홈 미니를 만들어 놨으나 그곳에 default로
        // Computer, LED, Mouse가 한 대씩 등록되어 있다고 봐야하기 때문에
        // control1을 기준으로 수업한다.

        control1.addDevice(computer); // 배열 0번에 저장
        control1.addDevice(led);
        control1.addDevice(mouse);

        System.out.println();

        control1.powerOn();
        System.out.println();
        control1.powerOff();


    }
}
