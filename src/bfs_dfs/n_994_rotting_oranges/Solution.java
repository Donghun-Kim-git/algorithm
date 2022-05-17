package bfs_dfs.n_994_rotting_oranges;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int[] dir = {0, 1, 0, -1, 0};
        int m = grid.length, n = grid[0].length, fresh = 0;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(grid[i][j] == 2) {     // if rotten
                    q.offer(new int[]{i, j});
                    grid[i][j] = 0;
                }
                else if (grid[i][j] == 1) { // if fresh
                    grid[i][j] = -1;
                    fresh++;
                }
                else                      // if empty
                    grid[i][j] = 0;

            }
        }
        int max = 0;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for(int i = 0; i < 4; i ++){
                int nr = r + dir[i], nc = c + dir[i+1];
                if(nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != -1) continue;
                grid[nr][nc] = grid[r][c] + 1;
                fresh--;
                max = Math.max(max, grid[nr][nc]);
                q.offer(new int[]{nr, nc});
            }
        }
        return fresh == 0 ? max : -1;
    }
}
