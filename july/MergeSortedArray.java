import java.util.*;
public class MergeSortedArray{
    public static void main(String args[]){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i=m-1;
        int j=n-1;
        int k=(m+n)-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}