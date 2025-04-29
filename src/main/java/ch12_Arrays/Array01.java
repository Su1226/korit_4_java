package ch12_Arrays;

public class Array01 {
    public static void main(String[] args) {

        // 배열의 선언 및 초기화
        // 1. 자료형[] 배열 명 = {값1, 값2, 값3, 값4};
        // 2. 자료형[] 배열 명 = new Int[] {값1, 값2, 값3, 값4};
        // 값을 element(요소)라고 한다.
        int[] arrInt = {1, 2, 3, 4, 5};

        //배열을 선언 후, 나중에 값을 대입.
        // 자료형[] 배열 명 = new 자료형[길이];
        // 배열명[인덱스] = 값;
        String[] strArr = new String[4];
        strArr[0] = "일";
        strArr[1] = "이";
        strArr[2] = "삼";
        strArr[3] = "사";

        System.out.println(arrInt);
        System.out.println(strArr);

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);

        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println();

        // 역순으로 출력하기
        for(int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
        }

        // arrInt에 각 값에 2씩 더하고 싶으면?
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] += 2;
            System.out.println(arrInt[i]);
        }

        

        System.out.println();
        System.out.println(arrInt.length);
        System.out.println(strArr.length);

    }
}
