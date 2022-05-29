package binary_search.n_34_find_first_and_last_position_of_element_in_sorted_array;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int low = 0, high = nums.length - 1;
        result[0] = findFirst(nums, low, high, target);
        if(result[0] == -1) return new int[] {-1, -1};
        result[1] = findLast(nums, result[0], high, target);
        return result;
    }
    public int findFirst(int[] nums, int low, int high, int target){
        int i = -1, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] > target) high = mid - 1;
            else{
                i = mid;
                high = mid - 1;
            }
        }
        return i;
    }
    public int findLast(int[] nums, int low, int high, int target){
        int i = -1, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] > target) high = mid - 1;
            else{
                i = mid;
                low = mid + 1;
            }
        }
        return i;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = sol.searchRange(nums, target);
        for(Integer i: ans){
            System.out.print(i + " ");
        }
    }

}