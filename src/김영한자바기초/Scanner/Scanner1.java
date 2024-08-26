package 김영한자바기초.Scanner;

import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        System.out.printf("> ");
        int a = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        System.out.printf("> ");
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println(a);
        } else if ( a < b) {
            System.out.println(b);
        } else if (a == b) {
            System.out.println("두 수가 같습니다.");
        }
    }



}
