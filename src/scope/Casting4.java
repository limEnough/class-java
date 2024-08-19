package scope;

public class Casting4 {
    public static void main(String[] args) {
        /*
            [계산과 형변환]

            1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
                int + int = int;
                double + double = double;

            2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
                int + long = long;
                int + double = double;
         */

        /*  int 와 int */
        int div1 = 3 / 2; // 1.5
        System.out.println("div1 = " + div1); // 1

        /* 자동 형변환 */
        // int 와 int = (double) 결괏값
        // double div2 = 3 / 2; // int / int
        // double div2 = 1; // int이므로 int타입으로 결과 출력
        // double div2 = (double) 1; // int => double 에 대입해야 한다. 자동 형변환 발생
        // double div2 = 1.0 // 1(int) => 1.0(double) 형변환 완료
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0

        /*  double 과 int */
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        /* 명시적 형변환 */
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5

        /* 변수 사용 */
        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
