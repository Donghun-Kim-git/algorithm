package sliding_windows.n_567_permutation_in_string;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public HashMap<Character, Integer> makeDict(String s1) {
        HashMap<Character, Integer> s1_dict = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1_dict.put(s1.charAt(i), s1_dict.getOrDefault(s1.charAt(i), 0) + 1);
        }
        return s1_dict;
    }

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> dict = makeDict(s1);
        int good = 0;
        for (int i = 0; i < s2.length(); i++) {
            char cur = s2.charAt(i);
            System.out.print("cur: " + cur + ", ");
            if (dict.containsKey(cur)) {
                dict.put(cur, dict.get(cur) - 1);
                System.out.print("Exists! {" + cur + ": " + dict.get(cur) + "}");
                if (dict.get(cur) == 0) {
                    good++;
                    System.out.print("Good! (" + good + ")");
                }
            }
            if (i >= s1.length()) {
                char past = s2.charAt(i - s1.length());
                if (dict.containsKey(past)) {
                    if (dict.get(past) == 0) {
                        good--;
                        System.out.print("Not Good! (" + good + ")");
                    }
                    dict.put(past, dict.get(past) + 1);
                }
            }
            if (good == dict.keySet().size()) {
                return true;
            }
            System.out.println();
        }
        return false;
    }
    /* Runtime Exceed
        public boolean checkInclusion(String s1, String s2) {
            int left = 0;
            int right = s1.length();
            Map<Character, Integer> dict = makeDict(s1);
            int cur;
            while(right <= s2.length()){
                int count = 0;
                for(cur = left; cur < right; cur++){
                    char cur_c = s2.charAt(cur);
                    if(dict.containsKey(cur_c)) {
                        if (dict.get(cur_c) == 0) {
                            break;
                        }
                        dict.put(cur_c, dict.get(cur_c) - 1);
                    }
                    else{
                        left = cur;
                        right = s1.length() + cur;
                        break;
                    }
                    count ++;

                }
                if(cur == right) return true;
                for (int i = count; i > 0; i --)
                    dict.put(s2.charAt(cur-i), dict.get(s2.charAt(cur-i)) + 1);
                left++;
                right++;
            }
            return false;
        }
     */

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion("abcdxabcde", "abcdeabcdx"));
    }
}

