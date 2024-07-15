package operator;

public class Oper5 {
    public static void main(String[] args) {
        /*
            비교연산자 - 문자열 비교
            문자열이 같은지 비교할 때는 ==이 아니라 .equals() 메서드를 사용해야 한다.
            ==를 사용하면 성공할 때도 있지만 실패할 때도 있다.
            ==는 객체의 주소를 비교하여 일치하는지 확인하고, .equals() 메서드는 객체의 내용을 비교하여 같은지 확인하기 때문이다.
         */
        String str1 = "문자열"; // 리터럴로 선언
        String str2 = "문자열"; // 리터럴로 선언

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("hello"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        /*
            객체의 주소값
            문자열의 내용은 같아도 리터럴로 선언하였는지, new 연산자로 선언하였는지에 따라 주소(참조)값이 다를 수 있다.
            문자열 리터럴을 사용하는 경우, 자바 컴파일러는 String Constant pool 이라는 영역에 같은 값의 문자열을 공유하여 메모리 사용량을 최적화한다.
            따라서 str1과 str2의 주소값은 같다.
            하지만 new 연산자를 사용하여 새로운 문자열 객체를 생성하는 경우에는 Heap 영역에 저장되며 다른 주소값을 할당받는다.
            str1과 str2의 주소값은 다르며, str3과 str4의 주소값도 다르다.
         */
        String str3 = new String("문자열"); // new 연산자로 선언
        String str4 = new String("문자열"); // new 연산자로 선언

    }
}
