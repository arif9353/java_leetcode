import java.util.*;
public class PairClass{
    public static void main(String args[]){
        int[] nums = new int[]{5,6,8,9,6,5,5,6};
        Pair ans = getFloorAndCeil(nums,nums.length,7);
        System.out.println(ans);
    }
    public static Pair getFloorAndCeil(int[] arr, int n, int x){
        int maxmin = Integer.MIN_VALUE;
        int minmax = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=x && arr[i]>=maxmin){
                maxmin = arr[i];
            }
            if(arr[i]>=x && arr[i]<=minmax){
                minmax = arr[i];
            }
        }
        if(minmax == Integer.MAX_VALUE){
            minmax = -1;
        }
        if(maxmin == Integer.MIN_VALUE){
            maxmin = -1;
        }
        Pair ans = new Pair(maxmin,minmax);
        return ans;
    }
}