package repetitive;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        /* while문 */
        while (i < 3) {
            System.out.println("현재 숫자는" + i);
            i++;
        }

        /* do-while문 */
         // 실행 먼저 한 뒤, 조건을 검사한다. 조건이 거짓이면 더 이상 실행하지 않는다.
         // 최초 1회는 코드블록을 꼭 실행해야 하는 경우에 사용한다.
         do {
             System.out.println("현재 숫자는" + i);
             i++;
         } while (i < 3);


    }
}
