package 김영한자바기초.반복문;

public class Ex03 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
