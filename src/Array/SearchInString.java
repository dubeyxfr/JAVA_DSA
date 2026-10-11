package Array;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Prashant";
        char target = 'P';
        boolean ans = search(str,target);
        System.out.println("Your Search is " +ans);
    }
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
        //By using For each loop!!!
        for (char ch :  str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
