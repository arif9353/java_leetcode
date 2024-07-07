import java.util.*;
public class ReverseWords{
    public static void main(String args[]){
        String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    public static String reverseWords(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        int high = len - 1;
        StringBuilder ans = new StringBuilder();
        while (high >= 0) {
            while (high >= 0 && s.charAt(high) == ' ') {
                high--;
            }
            if (high < 0) break;
            
            int end = high;
            while (high >= 0 && s.charAt(high) != ' ') {
                high--;
            }
            
            if (ans.length() > 0) {
                ans.append(' ');
            }
            ans.append(sb.substring(high + 1, end + 1));
        }
        return ans.toString();
    }
}