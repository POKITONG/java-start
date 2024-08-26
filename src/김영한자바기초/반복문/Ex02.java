package 김영한자바기초.반복문;

import java.sql.SQLOutput;

public class Ex02 {
    public static void main(String[] args) {
        /*int num = 1;
        int count = 20;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        for (int i = 1; i < count; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num+=2;
            count++;
        }

        for (int num2 = 2, count2 = 1; count2 <= 10; num2 += 2, count2++) {
            System.out.println(num2);
        }
    }
}
