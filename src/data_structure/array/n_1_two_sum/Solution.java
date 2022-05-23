package data_structure.array.n_1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mem = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            int n = nums[i];
            if(mem.containsKey(n))  return new int[]{mem.get(n), i};
            mem.put(target - n, i);
        }
        return null;
    }
}