package ch19_generic;


import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date data = new Date();

        ResponseData<String> responseData = new ResponseData<String>("날짜 저장 성공", data.toString());
        ResponseData<Integer> responseData2 = new ResponseData<Integer>("나이 저장 성공", 37);
        ResponseData<Date> responseData3 = new ResponseData<Date>("날씨 객체 저장 성공", data);

        System.out.println(responseData);
        System.out.println(responseData2);
        System.out.println(responseData3);

    }
}
