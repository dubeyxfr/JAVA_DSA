package Array;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {12,13,14,15};
        System.out.println(findNumofeven(nums));
    }
    static int findNumofeven(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noOfDigits= digits(num);
        return noOfDigits % 2 == 0;
    }


    static int digits(int num){
        int counts =  0;
        while(num> 0){
            counts++;
            num /=10;
        }
        return counts;
    }
}
