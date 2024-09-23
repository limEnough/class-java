package method;

public class Method1 {
        public static void main(String[] args) {
            // 계산1
//            int a = 1;
//            int b = 2;
//            System.out.println(a + "+" + b + " 연산 수행");
//            int sum1 = a +  b;
//            System.out.println("결과1 출력: " + sum1);

            // 계산2
//            int x = 10;
//            int y = 20;
//            System.out.println(x + "+" + y + " 연산 수행");
//            int sum2 = x +  y;
//            System.out.println("결과2 출력: " + sum2);

            int sum1 = add(1, 2);
            System.out.println("결과1 출력: " + sum1);

            int sum2 = add(10, 20);
            System.out.println("결과2 출력: " + sum2);
        }

        public static int add(int a, int b) {
            System.out.println(a + "+" + b + " 연산 수행");
            return a + b;
        };

        /*
            [메서드]
                자바에서는 함수를 메서드(method)라 한다. 메서드도 함수의 한 종류라고 생각하면 된다.
                메서드는 크게 메서드 선언과 메서드 본문으로 나눌 수 있다.

            [메서드 선언]
                public static int add(int a, int b)
                메서드의 선언 부분으로, 메서드 이름, 반환 타입, 파라미터 목록을 포함한다.
                이름 그대로 이런 메서드가 있다고 선언하는 것이다. 메서드 선언 정보를 통해 다른 곳에서 해당 메서드를 호출할 수 있다.

                public static
                - public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습한다.
                - static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 자세한 내용을 뒤에서 다룬다.

                int add(int a, int b)
                - int : 반환 타입을 정의한다. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정한다.
                - add : 메서드에 이름을 부여한다. 이 이름으로 메서드를 호출할 수 있다.
                - (int a, int b) : 메서드를 호출할 때 전달하는 입력 값을 정의한다. 이 변수들은 해당 메서드 안에서만 사용된다.
                                   이렇게 메서드 선언에 사용되는 변수를 영어로 파라미터(parameter), 한글로 매개변수라 한다.

            [메서드 본문]
                {
                    System.out.println(a + "+" + b + " 연산 수행");
                    return a + b;
                }
                - 메서드가 수행해야하는 코드블록이다.
                - 메서드를 호출하면 메서드 본문이 순서대로 실행한다.
                - 메서드 본문은 블랙박스이다. 메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다.
                - 메서드의 실행 결과를 반환하려면 reture문을 사용해야 한다.

            [메서드 호출]
                int sum1 = add(1, 2);
                int sum2 = add(10, 20);

                앞서 정의한 메서드를 호출해서 실행하려면 메서드 이름에 입력 값을 전달하면 된다. 메서드를 호출한다고 표현한다.
                메서드를 호출할 때는 메서드에 넘기는 값과 파라미터 타입이 맞아야 한다. 넘기는 값과 파라미터의 순서와 갯수도 맞아야 한다.

            [용어 정리]
                인수 (Argument): "1, 2" 처럼 넘기는 값을 인수, 아규먼트라고 한다.
                매개변수 (parameter): 메서드를 정의할 때 선언한 변수인 int a, int b를 매개변수, 파라미터라고 한다.
                                     메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
         */
}
