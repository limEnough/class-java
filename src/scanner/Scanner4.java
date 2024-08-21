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

        while (true) {
            System.out.print("문자열을 입력하세요. (exit: 종료): ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력한 문자열: " + str);
        }
    }
}
