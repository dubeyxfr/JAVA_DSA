package Conditionals_Loops;

public class Occurrences {
    public static void main(String[] args) {
        int num = 13839;
        int count = 0;

        while (num > 0) {
            int rem = num % 10; //extract last digit
            if (rem == 3) {
                count++;
            }
            num = num / 10; //remove last digit
        }

        System.out.println(count);
    }
}
