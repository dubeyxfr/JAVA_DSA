package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int ans = binarySearch(arr,target);
        System.out.println("Your ans is " +ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start);
            if (target < mid){
                end = mid - 1;
            } else if (target > mid) {
                end = mid + 1;

            }else {
                return mid;
            }


        }
        return -1;

    }
}
