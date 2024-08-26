package 김영한자바기초.반복문;

public class break2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ;i++) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
