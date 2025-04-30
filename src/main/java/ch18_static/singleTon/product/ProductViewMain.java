package ch18_static.singleTon.product;

public class ProductViewMain {
    public static void main(String[] args) {
//        private 접근 지정자로 생성자를 생성하면 오류가 뜬다.
//        ProductView productView = new ProductView();
//        productView.count; // 접근 불가


        // 생성자는 private로 처리 했기 때문에, getInstance() 메소드로
        // main에서 ProductView 객체를 생성할 수 있다.
        // 그러나 한 번 밖에 생성이 안된다.
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();

        /*
            위 코드를 통해, 복수의 객체를 생성한 것 같지만,
            실제로 ProductView.getInstance();의 결과값은 동일한 instacne이다.

            그렇다면, 실제생성된 객체의 수는 '1개'이며,
            그 한 개에 다른 객체 이름을 대입했을 뿐이다.

            콘솔창에
            1번 째 객체가 생성되었습니다.
            1번 째 객체가 생성되었습니다.
            1번 째 객체가 생성되었습니다.
            1번 째 객체가 생성되었습니다.

            가 아닌
            1번 째 객체가 생성되었습니다.
            로 출력 된 것으로 증명할 수 있다.
         */


    }
}
