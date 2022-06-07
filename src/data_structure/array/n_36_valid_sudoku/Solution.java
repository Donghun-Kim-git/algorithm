package data_structure.array.n_36_valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length, n = board[0].length;
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> cols = new HashMap<>();
        HashMap<Integer, Set<Character>> boxs = new HashMap<>();

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                char item = board[r][c];
                if(item == '.') continue;

                Set<Character> row = rows.getOrDefault(r, new HashSet<>());
                Set<Character> col = cols.getOrDefault(c, new HashSet<>());
                Set<Character> box = boxs.getOrDefault((r / 3) * 3 + c / 3, new HashSet<>());

                System.out.println("rows: " + rows);
                System.out.println("cols: " + cols);
                System.out.println("boxs: " + boxs);
                System.out.println("board[" + r + "][" + c + "]: " + board[r][c]);
                if(row.contains(board[r][c])) return false;
                if(col.contains(board[r][c])) return false;
                if(box.contains(board[r][c])) return false;


                row.add(item);
                col.add(item);
                box.add(item);
                rows.put(r, row);
                cols.put(c, col);
                boxs.put((r / 3) * 3 + c / 3, box);
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
//        char[][] board = {  {'1','3','.','.','7','.','.','.','.'},
//                            {'6','.','.','1','9','5','.','.','.'},
//                            {'.','9','8','.','.','.','.','6','.'},
//                            {'8','.','.','.','6','.','.','.','3'},
//                            {'4','.','.','8','.','3','.','.','1'},
//                            {'7','.','.','.','2','.','.','.','6'},
//                            {'.','6','.','.','.','.','2','8','.'},
//                            {'.','.','.','4','1','9','.','.','5'},
//                            {'.','.','.','.','8','.','.','7','9'}};
        
//        char[][] board = {{'.','.','5','.','.','.','.','.','6'},{'.','.','.','.','1','4','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','9','2','.','.'},{'5','.','.','.','.','2','.','.','.'},{'.','.','.','.','.','.','.','3','.'},{'.','.','.','5','4','.','.','.','.'},{'3','.','.','.','.','.','4','2','.'},{'.','.','.','2','7','.','6','.','.'}};
//        char[][] board = {{'.','.','.','.','.','.','.','.','2'},{'.','.','.','.','.','.','6','.','.'},{'.','.','1','4','.','.','8','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','3','.','.','.','.'},{'5','.','8','6','.','.','.','.','.'},{'.','9','.','.','.','.','4','.','.'},{'.','.','.','.','5','.','.','.','.'}};
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sol.isValidSudoku(board));
    }
}
