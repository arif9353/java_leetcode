import java.util.*;
class Solution2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        int arr[] = new int[100001];
        for(int i=0;i<matches.length;i++){
            int win = matches[i][0];
            int loss = matches[i][1];
            if(arr[win]==0){
                arr[win]=-1;
            }
            if(arr[loss]== -1){
                arr[loss] = 1;
            }
            else{
                arr[loss]++;
            }
        }
        List<Integer> zeroloss = new ArrayList<>();
        List<Integer> oneloss = new ArrayList<>();
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                zeroloss.add(i);
            }
            if(arr[i]==1){
                oneloss.add(i);
            }
        }
        li.add(zeroloss);
        li.add(oneloss);
        return li;
    }
    public static void main(String args[]){
        Solution2225 ob = new Solution2225();
        int[][] matches = new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> answer = ob.findWinners(matches);
        System.out.println(answer);
    }
}