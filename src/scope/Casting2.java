package scope;

public class Casting2 {
    /*
        [명시적 형변환]

        기본적으로 큰 데이터 타입에서 작은 데이터 타입으로의 변환은 허용되지 않는다. => 컴파일 오류 발생
        그럼에도 불구하고 값을 대입하고 싶다면 데이터 타입을 강제로 변경할 수 있다.
        다음과 같이 변경하고 싶은 데이터 타입을 괄호를 사용하여 명시적으로 입력한다.
     */
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue;
        System.out.println(intValue); // 1
    }
    /*
        // double doubleValue = 1.5;
        intValue = (int) doubleValue;
        intValue = (int) 1.5; // doubleValue 에 있는 값을 읽는다.
        intValue = (int) 1; // (int) 로 형 변환 된다. intValue 에 int 형인 숫자 1을 대입한다.
     */
}
