package ch04;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2 \t 3 x 1 = 3 \t 4 x 1 = 4 ... 9 x 1 = 9
        2 x 2 = 4 \t 3 x 2 = 6 \t 4 x 2 = 8 ... 9 x 2 = 18
        ...
        2 x 9 = 18 \t 3 x 9 = 27 \t 4 x 9 = 36 ... 9 x 9 = 81
        */
        for (int i = 1; i <= 9; i++) {
            for (int k = 2; k <= 9; k++) {
                System.out.printf("%d x %d = %d\t", k, i, i * k);
            }

            System.out.println();
        }
    }
}
