package variable;

public class Var1 {
    public static void main(String[] args) {
        //1. 변수 선언, 초기화 각각 따로
        int a;
        a = 10;
        System.out.println(a);

        //2. 변수 선언과 초기화를 한번에
        int b = 2;
        System.out.println(b);

        //3. 여러 변수 선언과 초기화를 한번에
        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);

        //4. 초기화 하지 않은 변수
        int e;
        // System.out.println(e);
        /*
        초기화 하지 않은 변수는 다음과 같은 컴파일 에러가 발생한다.
        
        java: variable a might not have been initalized
        
        변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다. 그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다.
        따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다. 이런 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제한다.

        또한, 사용하지 않는 변수 e 는 컴파일 단계에서 최적화를 거쳐 메모리에서 삭제가 된다.
         */
    }
}
