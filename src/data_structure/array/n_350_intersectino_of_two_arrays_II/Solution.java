package data_structure.array.n_350_intersectino_of_two_arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer n: nums1){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer n: nums2){
            if(map.containsKey(n)){
                result.add(n);
                map.put(n, map.get(n) -1);
                if(map.get(n) == 0){
                    map.remove(n);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}