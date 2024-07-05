import java.util.*;
public class floorInSorted{
    public static void main(String args[]){
        long[] nums = new long[]{1,2,8,10,11,12,19};
        int ans = findFloor(nums, nums.length, 5);
        System.out.println(ans);
    }
    public static int findFloor(long arr[], int n, long x){
        if(arr[0]>x){
            return -1;
        }
        int low = 0;
        int high=n-1;
        int j=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                j=mid;
            }
        }
        return j;
    }
}