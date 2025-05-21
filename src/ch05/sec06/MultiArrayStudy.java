package ch05.sec06;

public class MultiArrayStudy {
    /*
    int num = 10;

    int[] arr1 = { num, 20, 30 };
    int[] arr2 = { 40, 50, 60 };

    int[][] parent = { arr1, arr2 };

    int[][][] parent2 = null;
    int[][][][] parent3 = null;
     */
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };

        int[][] parent = { arr1, arr2 };
        System.out.println(parent[0][1]); // 20
        System.out.println(parent[1][1]); // 50
    }
}
