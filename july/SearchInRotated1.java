import java.util.*;
public class SearchInRotated1{
    public static void main(String args[]){
        int[] nums = new int[]{5,4,1,3};
        int ans = search(nums, 5);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}