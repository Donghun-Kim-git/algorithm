package binary_search.n_1385_find_the_distance_value_between_two_arrays;

import java.util.Arrays;


public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for(Integer i: arr1){
            int low = 0, high = arr2.length-1, mid;
            boolean fail = false;
            while(low <= high){
                mid = low + (high - low) / 2;
                if(i-d <= arr2[mid] && arr2[mid] <= i + d){
                    fail = true;
                    break;
                }
                else if(i < arr2[mid]) high = mid - 1;
                else low = mid + 1;
            }
            if(!fail) count++;
        }
        return count;
    }
}