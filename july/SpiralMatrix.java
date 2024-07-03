import java.util.*;
public class SpiralMatrix{
    public static void main(String args[]){
        int[][] nums = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        List<Integer> ans = spiralMatrix(nums);
        System.out.println(ans);
    } 
    public static List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> al = new ArrayList<>();
        int count = 0;
        int maxrow = matrix.length-1;
        int maxcol = matrix[0].length-1;
        int i=0;
        int j=0;
        int flag_loop = 1;
        int flagdone=0;
        while(count!=((matrix.length)*(matrix[0].length))){
            if(flagdone>0){
                maxrow--;
                maxcol--;
            }
            while(j!=maxcol){
                if(count==(matrix.length)*(matrix[0].length)){
                    break;
                }
                al.add(matrix[i][j]);
                count++;
                j++;
            }
            while(i!=maxrow){
                if(count==(matrix.length)*(matrix[0].length)){
                    break;
                }
                al.add(matrix[i][j]);
                count++;
                i++;
            }
            while(j!=flag_loop-1){
                if(count==(matrix.length)*(matrix[0].length)){
                    break;
                }
                al.add(matrix[i][j]);
                count++;
                j--;
            }
            while(i!=flag_loop){
                if(count==(matrix.length)*(matrix[0].length)){
                    break;
                }
                al.add(matrix[i][j]);
                count++;
                i--;
            }
            flagdone = 1;
            flag_loop++;
        }
        return al;
    }
}