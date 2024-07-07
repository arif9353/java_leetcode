import java.util.*;
public class LargestOddNumber{
    public static void main(String args[]){
        String ans = largestOddNumber("35427");
        System.out.println(ans);
    }
    public static String largestOddNumber(String num){
        String ans = "";
        StringBuilder sb = new StringBuilder(num);
        for(int i=0;i<num.length();i++){
            int currnum = num.charAt(i);
            if(currnum%2!=0){
                ans = sb.substring(0,i+1);
            }
        }
        return ans;
    }
}