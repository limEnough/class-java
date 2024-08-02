package repetitive;

public class RpetQuestion2 {
    public static void main(String[] args) {
        /* 중첩 for문을 사용해서 구구단 완성 */
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++) {
                // System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        /* 피라미드 출력 */
        int rows = 5;
        for (int i = 1; i <= rows; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
