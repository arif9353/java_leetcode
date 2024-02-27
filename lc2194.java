import java.util.*;
class Solution2194 {
    public List<String> cellsInRange(String s) {
        char startchar = s.charAt(0);
        char endchar = s.charAt(3);
        int start = Character.getNumericValue(s.charAt(1));
        int end = Character.getNumericValue(s.charAt(4));
        List<String> answer = new ArrayList<>();
        for(char i=startchar;i<=endchar;i++){
            for(int j=start;j<=end;j++){
                answer.add(i+Integer.toString(j));
            }            
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution2194 ob = new Solution2194();
        String s = "A1:F1";
        List<String> res = ob.cellsInRange(s);
        System.out.println(res);
    }
}