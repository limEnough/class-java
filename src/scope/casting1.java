package scope;

public class casting1 {
    /*
        [자동 형변환]

        작은 범위에서 큰 범위로는 값을 넣을 수 있다. (int => long => double)
        큰 범위에서 작은 범위로는 소수점 버림, overflow 와 같은 문제가 발생할 수 있다.
     */
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int => long (10)
        doubleValue = intValue; // int => double (10.0)
        doubleValue = 20L; // long => double (20.0)
    }
    /*
        자바는 작은 범위에서 큰 범위로의 대입을 허용하지만 결국 타입은 맞춰주어야 한다.
        때문에 개념적으로는 다음과 같이 동작한다.

        // intValue = 10;
        doubleValue = intValue;
        doubleValue = (double) intValue; // 형 맞추기
        doubleValue = (double) 10; // 값 맞추기
        doubleValue = 10.0; // 형 변환

        이렇게 앞에 (double) 과 같이 적어주면 int 형이 double 형으로 형이 변한다. 이렇게 형이 변경되는 것을 형변환이라 한다.
        작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을 하지 않아도 된다.
        위 과정이 자동으로 일어나기 때문에 자동 형변환, 또는 묵시적 형 변환이라고 한다.
     */
}