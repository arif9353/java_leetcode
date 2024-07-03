import java.util.*;
public class PascalTriangle{
    public static void main(String args[]){
        List<List<Integer>> al = generate(13);
        System.out.println(al);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] matrix = new int[numRows+1][(numRows*2)+1];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<(numRows*2)-1;j++){
                if((i+j)==(numRows)){
                    matrix[i][j] = 1;
                }
                else if((j-i)==(numRows)){
                    matrix[i][j] = 1;
                }
            }
        }
        List<Integer> initial = new ArrayList<>();
        initial.add(1);
        ans.add(initial);
        for(int i=1;i<numRows;i++){
            List<Integer> subal = new ArrayList<>();
            for(int j=1;j<(numRows*2);j++){
                int sum = matrix[i-1][j-1] + matrix[i-1][j+1];
                matrix[i][j] = sum;
                if(sum !=0){
                    subal.add(sum);
                }
            }
            ans.add(subal);
        }
        return ans;
    }
}