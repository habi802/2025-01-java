package ch04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3; // 3~8까지 랜덤값
        System.out.println("star: " + star);
        /*
        star = 3
        *
        **
        ***

        star = 5
        *
        **
        ***
        ****
        *****
        */

        for (int i = 1; i <= star; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
