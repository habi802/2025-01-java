package ch04.sec08;

public class BreakOuterExample {
    public static void main(String[] args) {

        Haha:
        for (int i = 2; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                if (k == 5) {
                    break Haha;
                }
                System.out.printf("%d x %d = %d\n", i, k, i * k);
            }
        }

        System.out.println("-- 끝 --");
    }
}
