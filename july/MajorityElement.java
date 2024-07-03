import java.util.*;
public class MajorityElement{
    public static void main(String args[]){
        int[] nums = new int[]{4,1,3,1,3,3,1,2,3,2,4,2,1,4,4,4,4,4};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length==2){
            if(nums[0]!=nums[1]){
                ans.add(nums[0]);
                ans.add(nums[1]);
            }
            else{
                ans.add(nums[1]);
            }
            return ans;
        }
        else if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        else{
            float frequecy = nums.length/3;
            System.out.println(frequecy);
            int count1 = 1;
            int firstele = Integer.MIN_VALUE;
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1] && nums[i]!=firstele){
                    count1++;
                    if(count1>frequecy){
                        firstele = nums[i];
                        ans.add(firstele);
                        count1=1;
                    }
                }
                if(nums[i]!=nums[i+1]){
                    count1=1;
                }
            }
            System.out.println(count1);
            return ans;
        }
    }
}