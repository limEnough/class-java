package condition;

public class CondQuestion1 {
    public static void main(String[] args) {
        /* if 문 */
        int score = 85;

        if (90 <= score) {
            System.out.println("학점은 A입니다.");
        } else if (80 <= score && score < 90) {
            System.out.println("학점은 B입니다.");
        } else if (70 <= score && score < 80) {
            System.out.println("학점은 C입니다.");
        } else if (60 <= score && score < 70) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }

        /* switch */
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("축하합니다. 성적장학금 대상자입니다.");
                break;
            case "B":
                System.out.println("우수한 성적입니다.");
                break;
            case "C":
                System.out.println("다음을 기대하게 되는 성적입니다.");
                break;
            case "D":
                System.out.println("조금 더 분발해야 합니다.");
                break;
            default:
                System.out.println("노력을 하지 않을거라면 그만두는 것도 방법입니다.");
        }

        /* 삼항연산자 */
        int x = 21;

        System.out.println((21 % 2 == 0) ? "짝수" : "홀수");
    }
}
