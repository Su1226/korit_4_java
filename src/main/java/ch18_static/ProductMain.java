package ch18_static;

import ch08_method.Method01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
//        Method01.call1();
//        System.out.println(Arrays.toString());

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product1 = new Product();
        System.out.println("count : " + Product.getCount()); // 정적 메소드 실행
        System.out.println("instanceCount : " + product1.getInstanceCount()); // 일반 메소드 실행

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product2 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product2.getInstanceCount());

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product3 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product3.getInstanceCount());

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product4 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product4.getInstanceCount());

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product5 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product5.getInstanceCount());

        System.out.println(Product.getCount()); // 클래스명.메소드명()을 통한 getter
        Product product6 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product6.getInstanceCount());

        // 결과적으로 인스턴스 변수는 객체에 종속되어 있기 때문에 객체 생성 시에 0에서 1로 증가되는 것 밖에
        // 결과가 나오지 않지만, 정적 변수인 count의 경우는 객체가 생성될 때마다 count++;이 적용되어
        // 객체의 수 만큼 값이 증가 됨을 알 수 있다.

        // 즉, 인스턴스 변수 -> 객체에 종속 / 정적 변수 -> 클레스에 종속이라고 정리한다.
    }
}
