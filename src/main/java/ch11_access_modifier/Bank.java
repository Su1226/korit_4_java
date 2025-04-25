package ch11_access_modifier;

/*
    1. Bank Class에
        1) 필드
            accountNum(계좌번호, 정수)
            accountHolder(예금주 이름, 문자열)
            balance(잔액, 정수)
            pinNumber(비밀번호, 4자리 정수, 0 ~ 9999)
            전부 private 적용
        2) 생성자
            기본생성자
            계좌번호만 받는 생성자
            계좌번호, 예금주만 받는 생성자
            계좌번호, 예금주, 초기 잔액을 받는 생성자
            계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자
        3) 메소드
            setter / getter
            특히, Setter의 경우에는 유효성 검증 로직을 작성해야한다.
                - 잔액은 음수가 될 수 없음.
                - 비밀번호는 0이상 9999이하까지만 가능함 -> 실패하면 "불가능한 비밀번호입니다."
            deposit(int acount, int inputPin) : 입금 관련 메소드 call2() 유형
                - 올바른 비밀번호인지 확인할 것 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메소드 종료
                - 유효한 금액인지 검증(account가 0초과여야 한다.) -> 실패하면 "불가능한 금액입니다." 하고 메소드 종료
                - 성공한다면
                    콘솔창에
                    입금 성공! 현재 잔액 : ****원

            withdraw(int aamount, int inputPin) : 출금 관련 메소드 call2() 유형
                - 올바른 비밀번호인지 확인할 것 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메소드 종료
                - 유효한 금액인지 검증(account가 0초과여야 한다.) -> 실패하면 "불가능한 금액입니다." 하고 메소드 종료
                - 출금 후의 잔액이 0원 '이상'인지 확인 -> 음수라면 "잔액 부족! 출금이 불가능합니다." 하고 메소드 종료
                - 성공한다면
                    콘솔창에
                    출금 성공! 현재 잔액 : ****원

           showAccountInfo()
                - 콘솔창에
                    김일 님의 계좌번호는 1234567이며, 현재 잔액은 10000원 입니다.

          BankMain 클래스에서 객체를 만들어서 setter, getter를 사용해 계좌 정보 및 출력을 해보고
          deposit() / withdraw()를 실행시켜 입금 성공 및 실패 사례를 확인하고 통과되는지 검증해보세요.
 */

public class Bank {

    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }

        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호 입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount, int inputPin) {
        if(pinNumber != inputPin) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            if(amount < 0) {
                System.out.println("불가능한 입력 금액입니다.");
            } else {
                balance += amount;
                System.out.println(amount + " 원 입금 성공! 현재 잔액 : " + balance); // 오류 나지 않음.
//                System.out.println(amount + " 원 입금 성공! 현재 잔액 : " + this.balance); // 오류 나지 않음.
            }
        }
    }

    public void withdraw(int amount, int inputPin) {
        if(pinNumber != inputPin) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            if(amount < 0) {
                System.out.println("현재 잔액은 0입니다.");
            } else {
                if(balance < amount) {
                    System.out.println("잔액이 부족합니다.");
                    return;
                }
                balance -= amount;
                System.out.println(amount + " 원 출금 성공! 현재 잔액 : " + balance);
            }
        }
    }

    public void showAccountInfo() {
        System.out.println(accountHolder + " 님의 계좌번호는 " + accountNum + " 이며, "
                        + "현재 잔액은 " + balance + "원 입니다.");
    }

    public void displayAccount() {
        System.out.println("최종 계좌 정보");
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("현재 잔액 : " + balance);
    }
}
