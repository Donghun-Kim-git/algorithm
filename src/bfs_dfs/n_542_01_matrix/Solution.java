package bfs_dfs.n_542_01_matrix;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {

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

