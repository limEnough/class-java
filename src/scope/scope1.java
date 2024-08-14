package scope;

public class scope1 {
    /*
        [ 지역변수와 스코프 ]
            변수는 선언한 위치에 따라 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.
            우리가 지금까지 학습한 변수들은 모두 영어로 로컬 변수(Local Variable), 한글로 지역 변수라 한다.
            지역 변수는 이름 그대로 특정 지역에서만 사용할 수 있는 변수라는 뜻이다. 특정 지역을 벗어나면 사용할 수 없다.
            여기서 말하는 지역이 바로 변수가 선언된 코드 블록({}) 을 뜻하며 자신이 선언된 코드 블록을 벗어나면 제거된다. 따라서 이후에는 접근할 수 없다.
            이렇게 변수의 접근 가능한 범위를 스코프(Scope) 라고 한다.
    */

    public static void main(String[] args) {
        int m = 10;
        // int temp = 0;
        if (m > 0) {
            int temp = m + 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }

    /*
        [ 스코프 존재 이유 ]
            1. 비효율적인 메모리 사용
                temp는 if 코드 블록에서만 필요하지만, main() 코드 블록이 종료될 때까지 메모리에 유지된다.
                따라서 불필요한 메모리가 낭비된다. 만약 if 코드 블록 안에 temp 를 선언했다면,
                if 코드 블록의 종료 시점에 이 변수를 메모리에서 제거해 더 효율적으로 메모리를 사용할 수 있다.

            2. 코드 복잡성 증가
                좋은 코드는 군더더기 없는 단순한 코드이다. temp 는 if 코드 블록에서만 필요하고, 여기서만 사용하면 된다.
                만약 if 코드 블록 안에 temp 를 선언했다면 if 가 끝나고 나면 temp 를 전혀 생각하지 않아도 된다.
                머릿속에서 생각할 변수를 하나 줄일 수 있다. 그러나 위 코드는 if 코드 블록이 끝나도 main() 어디서나 여전히
                temp 에 접근할 수 있기 때문에 누군가 유지보수를 할 때 m 은 물론이고 temp 까지 계속 신경써야 한다.
    */
}
