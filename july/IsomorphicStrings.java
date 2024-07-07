import java.util.*;
public class IsomorphicStrings{
    public static void main(String args[]){
        String s = "foo";
        String t = "bar";
        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }
    public static boolean isIsomorphic(String s, String t){
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        int n = s.length();
        hm1.put((int)s.charAt(0),(int)t.charAt(0));
        hm2.put((int)t.charAt(0),(int)s.charAt(0));
        for(int i=1;i<n;i++){
            if(hm1.containsKey((int)s.charAt(i))){
                int val = hm1.get((int)s.charAt(i));
                if(val != (int)t.charAt(i)){
                    return false;
                }
            }
            hm1.put((int)s.charAt(i),(int)t.charAt(i));
        }
        for(int i=1;i<n;i++){
            if(hm2.containsKey((int)t.charAt(i))){
                int val = hm2.get((int)t.charAt(i));
                if(val != (int)s.charAt(i)){
                    return false;
                }
            }
            hm2.put((int)t.charAt(i),(int)s.charAt(i));
        }
        System.out.println(hm1);
        System.out.println(hm2);
        return true;
    }
}