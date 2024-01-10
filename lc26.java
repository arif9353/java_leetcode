class Solution26 {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String args[]){
        Solution26 ob = new Solution26();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int ans = ob.removeDuplicates(nums);
        System.out.println(ans);
    }
}
