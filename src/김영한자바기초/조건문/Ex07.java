package 김영한자바기초.조건문;

public class Ex07 {
    public static void main(String[] args) {
        int x = 5;
        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);

        /*int x = 5;
        String result;
        if ( x % 2 == 0) {
            result = "짝수";
        } else if (x % 2 == 1) {
            result = "홀수";
        }

        System.out.println("x = " + x + "," + result);*/
    }
}
