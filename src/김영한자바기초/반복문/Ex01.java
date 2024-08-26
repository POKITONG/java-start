package 김영한자바기초.반복문;

public class Ex01 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count++);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
