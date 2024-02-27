import java.util.*;
class Solution1239 {
    public static int maxLength(List<String> arr) {
        return backtrack(arr, 0, "");
    }
    private static int backtrack(List<String> arr, int index, String current) {
        if (!isUnique(current)) {
            return 0;
        }

        int maxLength = current.length();

        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, i + 1, current + arr.get(i)));
        }

        return maxLength;
    }

    private static boolean isUnique(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            if (count[c - 'a'] > 0) {
                return false;
            }
            count[c - 'a']++;
        }
        return true;
    }
    public static void main(String args[]){
        List<String> arr = new ArrayList<>();
        arr.add("cha");
        arr.add("r");
        arr.add("act");
        arr.add("ers");
        System.out.println(maxLength(arr));
    }
}