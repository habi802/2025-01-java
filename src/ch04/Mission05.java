package ch04;

public class Mission05 {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2; // 1) 2~7 사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);

        // starCount = 3;
        // ***
        // starCount = 7;
        // *******
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
    }
}
