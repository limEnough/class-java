package scanner;

import java.util.Scanner;

public class ScannerQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*
            [문제 1] 이름 나이 입력 받고 출력하기
            - 사용자로부터 입력 받은 이름과 나이를 출력하세요.
            - 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다."
         */
//        System.out.print("이름을 입력하세요: ");
//        String name = scanner.nextLine();
//
//        System.out.print("나이를 입력하세요: ");
//        int age = scanner.nextInt();
//
//        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");

        /*
            [문제 2] 홀수 짝수
            - 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
         */
//        System.out.print("정수를 입력하세요: ");
//        int num = scanner.nextInt();
//
//        System.out.println("입력한 정수는 " + (num % 2 == 0 ? "짝수" : "홀수") + "입니다.");

        /*
            [문제 3] 음식점 주문
            - 사용자로부터 음식의 이름(foodName), 가격(price), 수량(foodQuantity)을 입력 받아 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
            - 음식의 총 가격을 계산하세요. 이를 totalPrice 라는 이름의 변수에 저장하세요.
            - 주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]입니다."
         */
//        System.out.print("음식 이름을 입력해주세요: ");
//        String foodName = scanner.nextLine();
//
//        System.out.print("음식의 가격을 입력해주세요: ");
//        int price = scanner.nextInt();
//
//        System.out.print("음식의 수량을 입력해주세요: ");
//        int foodQuantity = scanner.nextInt();
//
//        int totalPrice = price * foodQuantity;
//
//        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "입니다.");

        /*
            [문제 4] 구구단 출력
            - 사용자로부터 하나의 정수 n을 입력받고, 입력받은 정수 n의 구구단을 출력하는 프로그램을 작성하세요.
         */
        System.out.print("구구단이 궁금한 정수를 입력해주세요: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
