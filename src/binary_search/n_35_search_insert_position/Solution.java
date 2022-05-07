package binary_search.n_35_search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            System.out.println("high: " + high + ", mid: " + mid + ", low: " + low);

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }


    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 1;
        Solution sol = new Solution();
        System.out.println(sol.searchInsert(nums, target));
    }


}
