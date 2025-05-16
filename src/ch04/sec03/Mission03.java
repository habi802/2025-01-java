package ch04.sec03;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt(); // -10, 0, 120
        System.out.println("score: " + score);

        /*
            100점 초과이거나 0점 미만이면 "잘못된 점수입니다." 출력
            100점이면 A+
            98점 이상이면 A+
            94 이상 97 이하 A0
            90 이상 93 이하 A-

            88 이상 89 이하 B+
            84 이상 87 이하 B0
            80 이상 83 이하 B-

            78 이상 79 이하 C+
            74 이상 77 이하 C0
            70 이상 73 이하 C-

            나머지 D
        */

        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
//            if (score >= 98) {
//                System.out.println("A+");
//            } else if (score >= 94) {
//                System.out.println("A0");
//            } else if (score >= 90) {
//                System.out.println("A-");
//            } else if (score >= 88) {
//                System.out.println("B+");
//            } else if (score >= 84) {
//                System.out.println("B0");
//            } else if (score >= 80) {
//                System.out.println("B-");
//            } else if (score >= 78) {
//                System.out.println("C+");
//            } else if (score >= 74) {
//                System.out.println("C0");
//            } else if (score >= 70) {
//                System.out.println("C-");
//            } else {
//                System.out.println("D");
//            }
            String grade = "D";
            String sign = "";

            if (score == 100) {
                grade = "A";
                sign = "+";
            } else if (score >= 70) {
                int result1 = score / 10;
                switch (result1) {
                    case 9, 10:
                        grade = "A";
                        break;
                    case 8:
                        grade = "B";
                        break;
                    case 7:
                        grade = "C";
                        break;
                }

                int result2 = score % 10;
                switch (result2) {
                    case 8, 9:
                        sign = "+";
                        break;
                    case 4, 5, 6, 7:
                        sign = "0";
                        break;
                    case 0, 1, 2, 3:
                        sign = "-";
                        break;
                }
            }

            System.out.println(grade + sign);
        }
    }
}
