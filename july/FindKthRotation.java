import java.util.*;
public class FindKthRotation{
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int ans = findKRotation(arr);
        System.out.println(ans);
    }
    public static int findKRotation(List<Integer> arr){
        int low=0;
        int high=arr.size()-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr.get(mid)>arr.get(high)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
}