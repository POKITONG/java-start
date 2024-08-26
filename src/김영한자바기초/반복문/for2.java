package 김영한자바기초.반복문;

public class for2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i= " + i + " sum=" + sum);
        }
    }
}
