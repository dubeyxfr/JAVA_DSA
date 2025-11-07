package LeetcodeQuetsions;

public class findRotationOfArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1; //count of the rotations
            }
        }
        return 0; //not rotated
    }
}
