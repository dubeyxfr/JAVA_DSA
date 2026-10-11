package Switch;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        System.out.println(isPrime(num));


    }
    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        int c = 2;
        while (c*c <=num ){
            if (num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
