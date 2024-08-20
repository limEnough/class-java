package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        /*
            Q. 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램을 작성한다.
            이 때, 두 숫자가 같은 경우 두 숫자가 같다고 출력하면 된다.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요:");
        int num2 = scanner.nextInt();

        /*
            나의 답
         */
        int comparisonValue = (num1 < num2) ? num2 : (num1 == num2) ? 0 : num1;
        String result = comparisonValue == 0 ? "두 숫자는 같습니다." : comparisonValue + "가 더 큽니다.";
        System.out.print(result);

        /*
            선생님 답
         */
        if (num1 > num2) {
            System.out.print("더 큰 숫자: " + num1);
        } else if (num1 < num2) {
            System.out.print("더 큰 숫자: " + num2);
        } else {
            System.out.print("두 숫자는 같습니다.");
        }
    }
}
