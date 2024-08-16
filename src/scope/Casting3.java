package scope;

public class Casting3 {
    /*
        [형변환과 오버플로우]

        maxIntOver 에 int 로 표현할 수 있는 가장 큰 숫자인 2147483647 보다 1 큰 숫자를 입력했다.
        이 숫자 리터럴은 int 범위를 넘어가기 때문에 마지막 L을 붙여서 long 형을 사용해야 했다.
        이 경우 int 로 표현할 수 있는 범위를 넘어가기 때문에 다음과 같이 long => int 로 형변환 하면 문제가 발생한다.
     */
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue);
    }

    /*
        long maxIntOver = 2147483648L; // int 최고값 + 1
        intValue = (int) maxIntOver; // 변수 값 읽기
        intValue = (int) 2147483648L; // 형변환 시도
        intValue = -2147483648;

        보통 오버플로우가 발생하면 마치 시계가 한 바퀴 돈 것처럼 다시 처음부터 시작한다.
        참고로 -2147483648 숫자는 int 의 가장 작은 숫자이다.
        중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 것이다. (결과가 어떻게 되는지 계산하는 것은 시간 낭비)
        오버플로우 자체가 발생하지 않도록 막아야 한다. 이 경우 단순히 대입하는 변수(intValue) 의 타입을
        int => long 으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결된다.
     */
}
