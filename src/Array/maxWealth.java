package Array;
//second Question
public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            //now we have sum of accounts of person.
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
