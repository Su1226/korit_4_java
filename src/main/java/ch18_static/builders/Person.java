package ch18_static.builders;

public class Person {

    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;


        // 아래의 코드에서 부터 집중할 것.
        // method는 대부분 행위를 나타내기 떄문에 동사로 작성하지만
        // Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드명을 쓴다.
        // 예를 들어, builder.name("안근수"); / builder.age(38);과 같은 방식이 된다.

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder adrress(String address) {
            this.address = address;
            return this;
        }

        // 객체를 생성햐는 코드를 작성한다.
        public Person build() {
            return new Person(this);
        }
    }
}
