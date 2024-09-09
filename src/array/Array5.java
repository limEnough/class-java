package array;

public class Array5 {
    public static void main(String[] args) {
        /*
            [향상된 for문]

            일반 for문은,
                1. 배열의 값을 읽으려면 int i 와 같은 인덱스를 탐색할 수 있는 변수를 선언해야 한다.
                2. i < numbers.length 와 같이 배열의 끝 조건을 지정해주어야 한다.
                3. 배열의 값을 하나 읽을 때마다 인덱스를 하나씩 증가해야 한다.
                
            향상된 for문은,
                1. 일반 for문과 동일하게 작동한다.
                2. 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 해당 배열을 처음부터 끝까지 탐색한다.
                3. : 의 오른쪽에 탐색할 배열을 선택하고, : 의 왼쪽에 반복할 때마다 찾은 값을 저장할 변수를 선언한다. 
         */
        int [] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문, for-each (단축키 iter)
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
