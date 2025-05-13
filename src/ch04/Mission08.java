package ch04;

public class Mission08 {
    public static void main(String[] args) {
        // 1 ~ 100 모두 더한 값 출력하세요.
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }

        System.out.println("sum: " + sum);
    }
}
