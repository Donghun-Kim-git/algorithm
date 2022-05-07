package two_pointers.n_557_reverse_words_in_a_string_III;

public class Solution{
    public String reverseWord(String s){
        String output = "";
        for(int i = s.length() - 1; i >= 0; i--){
            output += s.charAt(i) + "";
        }
        return output;
    }
    public String reverseWords(String s) {
        String output = "";
        String[] words = s.split(" ");
        for(String word: words){
            output += reverseWord(word) + " ";
        }
        return output.strip();
    }



}
