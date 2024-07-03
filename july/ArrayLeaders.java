import java.util.*;
public class ArrayLeaders{
    public static void main(String args[]){
        //31,40,93,40,98}
        int[] nums = new int[]{10,4,2,4,1};
        ArrayList<Integer> al = leaders(nums.length,nums);
        System.out.println(al);
    }
    public static ArrayList<Integer> leaders(int n,int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>=max){
                max = nums[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}