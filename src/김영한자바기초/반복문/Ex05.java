package 김영한자바기초.반복문;

public class Ex05 {
    public static void main(String[] args) {
        int rows = 3;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
