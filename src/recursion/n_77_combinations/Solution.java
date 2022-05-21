package recursion.n_77_combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        combine_aux(n, k, output, new ArrayList<>(), 1);
        return output;
    }
    public void combine_aux(int n, int k, List<List<Integer>> output, List<Integer> temp, int num){
        StringBuilder prefix = new StringBuilder();
        prefix.append("\t".repeat(num - 1));
        if(temp.size() >= k){
            System.out.print(prefix + "yes, inserting " + temp + " into " + output);
            output.add(new ArrayList<>(temp));
            System.out.println(prefix + " --> output: " + output);
            return;
        }
        for(int i = num; i <= n - (k - temp.size()) + 1; i ++) {
            System.out.println(prefix +"from " + num + " to " + (n - (k - temp.size()) + 1));
            System.out.print(prefix + "inserting " + i + " into " + temp);
            temp.add(i);
            System.out.println(prefix + " --> temp: " + temp);
            combine_aux(n, k, output, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.combine(4, 3));
    }
}