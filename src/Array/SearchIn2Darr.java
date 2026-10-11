package Array;

import java.util.Arrays;

public class SearchIn2Darr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {9,8,7},
                {6,5,3}
        };
        int target = 9;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
        for (int rows = 0;rows< arr.length;rows++){
            for (int cols = 0; cols < arr[rows].length ; cols++) {
                if (target == arr[rows][cols]){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

}
