package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    // 생성자 생성
    public Person() {
        System.out.println("기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // getter 및 setter 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 5 || name.length() < 0){
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println("이름이 입력되었습니다. 현재 이름은 : " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /*
        String변수명.length()하면 문자열의 길이가 int로 반환된다.
        예)
        String str = "Hello";
        str.length();           // 결과값 : 5
     */

    public void setAge(int age) {
        if(age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다. 현재 나이 : " + this.age);
            return;
        }

        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + this.age);

    }
    /*
        setAge()를 자동한 것을 기본으로 두고 재정의를 해보자.
        나이가 0 미만이거나 200 초과인 age가 매개변수로 들어오게 된다면,
        객체의 속성에 들어갈 수 없도록 코드를 작성해보자.

        PersonMain에서 person1 객체를 '기본생성자'로 생성하고
        person1.setName("김일");
        person1.setAge(243);
        person1.setAge(21);
        과 같이 입력했을 때, 콘솔창은 다음과 같아야 한다.

        실행 예)
        기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
        이름이 입력되었습니다. : 김일
        불가능한 나이 입력입니다. 현재 나이 : 0
        나이가 입력되었습니다 : 21
     */

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
