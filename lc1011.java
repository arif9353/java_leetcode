class Solution1011 {
    public int noOfDays(int[]weights, int capacity){
        int days1 = 1;
        int load = 0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days1++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days1;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE; 
        for(int i=0;i<weights.length;i++){
            if(low<weights[i]){
                low = weights[i];
            }
        }
        System.out.println(low);
        int high = 0 ;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        System.out.println(high);
        while(low<=high){
            int mid= (low+high)/2;
            int nodays = noOfDays(weights, mid);
            if(nodays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int[] weights = new int[]{1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        Solution1011 ob = new Solution1011();
        int answer =  ob.shipWithinDays(weights,days);
        System.out.println(answer);
    }
}