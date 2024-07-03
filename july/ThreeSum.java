import java.util.*;
public class ThreeSum{
    public static void main(String args[]){
        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0){
                break;
            }
            for(int j=i+1;j<nums.length-1;j++){
                List<Integer> subal = new ArrayList<>();
                int sumoftwo = nums[i]+nums[j];
                int diff = 0 - sumoftwo;
                int val = hm.getOrDefault(diff,-1);
                if(val!=-1){
                    if(val!=i && val>j){
                        List<Integer> testing = new ArrayList<>();
                        subal.add(nums[i]);
                        subal.add(nums[j]);
                        subal.add(nums[val]);
                        ans.add(subal);
                    }
                }
                j=hm.get(nums[j]);
            }
            i=hm.get(nums[i]);
        }
        return ans;
    }
}