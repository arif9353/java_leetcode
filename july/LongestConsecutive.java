import java.util.*;
public class LongestConsecutive{
    public static void main(String args[]){
        //
        int[] nums = new int[]{1,2,3,4,101,102,103,104,105,201,202,203,204,205,206};
        int length = longestConsecutive(nums);
        System.out.println(length);
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeSet <Integer> ts = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            ts.add(nums[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: ts){
            al.add(i);
        }
        int count = 1;
        int maxcount = 1;
        for(int i=0;i<al.size()-1;i++){
            if((al.get(i+1)-al.get(i))==1){
                count++;
                if(maxcount<=count){
                    maxcount=count;
                }
            }
            else{
                count = 1;
            }
        }
        return maxcount;
    }
}