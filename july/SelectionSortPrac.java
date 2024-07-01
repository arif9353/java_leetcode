import java.util.Arrays;
public class SelectionSortPrac{
    public static void main(String args[]){
        int arr[] = new int[]{15,4,13,2,11};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}