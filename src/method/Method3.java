package method;

public class Method3 {
    public static void main(String[] args) {
        /*
            자바는 항상 변수의 값을 복사해서 대입한다.
         */
//        int num1 = 5;
//        int num2 = num1;
//        num2 = 10;
//
//        System.out.println("num1=" + num1); //5
//        System.out.println("num2=" + num2); //10

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); //5
        number = changeNumber(number);
        System.out.println("1. changeNumber 호출 후, number: " + number); //10
    }

//    public static void changeNumber(int number) {
//        System.out.println("2. changeNumber 변경 전, number: " + number); //5
//        number = number * 2;
//        System.out.println("3. changeNumber 변경 후, number: " + number); //10
//    }

    public static int changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); //10
        return number;
    }
}
