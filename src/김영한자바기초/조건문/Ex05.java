package 김영한자바기초.조건문;

public class Ex05 {
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
        }
       /* if (grade.equals("A")) {
            System.out.println("탁월한 성과입니다!");
        } else if (grade.equals("B")) {
            System.out.println("좋은 성과입니다!");
        } else if (grade.equals("C")) {
            System.out.println("준수한 성과입니다!");
        } else if (grade.equals("D")) {
            System.out.println("향상이 필요합니다.");
        } else if (grade.equals("F")) {
            System.out.println("불합격입니다.");
        }*/
    }
}
