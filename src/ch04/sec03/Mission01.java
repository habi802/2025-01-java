package ch04.sec03;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 16.0); // 0~15 랜덤값

        // switch 이용하여
        // month 값이 12, 1, 2라면 "겨울"
        // month 값이 3, 4, 5라면 "봄"
        // month 값이 6, 7, 8라면 "여름"
        // month 값이 9, 10, 11라면 "가을"
        // 나머지는 "해당 계절이 없습니다."
        System.out.println("month: " + month);
        switch (month) {
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당 계절이 없습니다.");
                break;
        }
    }
}
