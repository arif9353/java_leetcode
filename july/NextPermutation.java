import java.util.*;
public class NextPermutation{
    public static void main(String args[]){
        int[] nums = new int[]{1,2,0,3,0,1,2,4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int flag =0;
        int smallend = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                flag=0;
            }
            else{
                flag =1 ;
                break;
            }
        }
        if(flag==0){
            Arrays.sort(nums);
        }
        else{
            for(int i=nums.length-1;i>1;i--){
                if(nums[i]<=nums[i-1]){
                    continue;
                }
                smallend = i-1;
                break;
            }
            System.out.println(smallend);
            int eleval = findMax(nums,smallend);
            int temp = nums[smallend];
            nums[smallend] = nums[eleval];
            nums[eleval] = temp;
            quickSort(nums,smallend+1, nums.length-1);
        }
    }
    public static void quickSort(int[] nums, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotidx = partition(nums,si,ei);
        quickSort(nums,si,pivotidx-1);
        quickSort(nums,pivotidx+1,ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];    
        arr[i] = temp;        
        return i;
    }
    public static int findMax(int[] nums, int si){
        int eleval = nums[si];
        int smallest = Integer.MAX_VALUE;
        int smallestidx = 0;
        for(int i=si+1;i<nums.length;i++){
            if(nums[i]>eleval && nums[i]<smallest){
                smallest = nums[i];
                smallestidx = i;
            }
        }
        System.out.println(smallestidx);
        return smallestidx;
    }
}