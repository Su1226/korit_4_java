package ch20_collection;

/*
    List는 순서가 있고 중복을 허용하는 반면,
    Set은 순서도 없고 중복도 허용하지 않는다.
    (수학에서의 집합 개념을 Collection으로 구현한 것이 Set에 해당한다.)

    그래서 특성의 차이로 인해, List -> Set / Set -> List로의 형 변환이 중요하다.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여 후보군만 남기는 등의 응용이 가능하기 때문에
    혹은 Set을 List로 바꿔 .get(인덱스번호)를 통해 조회를 하기 위해
    서로 간의 형변환이 중요하다.
 */

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet1 = new HashSet<String>(); // HashSet은 Set을 Interface한다.
        List<String> strList1 = new ArrayList<String>();

        // Set에 element 삽입
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");
        strSet1.add("2");
        strSet1.add("2");
        strSet1.add("3");

        // Set의 출력
        System.out.println(strSet1);

        for(String s : strSet1) {
            System.out.println(s);
        }

//        for(int i = 0; i < strSet1.size(); i++) {
//            System.out.println(strSet1.get(i));
//        } // 순서가 없기 때문에 .get(인덱스)를 사용할 수 없다.

        System.out.println();

        // 특정 Element를 추출 -> List로의 형변환
        strList1.addAll(strSet1);
        // 앞서 만든 strList1에 strSet1의 모든 요소들을 넣는다는 의미.

        for(int i = 0; i < strList1.size(); i++) {
            System.out.println(strList1.get(i));
        }

        strList1.addAll(strSet1);
        strList1.addAll(strSet1);
        System.out.println("중복으로 더하고 난 후 ");
        for(int i = 0; i < strList1.size(); i++) {
            System.out.print(strList1.get(i) + " ");
        }

        // Set은 순서가 없어 .sort가 의미엇ㅂ지만, List는 의미가 있다.
        Collections.sort(strList1);
        System.out.println();
        System.out.println(strList1);

        // 역순 정렬
        Collections.sort(strList1, Collections.reverseOrder());
        System.out.println(strList1);


        // 새로운 Set을 선언해서 다시 strList1에 있는 부분을 다 더해버리면?
        // 중복이 제거된다.
        Set<String> strSet2 = new HashSet<String>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);
    }
}
