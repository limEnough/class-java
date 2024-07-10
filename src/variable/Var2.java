package variable;

public class Var2 {
    public static void main(String[] args) {
        /* 변수 타입 */
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // true, false
        char d = 'A'; // 문자 하나 (작은 따옴표)
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입 (대문자 유의, 큰 따옴표)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /* 리터럴 */
        // 직접 적어 넣은 고정된 값을 리티럴이라고 한다.
        // 변수의 값은 변할 수 있지만 리터럴 자체는 변하지 않는다.

        /* 다양한 숫자 타입과 메모리 */
        // 메모리를 작게 사용하면 작은 숫자를 표현할 수 있고, 메모리를 많이 사용하면 큰 숫자를 표현할 수 있다.
        // 정수
        byte f = 127; //-128 ~ 127
        short g = 32767; //-32,767 ~ 32,767
        int h = 2147483647; //-2147483648 ~ 2147483647 (약 20억)
        long i = 9223372036854775807L; //

        // 실수
        float j = 10.0f; //소수점 오류 발생이 잦아 잘 사용하지 않는다.
        double k = 10.0;

        /* 기타 타입의 메모리 */
        // boolean: true false (1byte)
        // char: 문자 하나 (1byte)
        // String: 문자열을 표현. 메모리 사용량은 문자 길이에 따라 동적으로 달라짐.

        /* 리터럴 타입 지정 */
        // 정수 리터럴은 int를 기본으로 사용하고, 실수 리터럴은 double을 기본으로 사용한다.
        // byte는 파일을 바이트 단위로 다루기 때문에 파일 전송, 파일 복사 등에 주로 사용된다.
    }
}
