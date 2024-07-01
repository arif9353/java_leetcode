import java.util.*;
public class QuickSort{
    public static void main(String args[]){
        int arr[] = new int[]{5,2,3,6,8,7,4};
        quickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotidx = partition(arr,si,ei);
        quickSort(arr,si,pivotidx-1);
        quickSort(arr,pivotidx+1,ei);
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
}