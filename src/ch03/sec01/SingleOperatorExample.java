package ch03.sec01;

public class SingleOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        System.out.printf("x: %d\n", x);

        x = -x;
        System.out.printf("x: %d\n", x);

        int y = 100 * -1;
        System.out.printf("y: %d\n", y);

        y = y * -1;
        System.out.printf("y: %d\n", y);
    }
}
