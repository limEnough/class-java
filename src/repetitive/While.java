package repetitive;

public class While {
    public static void main(String[] args) {
        /* while문을 이용하여 1부터 하나씩 증가하는 수를 3번 더해라 */
        int count = 0;
        int sum = 0;
        int endNum = 100;

        while (count < endNum) {
            count++;
            sum += count;
            System.out.println(sum);
        }
    }
}
