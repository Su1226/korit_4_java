package ch20_collection;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map에 Key-Vaule 쌍을 삽입. => .put(키, 값);
        strMap1.put("kor20250001", "김일");
        strMap1.put("kor20250002", "김이");
        strMap1.put("kor20250003", "김삼");
        strMap1.put("kor20250004", "김사");
        strMap1.put("kor20250005", "김오");

        // Map 출력
        System.out.println(strMap1);

        strMap1.put("kor20250005", "KimFive");
        System.out.println(strMap1);
        // Map의 특징 중 하나로, 하나의 Key는 하나의 value만 가능하다.
        // key값이 동일하다면, value값은 가장 최신에 넣은 것으로 덮어쓰기 된다.

        // List의 경우, 특정 인덱스를 조회하고 싶다면,
        // 리스트명.get(인덱스);의 형태로 확인 할 수 있었지만,
        // Map의 경우는 순서가 없는 대신 key가 있기 때문에
        // 아래와 같은 방법으로 출력을 할 수 있다.

        // 특정 key의 value 조희
        System.out.println(strMap1.get("kor20250002"));

        // Java : Map에서의 key-value pair를 entry라고 칭한다.

        // 특정 키의 값 수정 1 : .put(키)를 통해 덮어쓰기
        strMap1.put("kor20250001", "KimOne");
        System.out.println(strMap1.get("kor20250001"));

        // 특정 키의 값 수정 2 : .replace()
        strMap1.replace("kor20250002", "KimTwo");
        System.out.println(strMap1.get("kor20250002"));

        // 특정 키의 존재 여부 : containsKey() -> boolean
        boolean searchKeyFlay1 = strMap1.containsKey("kor20250006");
        System.out.println("kor20250006 존재 여부 : " + searchKeyFlay1);

        // 특정 값의 존재 여부 : containsValue() -> boolean
        boolean searchVaule1 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + searchVaule1);

        // Map의 엔트리로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();     // 비어있는 Set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();  // Map의 element를 Set에 삽입
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet2.size());       // 5가 출력된다는 점에서, 'key=value값'이 하나의 element로 잡힌다는 것을 알 수 있다.

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();       // 가능함.
        // List<Map<String, String>> entryList2 = strMap1.entrySet();   // 불가능함. (Map->List 대입이 불가능하다.)

        // Map -> List로 형변환을 하고 싶다면, Set을 경유해야 한다.
        entryList1.addAll(entrySet2);
        System.out.println(entryList1);

        // 위 62번 Line을 거치면, sort가 가능하다.


        // Key만 추출하기
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // value만 추출하기
        // Set<String> valueSet = strMap1.values(); -> 오류 : 필요한 타입은 Set이지만, 제공된 타입은 Collection이기 때문.
        // 위와 같은 문제가 발생하는 이유는, key가 중복을 허용하지 않기 때문에 Set으로 형변환이 가능한 반면,
        // 복수의 key에서 동일한 value가 존재할 수 있기 때문에, Set으로 생성하는 것이 불가능하다.
        Collection<String> values = strMap1.values();
        System.out.println(values);


    }
}
