class Solution2108 {
    public String firstPalindrome(String[] words) {
        for(String i: words){
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            if(sb.toString().equals(i)){
                return i;
            }
        }
        String res = "";
        return res;
    }
    public static void main(String[] args) {
        Solution2108 ob = new Solution2108();
        String[] words = new String[]{"abc","car","ada","racecar","cool"};
        String res = "";
        res = ob.firstPalindrome(words);
        System.out.println(res);
    }
}