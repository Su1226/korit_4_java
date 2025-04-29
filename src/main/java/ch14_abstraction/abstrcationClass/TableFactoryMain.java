package ch14_abstraction.abstrcationClass;

public class TableFactoryMain {
    public static void main(String[] args) {

        TableFactory tableFactory = new TableFactory();
        tableFactory.setName("애플 테블릿 공장");
        tableFactory.produce("아이패드 미니 6세대");
        tableFactory.manage();
        tableFactory.upgrade("아이패드 미니 7세대");
    }
}
