import java.util.*;
public class MaxProductSubarray{
    public static void main(String args[]){
        int[] nums = new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    public static int maxProduct(int[] nums){
        double prefixpro = 1;
        double suffixpro = 1;
        double max= Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefixpro==0){
                prefixpro=1;
            }
            if(suffixpro==0){
                suffixpro=1;
            }
            prefixpro=prefixpro*nums[i];
            suffixpro=suffixpro*nums[nums.length-i-1];

            max = Math.max(max,Math.max(suffixpro,prefixpro));
        }
        return (int)max;
    }
}