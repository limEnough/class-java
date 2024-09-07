package array;

public class Array4 {
    public static void main(String[] args) {
        /* 리팩토링 */
//        int[][] arr = {
//            {1, 2, 3},
//            {4, 5, 6},
//        }; //행2, 열3
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) { //arr[row].length 는 행의 갯수를 뜻한다.
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println(); //한 행이 끝나면 라인을 변경한다.
//        }

        /* 구조개선 - 값 입력 */
        // 배열에 직접 1,2,3 숫자를 적어서 값을 할당하는 것이 아니라, 배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력하도록 변경
        int[][] arr = new int[3][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) { //arr[row].length 는 행의 갯수를 뜻한다.
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
