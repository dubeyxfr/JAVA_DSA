package LeetcodeQuetsions;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
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
}

