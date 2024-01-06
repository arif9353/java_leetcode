class Solution2064 {
    public int returnCount(int[] quantities, int mid){
        int count=0;
        for(int i=0;i<quantities.length;i++){
            count+= Math.ceil((double)quantities[i]/(double)(mid));
        }
        return count;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<quantities.length;i++){
            if(high<quantities[i]){
                high = quantities[i];
            }
        }
        while(low<=high){
            int mid = (low+high)/2;
            int count = returnCount(quantities,mid);
            if(count<=n){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        Solution2064 ob =new Solution2064();
        int[] quantities = new int[]{15,10,10};
        int n = 7;
        int ans = ob.minimizedMaximum(n,quantities);
        System.out.println(ans);
    }
}