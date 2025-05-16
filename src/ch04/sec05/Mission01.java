package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        합계를 구할 숫자를 입력하세요. (종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
        합계: 1000
         */

        boolean run = true;
        int total = 0;
        System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");
        while (run) {
            System.out.print(">> ");
            int num = scanner.nextInt();

            if (num == 0) {
                run = false;
            } else {
                total = total + num;
            }
        }
        System.out.println("합계: " + total);
    }
}
