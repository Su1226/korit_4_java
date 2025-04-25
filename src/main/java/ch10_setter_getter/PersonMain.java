package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일이삼사오육");
        person1.setName("김일");
        person1.setAge(243);
        person1.setAge(21);

        Person person2 = new Person("이이", 32);
        // 이름을 바꾸는 2가지 방법
        // 1
        //person2.name = "강이"; // Person.java에서 멤버 변수를 private를 적용하면 오류 발생
        // 2
        person2.setName("최이");

        //System.out.println(person2.name); // Person.java에서 멤버 변수를 private를 적용하면 오류 발생
        System.out.println(person2.getName());

        // call1() / call2() 유형의 경우, return이 없는 대신에
        // 콘솔창에 출력하기 위해서는 sout()을 구현할 필요가 있다.
        // 예를 들어, person.getName();을 sout()으로 구현하여 바꾸었다면,
        // main 단게에서 메소드 호출을 하기만 하면 콘솔창에 결과가 된다는 장점이 있지만
        // '데이터의 가공'이 어렵기 때문이다. -> getter을 쓰는 이유는 데이터 가공을 위해서이며, 그렇기 때문에 return이 필요하다.
    }
}
