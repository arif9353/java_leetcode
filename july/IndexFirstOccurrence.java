import java.util.*;
public class IndexFirstOccurrence{
    public static void main(String args[]){
        int ans = findMatching("gffggg","gfg");
        System.out.println(ans);
    }
    public static int findMatching(String text, String pat){
        int flag=0;
        for(int i=0;i<=text.length()-pat.length();i++){
            int start=i;
            for(int j=0;j<pat.length();j++){
                if(pat.charAt(j)!=text.charAt(i)){
                    flag=0;
                    break;
                }
                flag=1;
                i++;
            }
            if(flag==1){
                return start;
            }
            i=start;
        }
        return -1;
    }
}