package ch04.sec08;

import java.util.Scanner;

public class Mission01 {
    /*
    (프린트 반복 실행)
    -----------------------------------
    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
    -----------------------------------
    선택 >

    (실행 예시)
    선택 > 1 (엔터)
    예금액 > 10000 (엔터)

    [[ 프린트 ]]
    선택 > 2 (엔터)
    출금액 > 2000 (엔터)

    [[ 프린트 ]]
    선택 > 3 (엔터)
    잔고 > 8,000원

    [[ 프린트 ]]
    선택 > 4 (엔터)

    프로그램 종료
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        Atm:
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 > ");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.print("예금액 > ");
                    int input = scanner.nextInt();
                    balance += input;
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    int output = scanner.nextInt();
                    if (balance - output < 0) {
                        System.out.println("잔고가 부족합니다.");
                    } else {
                        balance -= output;
                    }
                    break;
                case 3:
                    System.out.printf("잔고 > %,d원\n", balance);
                    break;
                case 4:
                    break Atm;
                default:
                    System.out.println("1~4번 중에 입력해 주세요.");
                    break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
