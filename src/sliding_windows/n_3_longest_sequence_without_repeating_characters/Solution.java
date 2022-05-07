package sliding_windows.n_3_longest_sequence_without_repeating_characters;
import java.util.HashMap;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = 0;
        int longest_len = 0;
        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) >= start) {
                start = hashMap.remove(s.charAt(i)) + 1;
            }
            hashMap.put(s.charAt(i), i);
            longest_len = Math.max(longest_len, i - start);
        }
        return longest_len + 1;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abbcdsasd"));
        System.out.println(sol.lengthOfLongestSubstring("aa"));
        System.out.println(sol.lengthOfLongestSubstring("aab"));
        System.out.println(sol.lengthOfLongestSubstring(""));
    }
}
