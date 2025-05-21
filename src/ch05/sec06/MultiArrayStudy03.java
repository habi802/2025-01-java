package ch05.sec06;

public class MultiArrayStudy03 {
    public static void main(String[] args) {
        int[][][] arr = {
                {
                        { 10, 20, 30 },
                        { 40, 50, 60, 80, 50 }
                },
                {
                        { 70, 80, 90 },
                        { 100, 110, 120 }
                }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                for (int n = 0; n < arr[i][k].length; n++) {
                    System.out.println(arr[i][k][n]);
                }
            }
        }
    }
}
