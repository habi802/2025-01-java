package ch04;

public class Mission09 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; // 2~9 사이 랜덤값 생성해주세요.
        System.out.println("dan: " + dan);

        /*
        dan: 2
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        dan: 9
        9 x 1 = 9
        9 x 2 = 18
        ...
        9 x 9 = 81
        */

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}
