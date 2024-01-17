class array1 {
    public static boolean ifAppears(int[] arr){
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(ele == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean result = ifAppears(arr);
        System.out.println(result);
    }
}
