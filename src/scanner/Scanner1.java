package scanner;

import java.util.Scanner;

public class Scanner1 {
    /*
        [Scanner]
        System.out을 통해서 출력을 했듯이, System.in을 통해서 사용자의 입력을 받을 수 있다.
        그런데 자바가 제공하는 System.in을 통해서 사용자 입력을 바으려면 여러 과정을 거쳐야 하기에 복잡하고 어렵다.
        자바는 이런 문제를 해결하기 위해 Scanner라는 클래스를 제공한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextInt();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
