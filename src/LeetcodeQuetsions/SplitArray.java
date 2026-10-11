package LeetcodeQuetsions;

public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
        start = Math.max(start,nums[i]);//in the end of the loop it contains the max number of the array.
        end += nums[i];

        }
        while (start<end){
            //try for the middle as the potential ans
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if (sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if (pieces > m){
                start = mid + 1;

            }else {
                end = mid;
            }
        }
        return end; // here is start == end;
    }
}
