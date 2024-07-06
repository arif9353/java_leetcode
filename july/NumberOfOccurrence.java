import java.util.*;
public class NumberOfOccurrence{
    public static void main(String args[]){
        int[] nums = new int[]{1, 3, 4};
        int ans = count(nums, nums.length, 3);
        System.out.println(ans);
    }
    public static int count(int[] arr, int n, int x){
        int start = search(arr,x,true);
        int end = search(arr,x,false);
        if(end==-1){
            return 0;
        }
        return end-start+1;
    }
    public static int search(int[] arr, int target, boolean isVerfied){
        int low =0;
        int high = arr.length-1;
        int i =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<target){
                low = mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                if(target == arr[mid]){
                    i = mid;
                    if(isVerfied){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
            }
        }
        System.out.println(i);
        return i;
    }
}