package repetitive;

public class RepetQuestion1 {
    public static void main(String[] args) {
        /* count 라는 변수를 사용하여 10개의 자연수 출력 */
        // int count = 1;
        // while (count <= 10) {
        //     System.out.println("while 문으로 " + count);
        //     count++;
        // }

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("for 문으로 " + i);
        // }

        /* num 이라는 변수를 사용하여 처음 10개의 짝수 출력 */
        // int num = 1;
        /// while (num <= 20) {
        //     if (num % 2 == 0) {
        //        System.out.println("while 문으로 " + num);
        //     }
        //     num++;
        // }

        // for (int i = 1; i <= 20; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println("for 문으로 " + i);
        //     }
        // }

        // 이런식으로 조건을 여러개를 한번에 선언할 수 있다. 하지만 가시성 측면에서 좋은 코드라고 할 수는 없다.
        // for (int num = 2, count = 1; count <= 10; num += 2, count++) {
        //     System.out.println(num);
        // }

        /* 누적 합 계산 : 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성하시오. */
        // int sum = 0;
        // int i = 0;
        // int max = 100;
        // while (i <= max) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);

        int sum = 0;
        int max = 100;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
