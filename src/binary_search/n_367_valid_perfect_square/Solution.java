package binary_search.n_367_valid_perfect_square;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = (num+1) / 2;
        long mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(mid * mid == num) return true;
            else if(mid * mid < num) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}