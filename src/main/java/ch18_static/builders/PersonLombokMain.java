package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok lombok = PersonLombok.builder()
                            .name("김일")
                            .age(21)
                            .address("서울특별시 종로구")
                            .build();

        System.out.println(lombok);
    }
}
