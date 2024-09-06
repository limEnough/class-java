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
//        int sum = 0;
//        int count = 0;
//        int average;
//
//        while (true) {
//            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
//            int num = scanner.nextInt();
//
//            if (num == -1) break;
//
//            sum += num;
//            count++;
//        }
//        average = sum / count;
//
//        System.out.println("입력한 숫자들의 합계:" + sum);
//        System.out.println("입력한 숫자들의 평균:" + average);

         /*
            [문제 6] 상품 구매
            - 사용자로부터 상품 정보(상품명, 가격, 수량)을 입력받고, 이들의 총 가격을 출력하는 프로그램
            - 사용자에게 다음 세 가지 옵션을 제공해야 한다. (1: 상품 입력, 2: 결제, 3: 프로그램 종료) 옵션은 정수로 받으며, 변수 이름은 option 사용한다.
            - 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력 받는다.
            - 결제 옵션을 선택하면, 총 비용을 출력하고, 총 ㅂ용을 0으로 초기화 한다. (사용자가 총 비용을 확인하고 결제했다고 가정. 다음 사용자를 위한 초기화)
            - 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다." 라는 메시지 출력하고 프로그램 종료한다.
            - 모든 숫자의 입력이 끝난 후에는, 숫자들의 sum과 average를 출력한다. 평균은 소수점 아래까지 계산한다.
            - 위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요." 라는 메시지 출력
         */
        int total = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) { // 상품 입력
                System.out.print("상품명을 입력하세요: ");
                String productName = scanner.next();

                System.out.print("상품의 가격을 입력하세요: ");
                int productPrice = scanner.nextInt();

                System.out.print("상품의 수량을 입력하세요: ");
                int productQuantity = scanner.nextInt();

                total += productPrice * productQuantity;
            }
            else if (option == 2) { // 결제
                System.out.println("총 비용: " + total);
                total = 0; // 초기화
            }
            else if (option == 3) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
