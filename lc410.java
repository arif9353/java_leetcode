class Solution410 {
    public int checkPossibility(int[] nums, int maxsum){
        int k=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>maxsum){
                k++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        return k;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(low<nums[i]){
                low=nums[i];
            }
        }
        System.out.println(low);
        int high = 0;  
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        System.out.println(high);
        while(low<=high){
            int mid = (low+high)/2;
            int arr = checkPossibility(nums,mid);

            if(arr<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int[] weights = new int[]{7,2,5,10,8};
        int days = 2;
        Solution410 ob = new Solution410();
        int answer =  ob.splitArray(weights,days);
        System.out.println(answer);
    }
}