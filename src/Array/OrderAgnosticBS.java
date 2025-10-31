package Array;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int target = 4;
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid; // target found
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid; // target found
                }
            }
        }

        return -1; // target not found
    }

}
