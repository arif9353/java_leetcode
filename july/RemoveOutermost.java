import java.util.*;
public class RemoveOutermost{
    public static void main(String args[]){
        String s = "((())())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }
    public static String removeOuterParentheses(String s){
        if(s.length()<=2){
            return "";
        }
        int open = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                if(open>1){
                    sb.append('(');
                }
            }
            else{
                if(open>1){
                    sb.append(')');
                }
                open--;
            }
        }
        return sb.toString();
    }
}