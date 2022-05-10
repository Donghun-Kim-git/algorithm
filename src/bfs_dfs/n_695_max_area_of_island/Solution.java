package bfs_dfs.n_695_max_area_of_island;

public class Solution {
    public int maxLand(int[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != 1) return 0;
        grid[x][y] = 2;
        return 1 + maxLand(grid, x-1, y) + maxLand(grid, x, y-1) + maxLand(grid,x+1, y) + maxLand(grid,x, y+1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int output = 0;
        for(int i = 0; i < grid.length; i ++){
            for(int j = 0; j < grid[0].length; j ++){
                output = Math.max(output, maxLand(grid, i, j));
            }
        }
        return output;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(sol.maxAreaOfIsland(grid));
    }
}
