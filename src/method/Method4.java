package method;

public class Method4 {
    /*
        [메서드와 형변환]
            메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 어떻게 해야할까?
            1. 명시적 형변환
            2. 자동 형변환
     */
//    public static void main(String[] args) {
//        double number = 1.5;
////        printNumber(number); //double을 int형에 대입하므로 컴파일 오류
//        printNumber((int) number); //명시적 형변환을 사용해 double을 int로 전환
//    }
//
//    public static void printNumber(int n) {
//        System.out.println("숫자: " + n);
//    }

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //int 에서 double로 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
