class Solution931 {
    public static int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        for(int i=1;i<row;i++){
            for(int j=0;j<row;j++){
                matrix[i][j] += Math.min(matrix[i-1][j],Math.min(matrix[i-1][Math.max(j-1,0)],matrix[i-1][Math.min(j+1,row-1)]));
            }
        }
        //bottom most pe saare minimum aajayege
        int min = Integer.MAX_VALUE;
        for(int num:matrix[row-1]){
            if(min>num){
                min=num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }
}