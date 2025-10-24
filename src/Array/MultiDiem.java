package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDiem {
    public static void main(String[] args) {
//        int[][] arr = {
//                {12, 13, 14},
//                {12, 13, 14}
//        };
//
//        // Optional: print the array to verify
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int rows = 0;rows< arr.length;rows++){
            for (int cols = 0; cols < arr.length;cols++){
                arr[rows][cols] = in.nextInt();
            }
        }
        for (int rows = 0;rows< arr.length;rows++){
            for (int cols = 0; cols < arr.length;cols++){
                System.out.print(arr[rows][cols] + " ");
            }
            System.out.println();
        }

    }
}
