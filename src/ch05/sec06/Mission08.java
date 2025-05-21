package ch05.sec06;

public class Mission08 {
    public static void main(String[] args) {
        int[] arr = { 77, 1, 34, 109, -2, -21, 21, 101, 48 };

        // arr 배열에서 가장 작은 값 찾아서 출력
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        System.out.println("최솟값: " + min);
    }
}
