package 김영한자바기초.Scanner;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        while (true) {
            System.out.println("이름을 입력하세요.");
            name = scanner.nextLine();
            if (name.equals("종료")){
                break;
            }
            System.out.println("나이를 입력하세요.");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);

        }
    }
}
