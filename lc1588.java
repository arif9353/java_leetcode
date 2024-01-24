import java.util.*;
class Solution1588 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=((((n-i)*(i+1))+1)/2)*arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int[] arr = new int[]{1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}