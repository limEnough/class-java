package method;

public class Method2 {
    public static int add(int a, int b) {
        // 메서드 본문, 실행 코드
        return a + b;
    }

    // 제어자 반환 타입 메서드이름(매개변수 목록) {
    // 메서드 본문
    // }

    /*
        [메서드 정의]
            제어자 (Modifier)
                public, static 과 같은 부분이다. 제어자는 뒤에서 설명한다.
            반환 타입 (Return Type)
                - 메서드가 실행된 후 반환하는 데이터의 타입을 지정한다.
                - 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void를 사용해야 한다. ex) void print(String str)
            메서드 이름 (Method Name)
                메서드의 이름이다. 이 이름은 메서드를 호출하는 데 사용된다.
            매개변수 (Parameter)
                입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다.
                입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다.
            메서드 본문 (Method Body)
                실제 메서드의 코드가 위치한다. 중괄호 {} 사이에 코드를 작성한다.
     */


    /*
         [매개변수가 없거나 반환 타입이 없는 경우]
            매개변수가 없고, 반환 타입도 없는 메서드를 확인해보자.
     */
    public static void main(String[] args) {
//        String str = printHeader(); // 반환타입이 없기 때문에 이렇게 호출하면 에러난다.
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return; // void 라 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
    }
}
