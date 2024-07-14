package operator;

public class Oper3 {
    public static void main(String[] args) {
        /*
            연산자 우선순위
            1. 괄호 ()
            2. 단항 연산자 (++, --, !, ~, new, (type))
            3. 산술 연산자 (*, /, % 우선, 그 다음에 +, -)
            4. Shift 연산자 (<<, >>, >>>)
            5. 비교 연산자 (<, <=, >, >=, instanceof)
            6. 등식 연산자 (== !==)
            7. 논리 연산자 (&&, ||)
            8. 삼항 연산자 (? :)
            9. 대입 연산자 (=, +=, -=, *=, /=, %=)
         */

        /*
            ~ 비트 반전 연산자
            - byte, short, int, long 타입만 피연산자가 될 수 있다.
            - 비트값을 반전 시킨다. (0 => 1, 1 => 0)
            - 부호 비트인 최상위 비트까지 반전되므로 부호가 반대인 새로운 값이 산출된다.
            - 피연산자의 타입이 int 이하이면 연산의 결과는 int 타입이다.
            - 비트 반전 후 1을 더하면 부호가 반대인 값을 얻을 수 있다.
         */
        byte v1 = 10;
        // byte v2 = ~v1; //컴파일에러
        int v2 = ~v1;
        int v3 = v2 + 1;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        /*
            <<, >>, >>> Shift 연산자
            비트 연산자 중 하나로 비트값을 왼쪽(<<) 또는 오른쪽(>>)으로 이동시키는 연산자이다.
            연산자 중 '>>>'는 자바에만 있는 연산자로 부호를 신경쓰지 않는 것으로,
            비트 값들을 주어진 비트 수만큼 오른쪽으로 이동 시킨 후 왼쪽의 빈 공간을 모두 0으로 채운다.
         */
    }
}
