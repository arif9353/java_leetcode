class Solution1289 {
    public static int minFallingPathSum(int[][] grid) {
        int row = grid.length;
        for(int i=1;i<row;i++){
            for(int j=0;j<row;j++){
                int mins = Integer.MAX_VALUE;
                for(int k=0;k<row;k++){
                    if(k!=j){
                        mins = Math.min(mins, grid[i-1][k]);
                    }
                }
                grid[i][j]+=mins;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num:grid[row-1]){
            min = Math.min(min,num);
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] grid={{-73,61,43,-48,-36},{3,30,27,57,10},{96,-76,84,59,-15},{5,-49,76,31,-7},{97,91,61,-46,67}};
        int result = minFallingPathSum(grid);
        System.out.println(result);
    }
}