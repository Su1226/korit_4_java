package ch07_loops;

/*
        *
       **
      ***
     ****
    *****
    위의 별 찍기를 작성하기 위해서 고려해야 할 사항은 이전까지와 조금 달라진다.
    1. 개행 관련
    2. 별찍기 관련
    3. 공백 관련
    -> 공백도 생각하여 작성해야 하기 때문에 잘 생각해야 함.
 */

public class LoopEx08 {
    public static void main(String[] args) {
        // 1번 풀이 -> j-- 적용
        // 개행 관련 1차 포문
        for(int i = 0; i < 6; i++) {
            {
                // 공백 관련 2차 for문
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                // 별찍기 관련 2차  for문
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                // 개행
                System.out.println();
            }
        }

        // 2번 풀이 -> j++ 사용
        for (int i = 0; i < 6; i++) {
            for(int j = 0; j < 6 - i ; j++) {
                System.out.print(" ");
            }
            for (int k=0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // # 1 풀이 -> j-- 적용
        // 개행 관련 1차 for문
        for( int i = 0 ; i < 6 ; i++ ) {
            // 공백 관련 2차a for문
            for( int j = 5 ; j > i ; j-- ) {
                System.out.print("  ");
            }
            // 별 찍기 관련 2차b for문
            for (int k = 0 ; k < i ; k++ ) {
                System.out.print("🐱‍👤");
            }
            // 개행 명령어
            System.out.println();
        }


        // # 2 풀이 -> j++ 적용 -> Loop06 참조
        for ( int i = 0 ; i < 6 ; i ++ ) {
            // 공백 j ++
            for ( int j = 0 ; j < 6 - i ; j++ ) {
                System.out.print(" ");
            }
            // 별찍기
            for ( int k = 0 ; k < i ; k++ ) {
                System.out.print("✔");
            }
            // 개행
            System.out.println();
        }


    }
}
