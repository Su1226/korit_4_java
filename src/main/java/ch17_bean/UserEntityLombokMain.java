package ch17_bean;

public class UserEntityLombokMain {
    public static void main(String[] args) {
        UserEntityLombok lombok = new UserEntityLombok();

        lombok.setUsername(1);
        lombok.setPassword(9874);
        lombok.setEmail("b@test.com");
        lombok.setName("김이");

        System.out.println(lombok);

    }
}
