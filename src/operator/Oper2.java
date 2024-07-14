package operator;

public class Oper2 {
    public static void main(String[] args) {
        /* 문자열과 숫자 더하기 */
        // 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
        System.out.println("a + b = " + 10);

        // 변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다.
        int num = 10;
        String str = "a + b";
        System.out.println(str + num);

        // 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
    }
}
