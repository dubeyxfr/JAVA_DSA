package Array;

public class linearSearch {
    public static void main(String[] args) {
       int[] arrnum = {1,2,34,5,} ;
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
}
