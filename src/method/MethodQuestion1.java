package method;

public class MethodQuestion1 {
    /* 문제 1. 평균값 구하기 */
    public static void main(String[] args) {
//        System.out.println("평균값1" + getAverage(1, 2, 3));
//        System.out.println("평균값2" + getAverage(15, 25, 35));
//        printHello(3, "Hello world!");

        int balance = 1000; // 잔고

        balance = deposit(200 ,balance);
        System.out.println("최종 잔액: " + balance + "원");
        balance = withdraw(1500 ,balance);
        System.out.println("최종 잔액: " + balance + "원");
        balance = withdraw(800 ,balance);
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    /* 문제 2. 반복 출력 리팩토링 */
    public static void printHello(int count, String message) {
        for(int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    /* 문제 3. 입금과 출금을 메서드로 만들어서 리팩토링 */
    public static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을출금하였습니다. 현재 잔액: " + balance + "원");
        }
        else {
            System.out.println(amount + "원을 출금하여 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
