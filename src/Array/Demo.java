package Array;

public class Demo {
    public static void main(String[] args) {
        int[][] arr2d = {
                {18, 19, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        int ans = search(arr2d, -4);
        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + ans);
        }
    }

    static int search(int[][] arr2d, int target) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] == target) {
                    System.out.println("Target found at position: (" + i + ", " + j + ")");
                    return 1;
                }
            }
        }
        return -1;
    }
}
