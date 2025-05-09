package ch04;

public class Misson01 {
    public static void main(String[] args) {
        // 랜덤 숫자 응용
        // 5 ~ 10 사이 랜덤값 나올 수 있도록 해주세요.

        for (int i = 0; i < 1000; i++) {
            int result = (int)(Math.random() * 6.0) + 5;

            if (result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;
            }
        }
        System.out.println("-- 끝 --");
    }
}
