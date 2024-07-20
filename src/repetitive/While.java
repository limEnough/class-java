package repetitive;

public class While {
    public static void main(String[] args) {
        /* while문을 이용하여 1부터 하나씩 증가하는 수를 3번 더해라 */
        int count = 0;
        int sum = 0;
        int endNum = 10;

        while (count < endNum) {
            count++;
            sum += count;
            // System.out.println(sum);
        }

        /* break, continue */
        // break 는 반복문을 즉시 종료하고 나간다.
        // continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용한다.
        // 모든 반복문에서 사용할 수 있다.
        int total = 0;
        int i = 1;

        while (true) {
            total += i;

            if ( total == 3 ) {
                continue;
            }

            System.out.println("total=" + total);

            if (total > 10) {
                System.out.println("합이 10보다 크면 종료 total=" + total);
                break;
            }
        }
    }
}
