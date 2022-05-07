package two_pointers.n_283_move_zeros;

class Solution {
    public void moveZeroes(int[] nums) {
        int zero_p = 0;
        int i = 0;
        while(zero_p < nums.length) {
            if (nums[zero_p] != 0) {
                int temp = nums[i];
                nums[i] = nums[zero_p];
                nums[zero_p] = temp;
                i++;
            }
            zero_p++;
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {1, 0, 2, 0, 3, 0, 5, 0, 0, 0, 10};
        sol.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
