import java.util.*;
public class ValidParentheses{
    public static void main(String args[]){
        boolean ans = isValid("]");
        System.out.println(ans);
    }
    public static boolean isValid(String s){
        Stack<Character> stk = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stk.push(s.charAt(i));
                count++;
            }
            else{
                if(count==0){
                    return false;
                }
                char stackk = stk.pop();
                count--;
                if((stackk == '(' && s.charAt(i)!=')')||(stackk == '[' && s.charAt(i)!=']')||(stackk =='{' && s.charAt(i)!='}')){
                    return false;
                } 
            }
            System.out.println(stk);
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
}