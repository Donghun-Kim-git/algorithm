package recursion.n_44_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> permutation, List<List<Integer>> permutations) {
        StringBuilder prefix = new StringBuilder();
        prefix.append("\t".repeat(start));
        if (permutation.size() == nums.length) {
            System.out.print(prefix + "yes! " + permutation + " + " + permutations);
            permutations.add(new ArrayList<>(permutation));
            System.out.println(" --> " + permutations);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            permutation.add(i, nums[start]);
            System.out.print(prefix + "adding num " + nums[start] + " into " + i + "th position of " + permutation);
            System.out.println(" permutation is " + permutation);
            backtrack(nums, start + 1, permutation, permutations);
            permutation.remove(i);
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.permute(new int[]{1, 2, 3}));
    }
}

