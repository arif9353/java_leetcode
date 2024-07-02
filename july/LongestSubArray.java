import java.util.*;
public class LongestSubArray {
    public static int lenOfLongSubarr(int[] A, int N, int K)
    {
        HashMap<Integer, Integer> sum_index_map = new HashMap<>();
        int maxLen = 0;
        int prefix_sum = 0;

        for (int i = 0; i < N; i++) {
            prefix_sum += A[i];
            System.out.println(prefix_sum);
            if (prefix_sum == K) {
                maxLen = i + 1;
                System.out.println("THISS"+maxLen);
            }
            else if (sum_index_map.containsKey(prefix_sum - K)) {
                System.out.println("THIS IS ARIF"+(prefix_sum-K));
                maxLen = Math.max(maxLen,i - sum_index_map.get(prefix_sum - K));
            }
            if (!sum_index_map.containsKey(prefix_sum)) {
                sum_index_map.put(prefix_sum, i);
            }
        }
            System.out.println(sum_index_map);
        return maxLen;
    }
    public static void main(String args[]){
        int[] nums = new int[]{10,5,2,7,1,9};
        int ans = lenOfLongSubarr(nums,nums.length,15);
        System.out.println(ans);
    }
}