import java.util.*;
public class FourSum{
    public static void main(String args[]){
        int[] nums = new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000};
        List<List<Integer>> ans = fourSum(nums,294967296);
        System.out.println(ans);
    }
    public static List<List<Integer>> fourSum(int[]nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length<4){
            return ans;
        }
        else if(nums.length==4){
            if(((long)nums[0]+(long)nums[1]+(long)nums[2]+(long)nums[3])==target){
                ans.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            }
            return ans;
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = target-sum;
                    int val = hm.getOrDefault(diff,Integer.MIN_VALUE);
                    if(val!=Integer.MIN_VALUE && val!=j && val>k){
                        if((long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[val]==target){
                            ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[val]));
                            k=hm.get(nums[k]);
                            j=hm.get(nums[j]);
                            i=hm.get(nums[i]);
                        }
                    }
                }
                
            }
            
        }
        return ans;
    }
}