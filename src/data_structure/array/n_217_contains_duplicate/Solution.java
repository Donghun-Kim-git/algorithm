package data_structure.array.n_217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSets = new HashSet<>();
        for(Integer i : nums){
            if(numSets.contains(i)) return true;
            numSets.add(i);
        }
        return false;

    }
}
