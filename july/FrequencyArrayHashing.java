import java.util.*;
public class FrequencyArrayHashing{
    public static void main(String args[]){
        int n = 5;
        int[] arr = new int[]{2,3,2,3,5};
        int p=5;
        int[] ans = frequencyCount(arr,n,p);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] frequencyCount(int arr[], int n, int p) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count frequencies of elements within the range 1 to n
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
            }
        }

        // Step 2: Modify the array to contain the frequency of elements from 1 to n
        for (int i = 0; i < n; i++) {
            arr[i] = frequencyMap.getOrDefault(i + 1, 0);
        }
        return arr;
    }
}