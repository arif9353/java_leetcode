import java.util.*;
public class ReversePairs{
    public static void main(String args[]){
        int[] nums = new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int ans = reversePairs(nums);
        System.out.println(ans);
    }
    public static int reversePairs(int [] nums){
        int ans = mergeSort(nums,0,nums.length-1);
        return ans;
    }
    public static int mergeSort(int[] arr, int si, int ei){
        int count =0;
        if(si>=ei){
            return count;
        }
        int mid = (si+ei)/2;
        count+=mergeSort(arr,si,mid);
        count+=mergeSort(arr,mid+1,ei);
        count+=countPairs(arr,si,mid,ei);
        merge(arr,si,mid,ei);
        return count;
    }
    public static int countPairs(int[] arr, int si, int mid, int ei){
        int count=0;
        int right = mid+1;
        for(int i=si;i<=mid;i++){
            while(right<=ei && arr[i]>(long)2*arr[right]){
                System.out.println("This is arr[right] and arr[i] for "+i+" "+right+" "+arr[right]+" "+arr[i]);
                System.out.println("Entered at "+i+" "+right);
                right++;
            }
            count += (right-(mid+1));
            System.out.println(count);
        }
        return count;
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left;
        int j = mid+1; //iterator for right
        int k = 0; //iterator for temp array;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
}