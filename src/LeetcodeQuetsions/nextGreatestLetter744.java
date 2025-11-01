package LeetcodeQuetsions;

public class nextGreatestLetter744 {
    public static void main(String[] args) {
        char[] letters = {'e','e','g','g'};
        System.out.println(nextGreatestLetter(letters, 'g'));
        System.out.println((int)'c');
    }

    public static   char nextGreatestLetter(char[] letters, char target) {
        if ((int)target > (int)letters[letters.length - 1]){
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//
            if ( (int)letters[mid] <= (int) target) {
//

                    start = mid + 1;

            }else {
                end = mid - 1;
            }


        }
//        if(start == letters.length -1){
//            return letters[0];
//        }
//        return letters[start];
        return letters[start % letters.length];
    }
}
