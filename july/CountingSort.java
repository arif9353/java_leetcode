import java.util.*;
public class CountingSort{
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,8,7,9,5,7,8,8};
        countingSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        int[] countArr = new int[max+1];
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        int count =0;
        for(int i=1;i<countArr.length;i++){
            while(countArr[i]>0){
                arr[count] = i;
                count++;
                countArr[i]--;
            }
        }
    }
}