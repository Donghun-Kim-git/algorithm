package data_structure.array.n_566_reshape_the_matrix;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if(n * m != r * c){
            return mat;
        }
        int[][] output = new int[r][c];
        int cur = 0;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++) {
                output[cur / c][cur % c] = mat[i][j];
                cur++;
            }
        }
        return output;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] output = sol.matrixReshape(mat, 3, 2);
        for(int i = 0 ; i < output.length; i ++){
            for(int j = 0; j < output[0].length; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
