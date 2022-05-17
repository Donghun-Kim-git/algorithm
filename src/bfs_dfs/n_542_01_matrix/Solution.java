package bfs_dfs.n_542_01_matrix;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new ArrayDeque<>();
        int m = mat.length, n = mat[0].length;
        for(int i=0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(mat[i][j] == 0) q.offer(new int[]{i, j});
                else mat[i][j] = -1;
            }
        }
        int[] dir = {-1, 0, 1, 0, -1};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for(int i = 0; i < 4; i++){
                int nr = r + dir[i], nc = c + dir[i+1];
                if(nr < 0 || nc < 0 || nr >= m || nc >= n || mat[nr][nc] != -1) continue;
                mat[nr][nc] = mat[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return mat;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] mat = {{1, 0, 0}, {0, 1, 1}, {1, 1, 1}};
        int[][] dist = sol.updateMatrix(mat);
        for(int i = 0; i < dist.length; i++){
            for(int j =0; j < dist[0].length; j++){
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}

