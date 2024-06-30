import java.util.*;
public class lc1838{
    public static void main(String args[]){
        int[] nums = new int[]{3,9,6};
        quickSort(nums, 0, nums.length -1);
        int[] prefixsum = prefixSum(nums);
        int k=2;
        int maxFrequecy = Integer.MIN_VALUE;
        //for(int i=0;i<nums.length;i++){
        //    int result = resultBinarySearch(nums, 0, i, prefixsum, k);
        //    if(result>=maxFrequecy){
        //        maxFrequecy=result;
        //    }
        //}

        System.out.println("Sorted array: " + Arrays.toString(nums));
        System.out.println("Prefix sum: " + Arrays.toString(prefixsum));
        for (int i=0;i<nums.length;i++){
            int result = resultBinarySearch(nums, prefixsum,k, i);
            if(result>=maxFrequecy){
                maxFrequecy = result;
            }
        }
        System.out.println(maxFrequecy);
    }
   
   
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr, low, pi -1);
            quickSort(arr, pi+1, high);
        }
    }
    
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    
    
    public static int[] prefixSum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1;i<ans.length;i++){
            ans[i] = nums[i]+ans[i-1];
        }
        return ans;
    }
    
    
    public static int resultBinarySearch(int[] arr, int[] prefixArr, int k, int target_index){
        int result =0;
        int l=0;
        int r=target_index;
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println(mid);
            int count = r-mid+1;
            int windowSum = count * arr[target_index];
            int originalSum = prefixArr[target_index]-prefixArr[mid]+arr[mid];
            System.out.println("Count: " + count);
            System.out.println("WindowSum: " + windowSum);
            System.out.println("OriginalSum: " + originalSum);
            if((windowSum-originalSum)>k){
                l = mid+1;
            }
            else{
                result = mid;
                r = mid - 1;
            }
        }
        return (target_index - result+1);
    }
}