public class array2 {
    /*MY APPROACH GIVING TIME COMPLEXITY O(nlog(n))
    public static int rotatedIndex(int[]arr){
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid]){
                return mid;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
    public static int rotateArray(int[] arr, int target){
        int pivot = rotatedIndex(arr);
        int[] dummy = new int[arr.length];
        int j=0;
        for(int i=pivot+1;i<arr.length;i++){
            dummy[j]=arr[i];
            j++;
        }
        for(int i=0;i<=pivot;i++){
            dummy[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(dummy[i]+" ");
        }
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(dummy[mid]==target){
                return ((mid+pivot)%(arr.length-1));
            }
            else if(dummy[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        int result = rotateArray(arr, target);
        System.out.println(result);
    }*/
    //Time complexity O(log(n))
    public static int rotateArray(int[]arr, int target){
        int minEleIndex = minElementIndex(arr);
        if(arr[minEleIndex]<=target && target<=arr[arr.length-1]){
            return searchArray(arr, minEleIndex,arr.length-1,target);
        }
        return searchArray(arr,0,minEleIndex,target);
    }
    public static int searchArray(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        } 
        return -1;
    }
    public static int minElementIndex(int[]arr){
        int start=0; int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[start]<=arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
        public static void main(String args[]){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 6;
        int result = rotateArray(arr, target);
        System.out.println(result);
    }
}
