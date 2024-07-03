import java.util.*;
public class SubArraySum{
    public static void main(String args[]){
        int[] nums = new int[]{3,4,5};
        int ans = subarraySum(nums,3);
        System.out.print(ans);
    }
    public static int subarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(prefixSum[i]==k){
                count++;
            }
        }
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = prefixSum[j]-prefixSum[i-1];
                if(sum==k){
                    count++;
                } 
            }
        }
        return count;
    }
}