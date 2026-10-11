package Array;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arrnum = {1,2,34,5,} ;
        int target = -1;
        int ans = SearchInRange(arrnum ,target,0,4);
        System.out.println("At the Index = " +ans);

    }
    static int SearchInRange(int[] arr,int target, int start,int end){
        if (arr.length == 0){return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        //no on will excute its will return -1!!
        return -1;
    }
}
