package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;

        int score = 93;

        if (score >= 98) {
            System.out.println("점수가 98보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 98보다 낮습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
