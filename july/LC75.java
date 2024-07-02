import java.util.*;
public class LC75{
    public static void main(String args[]){
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count0 = 0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0: count0++;
                    hm.put(nums[i],count0);
                    break;
                case 1: count1++;
                    hm.put(nums[i],count1);
                    break;
                case 2: count2++;
                    hm.put(nums[i],count2);
                    break;
                default: System.out.print("non-exist");
            }
        }
        int i=0;
        while(hm.get(0)!=0){
            int val = hm.get(0);
            nums[i] = 0;
            hm.put(0,val-1);
            i++;
        }
        while(hm.get(1)!=0){
            int val = hm.get(1);
            nums[i] = 1;
            hm.put(1,val-1);
            i++;
        }
        while(hm.get(2)!=0){
            int val = hm.get(2);
            nums[i] = 2;
            hm.put(2,val-1);
            i++;
        }
    } 
}