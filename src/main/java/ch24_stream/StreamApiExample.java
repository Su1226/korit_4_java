package ch24_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "최칠");

        // filter()
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        
        // filter는 그 자체로 사용하기 보다는 합쳐서 사용하는 경우가 많다.

        List<String> englishNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy", "family");
        List<String> result = englishNames.stream()
                            .filter(name -> name.startsWith("a")) // 'a'로 시작하는 element만 추출
                            .map(String::toUpperCase)                   // 그런 다음 대문자로 변환
                            .sorted()                                   // 정렬
                            .toList();                                  // List로 자료 변형

        System.out.println(names);
        System.out.println(namesWithKim);

        System.out.println();

        System.out.println(englishNames);
        System.out.println(result);

        // count()
        int count = englishNames.size();        // element의 전체 개수를 세는 것만 가능.
        System.out.println(count);

        long count2 = englishNames.stream()     // 각 element의 길이가 3이 넘는지를 확인한다.
                                .filter(name -> name.length() > 3)
                                .count();
        System.out.println(count2);

        System.out.println();

        // 기존의 방식대로 한다면, for문을 사용할지 향상된 for문을 사용할지에 대해서 고민해야 한다.
        // 1) 일반 for문
        int count3 = 0;
        for(int i = 0 ; i < englishNames.size(); i++) {
            if (englishNames.get(i).length() > 3) {
                count3++;
            }
        }
        System.out.println(count3);

        // 2) 향상된 for 문
        int count4 = 0;
        for(String s : englishNames) {
            if(s.length() > 3) {
                count4++;
            }
        }
        System.out.println(count4);

    }
}
