package 김영한자바기초.Scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("문자를 입력해 주세요. (exit : 종료)");
            System.out.printf("> ");
            String userString = scanner.nextLine();
            System.out.println("사용자가 입력한 문자: " + userString);
            if (userString.equalsIgnoreCase("exit")) {
                System.out.println("'exit'를 입력하여 종료됩니다.");
                break;
            }
        }
    }
}
