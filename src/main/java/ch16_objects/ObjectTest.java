package ch16_objects;

public class ObjectTest {

    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자 생성");
    }

    public ObjectTest(String name) {
        System.out.println("name 매개변수 기본 생성자 생성");
        this.name = name;
    }

    public ObjectTest(String name, String address) {
        System.out.println("name, address 매개변수 기본 생성자 생성");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

//    @Override
//    public String toString() {
//        return "이름 : " + name + "\n 주소 : " + address;


    @Override
    public String toString() { // 객체 내에서 맏느는 갓.

        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

