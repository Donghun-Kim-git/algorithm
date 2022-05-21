package recursion.n_44_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> cur, List<List<Integer>> res) {
        StringBuilder prefix = new StringBuilder();
        prefix.append("\t".repeat(start));
        if (cur.size() == nums.length) {
            System.out.print(prefix + "yes! " + cur + " + " + res);
            res.add(new ArrayList<>(cur));
            System.out.println(" --> " + res);
            return;
        }

        for (int i = 0; i <= cur.size(); i++) {
            cur.add(i, nums[start]);
            System.out.print(prefix + "adding num " + nums[start] + " into " + i + "th position of " + cur);
            System.out.println(" permutation is " + cur);
            backtrack(nums, start + 1, cur, res);
            cur.remove(i);
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.permute(new int[]{1, 2, 3}));
    }
}

