package ch15_casting.control;
// LED, Mouse 클래스를 생성하고
// 적절하게 메소드의 구현부를 완성하시오.
public class CentralControl {

    private Power[] deviceArr;

    // 매개변수 생성자를 작성하라.
    public CentralControl(Power[] deviceArr) {
        this.deviceArr = deviceArr;
    }

    // Main에서 확인결과 곧장 element가 있는 배열은 집어 넣지 못한다.
    // Power의 자식 클래스의 인스턴스들을 집어넣는 메소드를 정의할 예정.

    public void addDevice(Power device) {
        // Computer, LED, Mouse에 해당하는 객체들을 신경쓰지 않고 넣기 위해
        // 암시적으로 업캐스팅이 되기 때문에 Power를 인자로 받는다.

        int emptyIndex = checkEmpty();

        if(emptyIndex == -1) { // 배열이 다찼음을 의미함.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }

        deviceArr[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            객체명.getClass() : 패키지명을 포함한 클래스명이 반환되며, 뒤에 주소지가 날라간다.
            객체명.getClass().getSimpleName() : 패키지명도 날라가고 클래스명만 반환된다.

            객체명.getClass().getSimpleName()를 메소드 체이닝이라는 표현으로 자주 사용된다.
         */
    }

    private int checkEmpty() {
        // 비어있는 배열의 index number를 반환하기 위한 메소드
        // 배열을 반복문을 돌려, null 값으로 빠져나오는 인덱스를 return한다.

        for(int i = 0; i < deviceArr.length; i++) {
            if(deviceArr[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public void powerOn() {
        // deviceArr 배열 내에 있는 각 element들은 Power의 서브 클래스의 인스턴스에 해당
        // 그러면 .on()과 .off()를 모두 가지고 있을 것이며.
        // instanceof를 사용할 필요가 없다.

        for(Power device : deviceArr) {
            if(device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue; // 메소드를 종료하는게 아니라 다음 반복으로 넘어가는 키워드.
            }
            device.on();
        }
    }

    public void powerOff() {
        for(int i = 0; i < deviceArr.length; i++) {
            if(deviceArr[i] == null) {
                System.out.println(i + "번째 장치가 등록되지 않았습니다.");
                continue;
            }
            deviceArr[i].off();
        }
    }

    public void performSpecificMethod() {
        for (Power device : deviceArr) {
            if(device instanceof TV) {
                TV tv = (TV) device;
                tv.channelUP();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof SmartPhtone) {
                SmartPhtone smartPhtone = (SmartPhtone) device;
                smartPhtone.touchScreen();
            } else if(device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            }
        }
    }
}
