package binary_search.n_704_binary_search;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = (low + high) / 2;
            System.out.println("low is " + low + ", mid is " + mid + ", high is " + high);
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 0;
        Solution sol = new Solution();
        int ans = sol.search(nums, target);
        System.out.println(ans);
    }
}
