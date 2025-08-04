
// import java.util.*;
public class reverse_string {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "  hello world  ";
        String result = solution.reverseWords(s);

        System.out.println("Input: \"" + s + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}

class Solution {

    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        int n = arr.length;
        String str = "";
        for (int i = n - 1; i >= 1; i--) {
            str += arr[i] + " ";
        }
        return str += arr[0];
    }
}
