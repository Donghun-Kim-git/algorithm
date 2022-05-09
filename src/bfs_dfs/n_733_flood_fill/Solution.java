package bfs_dfs.n_733_flood_fill;

public class Solution {
    public void fill(int[][] image, int sr, int sc, int newColor, int targetColor){
        if(image[sr][sc] == targetColor){
            image[sr][sc] = newColor;
            System.out.println("sr: " + sr + ", sc: " + sc);
            if(sr > 0)
                fill(image, sr - 1, sc, newColor, targetColor);
            if(sr < image.length -1)
                fill(image, sr + 1, sc, newColor, targetColor);
            if(sc > 0)
                fill(image, sr, sc - 1, newColor, targetColor);
            if(sc < image[0].length -1)
                fill(image, sr, sc + 1, newColor, targetColor);
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        fill(image, sr, sc, -1, image[sr][sc]);
        fill(image, sr, sc, newColor, -1);

        return image;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            System.out.print("[");
            for(int j =0; j < matrix[0].length - 1; j++){
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println(matrix[i][matrix[i].length-1] + "]");
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
//        int[][] image = {{0,0,0}, {0,1,1}};
        printMatrix(image);
        int[][] result = sol.floodFill(image, 1, 1, 3);
        printMatrix(result);
        System.out.println();
    }
}
