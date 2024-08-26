package 김영한자바기초.반복문;

public class Ex03_1 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
