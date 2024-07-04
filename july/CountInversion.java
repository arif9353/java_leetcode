import java.util.*;
public class CountInversion{
    public static void main(String args[]){
        long[] nums = new long[]{2,4,1,3,5};
        long ans = inversionCount(nums,nums.length);
        System.out.println(ans);
    }
    public static long inversionCount(long arr[], int n){
        long ans = mergeSort(arr,0,n-1);
        return ans;
    }
    public static long mergeSort(long arr[], int si, int ei){
        long count =0;
        if(si>=ei){
            return count;
        }
        int mid = si+(ei-si)/2;
        count+= mergeSort(arr, si,mid);
        count+=mergeSort(arr,mid+1,ei);
        count +=merge(arr,si,mid,ei);
        return count;
    }
    public static long merge(long[] arr, int si, int mid, int ei){
        Long[] temp = new Long[ei-si+1];
        int i=si;
        int j=mid+1;
        int k =0;
        long count =0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
                count+=(mid-i+1);
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }        
        return count;
    }
}





// TreeMap<Long,Integer> tm = new TreeMap<>();
//         long count =0;
//         for(int i=0;i<n;i++){
//             tm.put(arr[i],i);
//         }
//         System.out.println(tm);
//         List<Map.Entry<Long,Integer>> convertedList = new ArrayList<>(tm.entrySet());
//         System.out.println(convertedList);
//         for(int i=convertedList.size()-1;i>=1;i--){
//             Map.Entry<Long,Integer> mapele1 = convertedList.get(i);
//             Map.Entry<Long,Integer> mapele2 = convertedList.get(i-1);
//             int idx1 = mapele1.getValue();
//             int idx2 = mapele2.getValue();
//             if(idx1<idx2){
//                 System.out.println(idx1+" "+idx2);
//                 count++;
//             }
//         }
//         return count;