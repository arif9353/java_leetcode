import java.util.*;
public class FindPeakElement{
    public static void main(String args[]){
        int[] nums = new int[]{3,4,3,2,1};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums){
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int low=0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid==0 && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid == nums.length-1 && nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        return -1;
    }
}


/*
 if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2){
            if(nums[0]>nums[1]){
                return nums[0];
            }
            else{
                return nums[1];
            }
        }
        else{
            int min = Integer.MIN_VALUE;
            int low = 0;
            int high = nums.length-1;
            int outmid = low+(high-low)/2;
            if(nums[outmid]>nums[outmid-1]&&nums[outmid]>nums[outmid+1]){
                return nums[outmid];
            }
            low=0;
            high=outmid-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(mid==0){
                    if(nums[mid]>nums[mid+1]){
                        return nums[mid];
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                        return nums[mid];
                    }
                    if(nums[mid]<nums[mid-1]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
            low=outmid+1;
            high=nums.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mid==nums.length-1){
                    if(nums[mid]>nums[mid-1]){
                        return nums[mid];
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(nums[mid]>nums[mid+1] &&)
                }
            }
        }        
*/