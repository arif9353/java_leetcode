class Solution1347 {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[t.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']--;
        }
        int count =0;
        for(int i=0;i<26;i++){
            count += Math.max(0, arr[i]);
        }
        return count;
    }
    public static void main(String args[]){
        Solution1347 ob = new Solution1347();
        String s = "leetcode";
        String t = "practice";
        int answer = ob.minSteps(s, t);
        System.out.println(answer);
    }
}