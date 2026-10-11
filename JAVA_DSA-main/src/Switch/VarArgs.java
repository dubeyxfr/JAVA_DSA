package Switch;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(2,3,4,5,6,90,8);//its is Know as Variable length arguments.
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));//change the arr into toString!!
    }
}
