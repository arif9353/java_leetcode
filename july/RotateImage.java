import java.util.*;
public class RotateImage{
    public static void main(String args[]){
        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateImage(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(Arrays.toString(nums[i])+" ");
        }
    } 
    public static void rotateImage(int[][] matrix, int start, int end){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=matrix.length-1;
            while(j<k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                k--;
                j++;
            }
        }
    }
}