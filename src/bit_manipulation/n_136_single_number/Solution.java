package bit_manipulation.n_136_single_number;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(Integer i : nums){
            result ^= i;
        }
        return result;
    }
}