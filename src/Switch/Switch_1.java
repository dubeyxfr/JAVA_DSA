package Switch;

import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Fruit Name: ");
        String fruit = in.next();
        switch (fruit){
            case "mango":
                System.out.println("KIng of the Fruits");
                break;
            case "Apple":
                System.out.println("Red sweet Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruits");
                break;
            default:
                System.out.println("Enter Valid Fruit Name");
        }
      
    }
}
