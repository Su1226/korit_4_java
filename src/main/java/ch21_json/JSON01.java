package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON01 {
    public static void main(String[] args) {
        // JsonObject 클래스 인스턴스 생성
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", 1);
        jsonObject.addProperty("password", 1234);
        jsonObject.addProperty("email", "a@test.com");
        jsonObject.addProperty("name", "김일");

        // 출력
        System.out.println(jsonObject);

        /*
            {"username":1,"password":1234,"email":"a@test.com","name":"김일"}
            위의 콘솔창에서의 결과값을 Java의 Map과 비교했을 때,

            1. Map에는 Key부분에 ""가 업고,
               Json에서는 모든 Key가 String처럼 보이도록 되어 있다.

            2. Map에서는 key1=value1의 형태로 작성되었지만,
               JSON에서는 "key1"=value1의 형태로 작성되었다.
         */

        jsonObject.addProperty("Job", "코리아아이티아카데미국비강사");
        System.out.println(jsonObject);

        /*
            위를 추가하여 보면 계속해서 한 줄로 길게 늘어지게 된다.
            addProperty()를 통해 키-값 쌍을 계속 늘릴수록 길어져서 가독성을 해칠 수 있다.
            이때, key:value마다 개행이 나누어지게 하기 위해 사용하는 것이 GSON이다.
         */

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

        /*
            {
              "username": 1,
              "password": 1234,
              "email": "a@test.com",
              "name": "김일",
              "Job": "코리아아이티아카데미국비강사"
            }
            다음과 같이 toJson()으로 Json 형태로 만들 수 있다.
         */


    }
}
