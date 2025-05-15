package ch04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 4;
        System.out.println("star: " + star);
        // star = 4
        // ___*
        // __**
        // _***
        // ****

        // star = 5
        // ____*
        // ___**
        // __***
        // _****
        // *****

        for (int i = 1; i <= star; i++) {
            int starCount = star - i;

            for (int k = 0; k < star; k++) {
                System.out.print(k >= starCount ? "*"  : "_");
//                if (k >= starCount) {
//                    System.out.print("*");
//                } else {
//                    System.out.print("_");
//                }
            }

            System.out.println();
        }
        System.out.println("==========");
        for (int i = 1; i <= star; i++) {
            int barCount = star - i;

            for (int k1 = 1; k1 <= barCount; k1++) {
                System.out.print("_");
            }
            for (int k2 = barCount; k2 < star; k2++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
