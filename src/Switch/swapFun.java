package Switch;

public class swapFun {
    public static void main(String[] args) {
        swap(10, 20);
    }

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
