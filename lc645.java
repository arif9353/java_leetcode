class Solution645 {
    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        int miss=0;
        int dup=0;
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                dup=i;
            }
            if(arr[i]==0){
                miss=i;
            }
        }
        answer[0]=dup;
        answer[1]=miss;
        return answer;
    }
    public static void main(String args[]){
        int[] nums = new int[]{1,2,2,4};
        int[] answer = findErrorNums(nums);
        System.out.print("["+answer[0]+","+answer[1]+"]");
    }
}