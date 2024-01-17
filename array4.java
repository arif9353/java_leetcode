import java.util.*;
public class array4 {
    public static List<List<Integer>> triplets(int arr[]){
        List<List<Integer>> answer = new ArrayList<>();
        if(arr.length<3){
            return answer;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> row = new ArrayList<>();
                        row.add(arr[i]);
                        row.add(arr[j]);
                        row.add(arr[k]);
                        answer.add(row);
                    }
                }
            }
        }
        answer = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(answer));
        return answer;
    }
    public static void main(String args[]){
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> li = new ArrayList<>();
        li = triplets(arr);
        System.out.println(li);
    }
}
