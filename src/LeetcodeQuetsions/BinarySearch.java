package LeetcodeQuetsions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println("At the index no " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }

        return -1; // target not found
    }
}
