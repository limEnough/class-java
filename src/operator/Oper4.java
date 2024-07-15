package operator;

public class Oper4 {
    public static void main(String[] args) {
        /* 증감연산자 */
        int a = 1;
        int b = 0;

        // 1. 전위증감연산자
        // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        b = ++a;
        System.out.println(a);
        System.out.println(b);

        a = 1;
        b = 0;

        // 2. 전위증감연산자
        // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        b = a++;

        System.out.println(a);
        System.out.println(b);
    }
}
