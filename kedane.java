import java.util.*;
class kedane{
    public static int maxSumOfSubarrayOfNeg(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        return max;
    }
    public static int maxSumOfSubarrayOfPositive(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            int sum = numbers[i]+currSum;
            if(sum>0){
                currSum=sum;
            }
            if(currSum>=maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,1,2,1,5,3};
        int [] dummy = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            dummy[i]=numbers[i];
        }
        Arrays.sort(dummy);
        if(dummy[numbers.length-1]<0){
            int result = maxSumOfSubarrayOfNeg(numbers);
            System.out.println(result); 
        }
        else{
            int result = maxSumOfSubarrayOfPositive(numbers);
            System.out.println(result); 
        }
    }
}