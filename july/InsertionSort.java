import java.util.Arrays;
public class InsertionSort{
    public static void main(String args[]){
        int[] arr = new int[]{4,5,3,2,1,7,6};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currElement = i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[currElement]){
                    int temp = arr[j];
                    arr[j] = arr[currElement];
                    arr[currElement] = temp;
                }
            }
        }
    }
}