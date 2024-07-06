import java.util.*;
public class SingleElementInSorted{
    public static void main(String args[]){
        int[] nums = new int[]{3,7,7,10,10,11,11};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}