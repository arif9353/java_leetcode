import java.util.*;
public class MaxNestingDepth{
    public static void main(String args[]){
        int ans = maxDepth("()(())((()()))");
        System.out.print(ans);
    }
    public static int maxDepth(String s){
        int maxcnt =0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>maxcnt){
                    maxcnt=count;
                }
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxcnt;
    }
}