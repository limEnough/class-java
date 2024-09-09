package array;

import java.util.Scanner;

public class ArrQuestion1 {
    public static void main(String[] args) {
        /* [문제1] Before */
//        int students1 = 90;
//        int students2 = 80;
//        int students3 = 70;
//        int students4 = 60;
//        int students5 = 50;
//
//        int total = students1 + students2 + students3 + students4 + students5;
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        /* After */
//        int[] scores = {90, 80, 70, 60, 50};
//        int total = 0;
//
//        for (int score : scores) {
//            total += score;
//        }
//
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        /*
            [문제2] 배열의 입력과 출력
            사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 순서대로 출력하자.
            출력시, 출력 포맷은 1, 2, 3, 4, 5 와 같이 쉼표를 사용해 구분하고, 마지막에는 생략한다.
         */
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//        String result = "";
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("5개의 정수를 입력하세요");
//            numbers[i] = scanner.nextInt();
//            result += (i == numbers.length - 1) ? numbers[i] : (numbers[i] + ", ");
//        }

//        System.out.println(result);

        /*
            [문제3] 배열과 역순 출력
            사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
            출력시, 출력 포맷은 1, 2, 3, 4, 5 와 같이 쉼표를 사용해 구분하고, 마지막에는 생략한다.
         */
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//        String result = "";
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("5개의 정수를 입력하세요");
//            numbers[i] = scanner.nextInt();
//        }
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(i == 0 ? numbers[i] : (numbers[i] + ", "));
//        }

        /*
            [문제4] 합계와 평균
            사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 이들 정수의 합계와 평균을 구하는 프로그램 작성하자.
         */
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//        int total = 0;
//        double average;
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("5개의 정수를 입력하세요");
//            numbers[i] = scanner.nextInt();
//            total += numbers[i];
//        }
//
//        average = (double) total / numbers.length;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        /*
            [문제5] 합계와 평균2
            문제 4와 동일하며, 사용자에게 입력받을 숫자의 갯수를 입력 받도록 개선하자.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        int total = 0;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(length + "개의 정수를 입력하세요");
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
