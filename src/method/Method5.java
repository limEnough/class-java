package method;

public class Method5 {
    /*
        [메서드 오버로딩]
            다음과 같은 메서드를 만들고 싶다.

            - 두 수를 더하는 메서드
            - 세 수를 더하는 메서드

            이 경우 둘 다 더하는 메서드이기 때문에 가급적 같은 이름인 add를 쓰고 싶다.
            자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다.
            따라서 다음과 같이 이름이 같고, 매개변수가 다른 메서드를 정의할 수 있다.

            이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(overloading)이라 한다.
            오버로딩은 번역하면 과적인데, 과하게 물건을 담았다는 뜻이다. 같은 이름의 메서드를 여러개 정의했다고 이해하면 된다.
            메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 반환 타입은 인정하지 않는다.

            * 오버로딩 성공 *
            add(int a, int b)
            add(int a, int b, int c)
            add(double a, double b)

            * 오버로딩 실패 *
            int add(int a, int b)
            double add(int a, int b)

        [메서드 시그니처]
            메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
            메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다.
            메서드 시그니처는 메서드의 이름과 매개변수 타입(순서 포함)으로 구성되어 있다. 쉽게 이야기해서 메서드를 구분할 수 있는 기준이다.
            메서드 오버로딩에서 확인한 것처럼 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다.
            이 때, 반환 타입은 시그니처에 포함되지 않는다.
     */
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2)); // 1번호출, ***1번 함수가 없으면 3번호출 (자동 형변환)
        System.out.println("2: " + add(1, 2, 3)); // 2번 호출
        System.out.println("3: " + add(1, 2.2)); // 3번 호출
    }

    // 첫번째 add 메서드: 두 정수를 받아서 합을 반환한다.
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    // 두번째 add 메서드: 세 정수를 받아서 합을 반환한다.
    // 첫번째 메서드와 이름은 같지만 매개변수 목록이 다르다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    // 세번째 add 메서드: 한 정수와 한 실수를 받아서 합을 반환한다.
    // 첫번째 메서드와 이름과 매개변수 갯수가 같지만 타입이 다르다.
    public static double add(int a, double b) {
        System.out.println("3번 호출");
        return a + b;
    }

    // *** 본인의 타입에 가장 적합한 메서드를 호출하고, 그렇지 않으면 자동형변환(캐스팅)을 통해 호출 가능한 메서드를 찾는다.
}
