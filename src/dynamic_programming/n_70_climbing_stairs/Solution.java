package dynamic_programming.n_70_climbing_stairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//    Recursion
//    public int climbStairs(int n) {
//        if(n <= 1) return 1;
//        if(n <= 2) return 2;
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

//    Recursion + memorization
//    public int climbStairs(int n){
//        Map<Integer, Integer> memo = new HashMap<>();
//        memo.put(1, 1);
//        memo.put(2, 2);
//        return climbStairs(n, memo);
//    }
//    public int climbStairs(int n, Map<Integer, Integer> memo){
//        if(memo.containsKey(n)) return memo.get(n);
//        memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
//        return memo.get(n);
//    }

    //DP
    public int climbStairs(int n){
        if(n < 3){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n+1; i ++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.climbStairs(3));
        /*
        1 1 1 1 1
        1 2 1 1
        1 2 2
         */
    }
}
