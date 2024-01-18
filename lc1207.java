import java.util.*;
class Solution1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                if(set.contains(count)){
                    return false;
                }
                set.add(count);
                count=1;
            }
        }
        if(set.contains(count)){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
