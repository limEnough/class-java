package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        /*
            [예제 1]
            - 사용자가 입력한 문자열을 그대로 출력하는 예제
            - exit 라는 문자가 입력되면 프로그램을 종료한다.
            - 프로그램은 반복해서 실행된다.
         */

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.print("문자열을 입력하세요. (exit: 종료): ");
//            String str = scanner.nextLine();
//
//            if (str.equals("exit")) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//
//            System.out.println("입력한 문자열: " + str);
//        }

        /*
            [예제 2]
            - 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 예제
            - 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램 종료한다.
            - 프로그램은 반복해서 실행된다.
         */
//        while (true) {
//            System.out.print("첫 번째 숫자를 입력하세요: ");
//            int num1 = scanner.nextInt();
//
//            System.out.print("두 번째 숫자를 입력하세요: ");
//            int num2 = scanner.nextInt();
//
//            if (num1 == 0 && num2 == 0) {
//                System.out.print("입력한 두 수가 모두 0이기에 프로그램을 종료합니다.");
//                break;
//            }
//        }

        /*
            [예제 3]
            - 사용자 입력을 받아 그 합계를 출력하는 예제
            - 사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
            - 이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야 한다.
         */
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력해주세요. (0: 종료): ");
            int inputNum = scanner.nextInt();

            if (inputNum == 0) {
                // System.out.println("입력한 수의 합계는 " + sum + "입니다.");
                break;
            }

            sum += inputNum;
        }

        // 여기에서 출력해도 된다.
        System.out.println("입력한 수의 합계는 " + sum + "입니다.");
    }
}
