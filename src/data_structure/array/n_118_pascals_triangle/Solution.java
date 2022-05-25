package data_structure.array.n_118_pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i-1){
                    temp.add(1);
                }
                else{
                    List<Integer> prev = output.get(output.size()-1);
                    temp.add(prev.get(j-1) + prev.get(j));
                }
            }
            output.add(temp);
        }
        return output;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.generate(6));
    }
}
