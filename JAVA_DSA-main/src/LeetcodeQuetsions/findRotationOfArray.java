package LeetcodeQuetsions;

public class findRotationOfArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("No of Rotation in array are "+ countRotation(arr));


    }
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return 0;
        }
        return pivot + 1;
    }




 /*  my approach for the Rotation in the Array!!!!
  static int RotationCount(int[] arr) {
        int pivot = findPivot(arr);
        int start = 0;
        while (start <= pivot){
            return pivot + 1;
        }
        return -1;
    }

  */

    // my approach....
    // Normal approach of the this question
//    static int countRotations(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                return i + 1; //count of the rotations
//            }
//        }
//        return 0; //not rotated
//    }
    // binary search approach
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (mid <end && arr[mid] > arr[mid + 1] ){
                return mid;
            }
            if (mid < end && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                return arr[start];
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
