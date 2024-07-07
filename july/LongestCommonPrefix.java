import java.util.*;
public class LongestCommonPrefix{
    public static void main(String args[]){
        String[] strs= new String[]{"flower","flow","fling"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==1){
            return strs[0];
        }
        int minlength = Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<=minlength){
                idx = i;
                minlength=strs[i].length();
            }
        }
        StringBuilder sb = new StringBuilder(strs[idx]);
        for(int i=0;i<strs.length;i++){
            if(i==idx){
                continue;
            }
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)!=strs[i].charAt(j)){
                    StringBuilder innerans = new StringBuilder();
                    innerans.append(sb.substring(0,j).toString());
                    sb = innerans;
                }
            }
        }
        return sb.toString();
    }
}