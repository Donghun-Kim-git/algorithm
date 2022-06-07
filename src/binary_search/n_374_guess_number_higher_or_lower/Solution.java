package binary_search.n_374_guess_number_higher_or_lower;

class GuessGame{
    public int guess(int num){
        int num1 = 8;
        return Integer.compare(num1, num);
    }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == 1) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.guessNumber(10));
    }
}