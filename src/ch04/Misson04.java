package ch04;

import java.util.Scanner;

public class Misson04 {
    public static void main(String[] args) {
        // int score = (int)(Math.random() * 201); // 0 ~ 200 사이의 랜덤값
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요: ");
        int score = scan.nextInt();

        // 만약 score 값이 100 ~ 90점 사이면 A 학점
        // 만약 score 값이 80 ~ 89점 사이면 B 학점
        // 만약 score 값이 70 ~ 79점 사이면 C 학점
        // 만약 score 값이 70점 미만이면 D 학점
        // 만약 score 값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

        System.out.printf("%d점: %s\n", score, (score > 100 || score < 0) ? "측정 불가" : (score >= 90 ? "A학점" : (score >= 80 ? "B학점" : (score >= 70 ? "C학점" : "D학점"))));

        System.out.println("-----끝-----");
    }
}
