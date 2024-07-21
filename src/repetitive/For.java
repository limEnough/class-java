package repetitive;

public class For {
    /*
        [for문과 while문의 비교]
            둘을 비교했을 때, for문이 더 깔끔하다는 느낌을 받을 것이다.
            for문은 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어있어 코드를 이해하기 더 쉽다.
            특히 반복을 위해 증가하는 카운터 변수를 다른 부분과 명확하게 구분할 수 있다.

            for (초기식; 조건식; 증감식) {
                // 코드
            }


        [for문 구조]
            for문에서 초기식, 조건식, 증감식은 선택이다. 다음과 같이 모두 생략해도 된다.
            단 생략해도 각 영역을 구분하는 세미콜론(;)은 유지해야 한다.

            for (;;) {
                // 코드
            }

            이렇게 하면 조건이 없기 때문에 무한 반복하는 코드가 된다. 따라서 아래 코드와 같다.

            while (true) {
                // 코드
            }
     */
    public static void main(String[] args) {
        /* for문을 사용해서 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값을 찾아라 */
        int total = 0;
        int i = 1;
        for (;;) {
            total += i;

            if (total > 10) {
                System.out.println("합이 10보다 크면 종료 total=" + total);
                break;
            }

            i++;
        }

        int sum = 0;
        for (int j = 1; ; j++) {
            sum += j;

            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 sum=" + sum);
                break;
            }
        }
    }
}
