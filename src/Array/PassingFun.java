package Array;

import java.util.Arrays;

public class PassingFun {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        chnage(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void chnage(int[] arr){
        arr[0] = 99;
    }
}
