package Switch;

public class Shadowing {
    static int x = 90; //This will be Shadowing  at the line 7.
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//here this X is shadowing the X of the 90.
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
