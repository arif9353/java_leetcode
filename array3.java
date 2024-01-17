public class array3 {
    public static int stockProfit(int arr[]){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=index;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max-min;
    }
    public static void main(String args[]){
        int[] arr = {7,6,4,3,1};
        int result = stockProfit(arr);
        System.out.println(result);
    }
}
