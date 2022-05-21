package recursion.n_77_combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(n, k, output, new ArrayList<>(), 1);
        return output;
    }
    public void backtrack(int n, int k, List<List<Integer>> res, List<Integer> cur, int num){
        StringBuilder prefix = new StringBuilder();
        prefix.append("\t".repeat(num - 1));
        if(cur.size() == k){
            System.out.print(prefix + "yes, inserting " + cur + " into " + res);
            res.add(new ArrayList<>(cur));
            System.out.println(prefix + " --> output: " + res);
            return;
        }
        for(int i = num; i <= n - (k - cur.size()) + 1; i ++) {
            System.out.println(prefix +"from " + num + " to " + (n - (k - cur.size()) + 1));
            System.out.print(prefix + "inserting " + i + " into " + cur);
            cur.add(i);
            System.out.println(prefix + " --> temp: " + cur);
            backtrack(n, k, res, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.combine(4, 3));
    }
}