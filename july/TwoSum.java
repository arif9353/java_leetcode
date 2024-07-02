import java.util.*;
public class TwoSum{
    public static void main(String args[]){
        int[] nums= new int[]{3,2,4};
        int [] ans = twoSum(nums,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        HashMap <Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        System.out.println(hs);
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                if(hs.get(target-nums[i])!=i){
                ans[0] = i;
                ans[1] = hs.get(target-nums[i]);
                break;
                }
            }
        }
        return ans;
    }
}