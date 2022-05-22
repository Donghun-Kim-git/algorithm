package dynamic_programming.n_120_triangle;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() > 1) {
            for (int i = triangle.size() - 2; i >= 0; i--) {
                List<Integer> curr = triangle.get(i);
                List<Integer> below = triangle.get(i + 1);
                for (int j = 0; j < curr.size(); j++) {
                    curr.set(j, curr.get(j) + Math.min(below.get(j), below.get(j + 1)));
                }
            }
        }
        return triangle.get(0).get(0);
    }
    public static void main(String[] args){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>(List.of(2)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(6,5,7)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(4,1,8,3)));
        System.out.println(triangle);
        Solution sol = new Solution();
        System.out.println(sol.minimumTotal(triangle));
        System.out.println(triangle);


    }
}
