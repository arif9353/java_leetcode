import java.util.*;
public class SearchInsert{
    public static void main(String args[]){
        int[] nums = new int[]{1,3,5,6};
        int ans = searchInsert(nums,0);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums[0]>target){
            return 0;
        }
        int low = 0;
        int high = nums.length-1;
        int i=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
                i=mid;
            }
        } 
        return i+1;
    }    
}