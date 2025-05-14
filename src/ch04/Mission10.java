package ch04;

public class Mission10 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6 사이 랜덤값
        System.out.printf("star: %d\n", star);
        /*
        star: 3
        ***
        ***
        ***

        star: 5
        *****
        *****
        *****
        *****
        *****
        */

        //int totalCount = star * star;
        for (int i = 1; i <= star; i++) {
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            System.out.println();

//            System.out.print("*");
//
//            if (i % star == 0) {
//                System.out.println();
//            }
        }
    }
}
