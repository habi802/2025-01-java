package ch05.sec06;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr = { 77, 1000, 34, 109, 200, 300, 21, 101, 48 };

        // arr 배열에서 가장 큰 값 찾아서 출력
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println("최댓값: " + max);
    }
}
