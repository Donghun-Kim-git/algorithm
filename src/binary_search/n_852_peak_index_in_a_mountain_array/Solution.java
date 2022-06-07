package binary_search.n_852_peak_index_in_a_mountain_array;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length-1, mid, left, right;
        while(low <= high){
            mid = low + (high - low) / 2;
            left = mid > 0 ? mid - 1 : mid;
            right = mid < arr.length - 1 ? mid + 1 : mid;
            // System.out.println("left " + left + ", right " + right);
            if(arr[mid] > arr[left] && arr[mid] > arr[right]) return mid;
            else if(arr[left] < arr[right]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}