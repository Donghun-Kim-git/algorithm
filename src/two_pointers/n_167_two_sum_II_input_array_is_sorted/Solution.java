package two_pointers.n_167_two_sum_II_input_array_is_sorted;

public class Solution {
    public int binary_search(int[] numbers, int target, int low){
        int mid;
        int high = numbers.length -1;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(numbers[mid] == target){
                return mid;
            }
            else if(numbers[mid] <= target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {0, 0};
        while((ans[1] = binary_search(numbers, target - numbers[ans[0]], ans[0] + 1)) < 0){
            ans[0]++;
        }
        ans[0]++;
        ans[1]++;
        return ans;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {1, 2, 7, 11};
        int target = 12;
        int[] test_result = sol.twoSum(nums, target);
        for(int x: test_result)
            System.out.print(x+ " ");
    }
}
