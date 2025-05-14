package ch04;

public class Mission11 {
    public static void main(String[] args) {
        // 2 ~ 9단 구구단 출력 단수가 바뀔 때 개행 처리
        /*
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        3 x 1 = 3
        3 x 2 = 6
        ...
        3 x 9 = 27

        ...

        9 x 9 = 81
        */

        for (int i = 2; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%d x %d = %d\n", i, k, i * k);
            }

            System.out.println();
        }
    }
}
