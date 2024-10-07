package leetCode.medium;

public class M807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int counter = 0;
        for ( int i = 0; i < grid.length; i++ ) {
            for ( int j = 0; j < grid.length; j++ ) {

                int yMax = 0;
                int xMax = 0;
                for ( int k = 0; k < grid.length; k++ ) {
                    yMax = Math.max( yMax, grid[k][j] );
                    xMax = Math.max( xMax, grid[i][k] );
                }
                counter += Math.min(yMax, xMax) - grid[i][j];
            }
        }
        return counter;
    }
}
