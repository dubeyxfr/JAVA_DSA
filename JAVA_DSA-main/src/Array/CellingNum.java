package Array;

public class CellingNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8};
        int target = 6;
        int ans = celling(arr,target);
        System.out.println(ans);
    }
    static int celling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid] ) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else if (target == arr[mid]){
                return mid; // target found
            }
            else {

            }
        }
        return -1;

    }
}
