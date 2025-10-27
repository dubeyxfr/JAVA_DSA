package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4};
//        swap(arr,2,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
