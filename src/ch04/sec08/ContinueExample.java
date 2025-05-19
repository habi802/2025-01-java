package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // 이 라인은 수정 불가
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        // 출력 결과
        // 2 4 6 8 10
    }
}
