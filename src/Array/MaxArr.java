package Array;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int result = max(arr);
        System.out.println("Maximum value: " + result);
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
