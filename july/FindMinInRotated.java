import java.util.*;
public class FindMinInRotated{
    public static void main(String args[]){
        int[] nums = new int[]{3,4,5,1,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(end+start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[start];
    }
}