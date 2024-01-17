import java.util.HashSet;

class array1 {
    /*My approach giving TC O(n^2)
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
    }*/
    //TC O(N)
    public static boolean ifAppears(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
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
