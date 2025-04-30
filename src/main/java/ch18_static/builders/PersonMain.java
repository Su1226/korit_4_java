package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .name("김일")
                .age(21)
                .adrress("서울특별시 종로구")
                .build();
        Person person2 = new Person.Builder().age(22).name("김이").build();   // 순서를 바꾸거나, 생략하더라도 코드를 추가할 필요 x
        Person person3 = new Person.Builder().build();
    }
}
