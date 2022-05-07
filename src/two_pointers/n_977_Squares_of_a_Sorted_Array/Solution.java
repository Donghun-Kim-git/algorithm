package two_pointers.n_977_Squares_of_a_Sorted_Array;


public class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while(left <= right){
            int left_val = nums[left] * nums[left];
            int right_val = nums[right] * nums[right];
            if(left_val >= right_val){
                result[index--] = left_val;
                left++;
            }
            else{
                result[index--] = right_val;
                right--;
            }
        }
        return result;
    }
}

/*
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while(left <= right)
            result[index--] = (int)Math.abs(nums[left]) >= (int)Math.abs(nums[right]) ? (int)Math.pow(nums[left++], 2) : (int)Math.pow(nums[right--], 2);
        return result;
    }
}
*/