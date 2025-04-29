package ch14_abstraction.abstrcationClass;

public class TableFactory extends Factoty{
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ]");
    }

    @Override
    public void manage() {
        System.out.println(this.getName() + "공장이 작동 됩니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
    /*
        지시사항
        1. Factory Class를 상속 받을 것
        2. 오류 처리
        3. TableFactory의 고유 method인 upgrade(String model)을 call2() 형식으로 정의.
            객체명.upgrade("아이패드 프로 13인치 8세대");로 호출하면,
            아이패드 프로 13인치 8세대로 업그레이드 합니다. 라고 콘솔창에 출력.
        4. produce() / manage() 메소드를 태블릿 공장에 맞게 수정할 것.
        5. main으로 이동해서
            tableFactory 객체를 생성하고, 애플 태블릿 공장으로 이름 붙일 것
        6. produce()를 호출하라.
        7. manage() 호출하시오.
        8. upgrade("아이패드 미니 7세대"); 를 호출하라.
     */
}
