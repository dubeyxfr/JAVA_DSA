package Array;

public class MultiDiem {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 13, 14},
                {12, 13, 14}
        };

        // Optional: print the array to verify
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
