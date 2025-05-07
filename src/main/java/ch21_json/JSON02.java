package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;

    public User(String username, String password, String email, String name, String age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.age = age;
    }
}

public class JSON02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // Gson을 통해 prettyPrinting이 적용될 수 있도록 인스턴스를 생성

        // 사용할 변수 선언
        String userJson = null;

        // 1. Java Object에서 Json으로 변환
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        userJson = gson.toJson(user1);
        System.out.println("GSON 사용 결과값 : " + userJson);
        System.out.println();
        userJson = gsonBuilder.toJson(user1);
        System.out.println("GSONBuilder 사용 결과값 : " + userJson);


        // 2. JsonObject -> Json으로 변환
        /*
            JsonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하라.
            그리고 studentJson을 gson과 gsonBuilder로 출력하라
         */

        JsonObject studentInfo = new JsonObject();
        studentInfo.addProperty("studentCode", "20250001");
        studentInfo.addProperty("studentName", "김일");
        studentInfo.addProperty("studentYear", "2");
        studentInfo.addProperty("score","96.7");

        String studentJson = gson.toJson(studentInfo);
        System.out.println(studentJson);

        studentJson = gsonBuilder.toJson(studentInfo);
        System.out.println(studentJson);


        // 3. Map -> Json으로 변환
        /*
            Map을 활용하여 Jey String / value String으로 선언하고, 객체명을 map1으로 한 빈 map을 생성하라.

            map에 productCode NT960XHA-KD72G
            prodyctName 삼성 갤럭시북 프로 5

            Entity를 입력하라.

            gson 및 gsonBuilder를 활용하여 json 데이로 변환한다.
         */

        Map<String, String> map1 = new HashMap<>();

        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("prodyctName", "삼성 갤럭시북 프로 5");

        String productInfo = gson.toJson(map1);
        System.out.println("GSON을 활용한 결과 : " + productInfo);
        productInfo = gsonBuilder.toJson(map1);
        System.out.println("GSONBuilder을 활용한 결과 : " + productInfo);
        // java의 데이터들이 전부 String으로 담겨 있음을 유의해서 볼 것.

        // Json을 Map 또는 Java의 object로 바꾸려면?
        // 즉, json 데이터를 user 객체를 다시 바꾸는 것과
        // json 데이터를 map2 형태로 작성하는 것을 의미한다.
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);

        // 4. Json -> Map 변환하기
        Map<String, String> map2 = gson.fromJson(productInfo, Map.class);
        System.out.println(map2);

        // 5. Json -> User 클래스의 인스턴스로 바꾸는 방법
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject : 해당 의미하는 바는 json 데이터 =/= JsonObject이다.
        // studentJson의 자료형은 String이고 JsonObject1의 자료형은 JsonObject이기 때문이다.

        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);

    }
}
