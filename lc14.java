import java.util.*;
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return res.toString();
            }
            res.append(first.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Solution14 ob = new Solution14();
        String[] strs = new String[]{"flower","flow","flight"};
        String res = ob.longestCommonPrefix(strs);
        System.out.println(res);
    }
}