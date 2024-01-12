class Solution1704 {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        int count1=0;
        int count2=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count1++;
            }
        }
        for(int i=len;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }            
        return false;
    }
    public static void main(String args[]){
        Solution1704 ob = new Solution1704();
        String s = "textbook";
        boolean answer = ob.halvesAreAlike(s);
        System.out.println(answer);
    }
}