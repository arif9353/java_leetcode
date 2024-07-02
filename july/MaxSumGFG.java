import java.util.*;
public class MaxSumGFG{
    public static void main(String args[]){
        long[] nums = new long[]{5,4,3,1,6};
        long ans = pairWithMaxSum(nums, nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.print(ans);
    }
    public static long pairWithMaxSum(long arr[], long N){
        long[] num = new long[arr.length];
        num[0] = arr[0];
        for(int i=1;i<num.length;i++){
            num[i] = arr[i-1] + arr[i];
        }
        Arrays.sort(num);
        return num[num.length-1];
    }
}