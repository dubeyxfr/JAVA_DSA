package LeetcodeQuetsions;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = sum(arr, target);

        if (result[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }

    static int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
