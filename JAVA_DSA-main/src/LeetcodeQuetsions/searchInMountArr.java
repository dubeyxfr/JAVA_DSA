package LeetcodeQuetsions;

public class searchInMountArr {
    public static void main(String[] args) {

    }
    int search(int[] arr,int target){
        int peek = peakIndexInMountainArray(arr);
        int firstry = orderAgnosticBS(arr,target,0, peek);
        if (firstry != -1){
            return firstry;
        }
        return orderAgnosticBS(arr,target,peek,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
        // second unoptimized method...;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) return arr[i];
//        }
//        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target,int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid; // target found
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid; // target found
                }
            }
        }

        return -1;
    }
}
