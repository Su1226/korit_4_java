package ch07_loops;

/*
    while문

    while(조건식) {
        반복 실행문
    }

    while 뒤에 나오는 (조건식)을 봤을 때, if(조건식) 형태와 유사하다.
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이 '반복적으로' 실행되어야 한다.

    따라서 while을 사용할 때, 주의사항이 있는데
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 지정해둘 필요가 있다.

    false가 되는 시점을 지정해주지 않는다면, 무한 반복이 되기 때문에
    무한 루프(infinite loops)라는 표현을 쓰며, 무한 루프에 빠지지 않도록 조심해야 한다.
 */

public class Loop01 {
    public static void main(String[] args) {

//        int i = 0;
//
//        while(i < 100){
//            System.out.println(++i);
//        }

        // while 문도 중첩이 가능하다.
        /*
            while(조건식1) {
                실행문a1
                while(조건식2) {
                    실행문b
                }
                실행문a2
            }
         */

        // while과 if를 섞어서 사용할 수도 있다.

        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int k = 1;
        // 예를 들어, 1부터 100까지 더하도록 한다.

        while(k < 101) {
            if(k % 2 == 0) {
                sum1 += k;
            }
            k++;
        }
        System.out.println(sum1);

        while(i < 101) {
            sum2 += i;
            i += 2;
        }

        System.out.println(sum2);

        // 응용 : 1부터 100까지 중 짝수 합만 구하는 while 반복문을 작성하시오.
        // 나머지 연산자 및 if 문을 썼다면, 다른 방법이 없는지도 고민해보자.
    }

}
