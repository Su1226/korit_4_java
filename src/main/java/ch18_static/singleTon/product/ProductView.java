package ch18_static.singleTon.product;

public class ProductView {
    // 정적 변수 선언 - > 자료형이 ProductView 변수명이 instace
    // 보통 싱글통 생성할 때 정적 변수 이름이 instance이다. (시험 시 힌트 중 하나가 된다.)
    private static ProductView instace;


    // 일반적인 생성자 작성 방식과의 차이점이 여기서부터 발생한다.
    private ProductView() {
        int counter = 1; // 생성자 내에서만 사용 가능한 일종의 지역 변수
        System.out.println(counter + "번 째 객체가 생성되었습니다.");
        counter++;
    }

    // 정적 메소드의 정의 -> 싱글톤에서 대부분의 경우, 메소드 명은 getInstance()이다. (시험 시 힌트 중 하나)
    public static ProductView getInstance() {
        if(instace == null) {
            instace = new ProductView();
        }
        return  instace;
    } // ProductView 객체는 딱 한 번만 생성된다.

}
