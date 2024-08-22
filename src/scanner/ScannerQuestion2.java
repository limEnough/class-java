package scanner;

import java.util.Scanner;

public class ScannerQuestion2 {
    public static void main(String[] args) {
        /*
            [문제 1] 변수 값 교환
            - 변수 a=10 이 들어있고, b=20 이 들어있다.
            - 변수 a의 값과 변수 b의 값을 서로 바꾸어라.
            - 다음 코드에서 시작과 종료 사이에 변수 값을 교환하는 코드를 작성하면 된다.
            - 힌트: temp 변수를 활용해야 한다.
         */
//        int a = 10;
//        int b = 20;
//        int temp;
//
//        // 시작
//        temp = a;
//        a = b;
//        b = temp;
//        // 종료
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        /*
            [문제 2] 사이 숫자
            - 사용자로부터 두 개의 정수를 입력 받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
            - num1, num2 사용하세요.
            - 만약 첫 번째 숫자 num1 이 두 번째 숫자 num2 보다 크다면, 두 숫자를 교환하세요.
            - 출력 결과는 2, 3, 4, 5, 처럼 콤마로 구분합니다.
         */
        Scanner scanner = new Scanner(System.in);
        String result = "";

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("두 숫자는 같기 때문에 사잇값은 존재하지 않습니다.");
            return;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            result = result + i + (i != num2 ? ", " : "");
        }

        System.out.println(result);
    }
}
