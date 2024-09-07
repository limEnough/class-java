package array;

public class Array2 {
    /*
        [배열 리팩토링]

        기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과정
        중복을 제거하고, 복잡성을 줄이며, 이해가기 쉬운 코드를 만들기 위해 ㅅ수행된다.
        리팩토링은 버그를 줄이고, 프로그램 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다.
     */
    public static void main(String[] args) {
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50, 85}; // 배열 생성과 초기화 생략

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
