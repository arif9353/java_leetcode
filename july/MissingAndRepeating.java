import java.util.*;
public class MissingAndRepeating{
    public static void main(String args[]){
        int[] nums = new int[]{12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int[] ans = findTwoElement(nums,nums.length);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findTwoElement(int arr[], int n){
        HashMap<Integer, Integer> hm= new HashMap<>();
        long expectedSum = (long)n*(n+1)/2;
        int[] ans = new int[2];
        long actualSum = 0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            actualSum+=arr[i];
        }
        System.out.println(hm);
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> mapele:hm.entrySet()){
            int key = mapele.getKey();
            int value = mapele.getValue();
            if(value>max){
                max = value;
                ans[0] = key;
            }        
        }
        for(int i=1;i<=n;i++){
            if(!hm.containsKey(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}