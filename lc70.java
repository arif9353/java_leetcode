class Solution70 {
    public static int climbStairs(int n) {
        int[] arr = new int[45+1];
        arr[0]=arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String args[]){
        int n = 19;
        System.out.println(climbStairs(n));
    }
}