import java.util.*;
class Solution1657 {
    public boolean closeStrings(String word1, String word2) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0;i<word1.length();i++){
            arr1[word1.charAt(i) - 'a']++;
        }
        for(int i=0;i<word2.length();i++){
            arr2[word2.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if((arr1[i]==0) != (arr2[i]==0)){
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Solution1657 ob =new Solution1657();
        String a = "cabbba";
        String b = "abbccc";
        Boolean answer = ob.closeStrings(a, b);
        System.out.println(answer);
    }
}