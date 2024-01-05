import java.util.Arrays;
class Solution2870 {
    public int minOperations(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int icount=0;
            int x = arr[i];
            int j=;
            while()
            System.out.println("Count for"+i+"="+icount);
            if(icount%2==0){
                count = count+ icount/2;
            }
            else if(icount%3==0){
                count = count+icount/3;
            }
            else if(icount%5==0){
                count = count + 2;
            }
            else{
                return -1;
            }
            
        }*/
        int count=0;
        for(int i=0;i<arr.length;i++){
            int j=arr.length-1;
            int icount=0;
            while(i<=j){
                int x=arr[i];
                if(arr[j]!=x){
                    j--;
                }
                else{
                    icount = j-i+1;
                }
            }
            if(icount%2==0){
                count = count + icount/2;
            }
            else if(icount%3==0){
                count = count + icount/3;
            }
            else if(icount%5==0){
                count = count + icount/5;
            }
            else{
                return -1;
            }
            i=j-1;
        }
        return count;
    }
    public static void main(String args[]){
        Solution2870 ob = new Solution2870();
        int[] nums = new int[]{2,3,3,2,2,4,2,3,4};
        int y =ob.minOperations(nums);
        System.out.println(y);
    }
}