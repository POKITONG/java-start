package 김영한자바기초.조건문;

public class Ex01 {
    public static void main(String[] args) {
        int score = 100;
        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else  {
            System.out.println("학점은 F입니다.");
        }
    }
}
