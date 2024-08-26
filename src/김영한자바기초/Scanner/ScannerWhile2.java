package 김영한자바기초.Scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("첫 번째 숫자를 입력해 주세요.");
            System.out.printf("> ");
            int num1 = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력해 주세요.");
            System.out.printf("> ");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                break;
            }
            System.out.println(num1 + num2);
        }
    }
}
