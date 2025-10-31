package Array;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,14,16,18};
        System.out.println(binarySearch(arr,15));

    }
    public static int binarySearch(int[] arr , int target){
        int s = 0 ;
        int e = arr.length -1;
        while(s<= e){
            int mid  = s + (e-s)/2;
            if(arr[mid] == target || (arr[mid+1] > target && arr[mid] < target )){
                return arr[mid+1];
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

        }
        return arr[s];
    }
}
