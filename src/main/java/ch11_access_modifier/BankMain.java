package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank owner1 = new Bank();
        owner1.setAccountNum(123456);
        owner1.setAccountHolder("홍길동");
        owner1.setBalance(100000);
        owner1.setPinNumber(1234);

        Bank owner2 = new Bank();
        owner2.setAccountNum(97654);
        owner2.setAccountHolder("신사인당");
        owner2.setBalance(500000);
        owner2.setPinNumber(5678);

        owner1.showAccountInfo();
        System.out.println();
        owner2.showAccountInfo();

        System.out.println();

        owner1.deposit(50000, 1234);
        owner1.withdraw(200000, 1234);
        owner1.withdraw(100000, 1234);

        // 비밀번호가 틀린 경우
        owner1.deposit(50000, 3456);

        System.out.println();

        owner2.withdraw(100000, 5678);
        owner2.deposit(200000, 5678);

        System.out.println();

        owner1.displayAccount();
        System.out.println();
        owner2.displayAccount();
    }
}
