import java.util.*;
public class RomanToInteger{
    public static void main(String args[]){
        int ans = romanToInt("MCMXCIV");
        System.out.println(ans);
    }
    public static int romanToInt(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        if(s.length()==1){
            return hm.get(s.charAt(0));
        }
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            int curr = hm.get(s.charAt(i));
            if(i>0){
                int prev = hm.get(s.charAt(i-1));
                if(curr>prev){
                    sum+=(curr-prev);
                    i--;
                    continue;
                }
            }
            sum+= curr;
        }
        return sum;
    }
}