package operator;

public class Oper1 {
    public static void main(String[] args) {
        /* 연산자와 피연산자 */
        // 3 + 4
        // +    연산자
        // 3, 4 피 연산자

        /* 산술 연산자 */
        // 주로 숫자를 계산하는데 사용된다.
        // + - * / %

        // [주의1] 선언 타입에 따라 달라지는 값
        int a = 5;
        int b = 2;
        double c = 3;

        // 자바에서 같은 int형끼리 계산하면 결과도 같은 int 형을 사용한다. int형은 정수이기 때문에 소수점 이하를 포함할 수 없다.
        System.out.println(a / b); // 결괏값 2
        System.out.println(a / c); // 결괏값 1.6666666667

        // [주의2] 0으로 나누기
        // 0으로 나누는 것은 수학에서 허용되지 않기에 예외가 발생하고 프로그램은 종료가 된다.
        // System.out.println(10 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
