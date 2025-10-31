package Array;

public class linearSearch {
    public static void main(String[] args) {
       int[] arrnum = {1,2,34,5};
       int target = 34;
       int ans = LinearSearch(arrnum ,target);
        System.out.println("At the Index = " +ans);

    }
    static int LinearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
          int element = arr[i];
          if (element == target){
              return i;
          }
        }
        //no on will excute its will return -1!!
        return -1;
    }

    public static class FindPeakElement {
        public static void main(String[] args) {
            int[] arr = {1,2,1,3,5,6,4};
            System.out.println(findPeakElement(arr));

        }
        public static int findPeakElement(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while(start <end){
                int mid = (start + end)/2;
                if(arr[mid] > arr[mid + 1]){
                    end = mid;
                }
                else{
                    start = mid + 1;
                }
            }
            return start;
        }
    }
}
