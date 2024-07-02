import java.util.*;
public class LC53_Kedane{
    public static void main(String args[]){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.print(ans);
    }
    public static int maxSubArray(int[] nums) {
        int flag =0;
        int negmax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                flag = 1;
            }
            else{
                flag =0;
                break;
            }
            if(nums[i]>negmax){
                negmax = nums[i];
            }
        }
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if((cs+nums[i])<0){
                cs = 0;
            }
            else{
                cs = cs+nums[i];
            }
            if(ms<=cs){
                ms=cs;
            }
        }
        if(flag ==0){
            return ms;
        }
        else{
            return negmax;
        }
    }
}