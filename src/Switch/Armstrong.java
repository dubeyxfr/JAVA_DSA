package Switch;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        System.out.println(num + " is Armstrong value that is " +ArmStrong(num));

    }
    static boolean ArmStrong(int num){
        int Original = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            num/=10;
            sum = sum + rem*rem*rem;
        }
       return sum==Original;
    }
}
