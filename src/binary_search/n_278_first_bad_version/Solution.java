package binary_search.n_278_first_bad_version;

class VersionControl{
    private boolean[] n = {false, false, false, false, false, false, true, true, true, true};
    public boolean isBadVersion(int mid){
        return n[mid-1];
    }
}

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int mid;
        int high = n;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(isBadVersion(mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.firstBadVersion(10));
    }
}