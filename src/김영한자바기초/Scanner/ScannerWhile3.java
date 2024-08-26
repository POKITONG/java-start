package 김영한자바기초.Scanner;
import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력해 주세요 : ");
            int num = scanner.nextInt();
            sum += num;
            System.out.println(sum);
            if (num == 0) {
                break;
            }
        }
    }
}
