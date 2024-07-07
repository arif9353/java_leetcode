import java.util.*;
public class ValidAnagram{
    public static void main(String args[]){
        boolean ans = isAnagram("rat","car");
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t){
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            arr[val-'a']++;
        }
        for(int i=0;i<t.length();i++){
            int val = t.charAt(i);
            arr[val-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}