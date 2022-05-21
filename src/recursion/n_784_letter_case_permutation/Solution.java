package recursion.n_784_letter_case_permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();

        backtracking(s.toCharArray(), 0, res);

        return res;
    }

    public void backtracking(char[] s, int cur, List<String> res){
        if(cur == s.length){
            res.add(new String(s));
            return;
        }
        if(Character.isLetter(s[cur])){
            s[cur] = Character.toLowerCase(s[cur]);
            backtracking(s, cur + 1, res);
            s[cur] = Character.toUpperCase(s[cur]);
            backtracking(s, cur+ 1, res);
        }
        else{
            backtracking(s, cur + 1, res);
        }
    }

    public static void main(String[] args){
        Solution sol = new Solution();

        System.out.println(sol.letterCasePermutation("aZ315B"));
    }

}
