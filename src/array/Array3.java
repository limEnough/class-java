package array;

public class Array3 {
    /*
        [2차원 배열]

        2차원 배열은 행(row)과 열(column)로 구성된다.
        arr[행][열], arr[row][column]
        int[][] arr = new int[2][3] 와 같이 선언하고 생성한다.
        그리고 arr[1][2] 와 같이 사용하는데, 먼저 행 번호를 찾고, 그 다음에 열 번호를 찾으면 된다.
     */

    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //행2, 열3
        arr[0][0] = 1; //0행, 1열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        //0행 출력
        System.out.print(arr[0][0] + " "); //0행, 1열
        System.out.print(arr[0][1] + " "); //0행, 1열
        System.out.print(arr[0][2] + " "); //0행, 2열
        System.out.println(); //한 행이 끝나면 라인을 변경한다.

        //0행 출력
        System.out.print(arr[1][0] + " "); //1행, 0열
        System.out.print(arr[1][1] + " "); //1행, 1열
        System.out.print(arr[1][2] + " "); //1행, 2열
        System.out.println(); //한 행이 끝나면 라인을 변경한다.
    }
}
