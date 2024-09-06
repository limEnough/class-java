package scanner;

import java.util.Scanner;

public class ScannerQuestion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            [문제 5] 입력한 숫자의 합계와 평균
            - 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램
            - 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료
            - 모든 숫자의 입력이 끝난 후에는, 숫자들의 sum과 average를 출력한다. 평균은 소수점 아래까지 계산한다.
         */
        int sum = 0;
        int count = 0;
        int average;

        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
            int num = scanner.nextInt();

            if (num == -1) break;

            sum += num;
            count++;
        }
        average = sum / count;

        System.out.println("입력한 숫자들의 합계:" + sum);
        System.out.println("입력한 숫자들의 평균:" + average);
    }
}
