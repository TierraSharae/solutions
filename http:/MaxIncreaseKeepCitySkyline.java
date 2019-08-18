class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int counter = 0 ;
        int[] topBottomView = new int[grid.length] ; // max of each col
        int[] leftRightView = new int[grid.length] ; // max of each row
            
        // populate max views
            for (int i = 0 ; i < grid.length ; i++) {
                for (int j = 0 ; j < grid.length ; j++){
                    topBottomView[i] = Math.max(topBottomView[i], grid[j][i]) ;
                    leftRightView[i] = Math.max(leftRightView[i], grid[i][j]) ; 
                }
            }
        
        // subtract to find max heights
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid.length ; j++){
                counter += Math.min(topBottomView[i], leftRightView[j]) - grid[i][j] ;
            }
        }
        return counter ;
    }
}
