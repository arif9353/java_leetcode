import java.util.*;
public class LargestSubarrayWith0sum{
    public static void main(String args[]){
        int[] nums = new int []{-1,1,-1,1};
        int ans = maxLen(nums,nums.length);
        System.out.println(ans);
    }
    public static int maxLen(int[] nums, int n){
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        int maxcount = 0;
        if(prefixSum[0]==0){
            maxcount=1;
        }
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
            if(prefixSum[i]==0 && i+1>maxcount){
                maxcount = i+1;
            }
        }
        System.out.println(Arrays.toString(prefixSum));
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> insert = new ArrayList<>();
            if(hm.containsKey(prefixSum[i])){
                ArrayList<Integer> val = hm.get(prefixSum[i]);
                int listidx = val.get(0);
                int valcount = val.get(1);
                insert.add(i);
                insert.add(valcount+(i-listidx));
            }
            else{
                insert.add(i);
                insert.add(0);
            }
            hm.put(prefixSum[i],insert);
        }
        for(Map.Entry<Integer,ArrayList<Integer>> mapele: hm.entrySet()){
            int key = mapele.getKey();
            ArrayList<Integer> val = mapele.getValue();
            if(val.get(1)>maxcount){
                maxcount = val.get(1);
            }
        }
        return maxcount;
    }
}