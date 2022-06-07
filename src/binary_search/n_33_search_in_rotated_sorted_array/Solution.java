package binary_search.n_33_search_in_rotated_sorted_array;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[low]) {  //left part is sorted
                if (nums[low] <= target && target < nums[mid]) { // target is in the sorted part
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else { // right part is sorted
                if(nums[mid] < target && target <= nums[high]) { //target is in the sorted part
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;

    }
}