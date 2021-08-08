//Given a string s and a string array dictionary, return the longest string in t
//he dictionary that can be formed by deleting some of the given string characters
//. If there is more than one possible result, return the longest word with the sm
//allest lexicographical order. If there is no possible result, return the empty s
//tring. 
//
// 
// Example 1: 
//
// 
//Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
//Output: "apple"
// 
//
// Example 2: 
//
// 
//Input: s = "abpcplea", dictionary = ["a","b","c"]
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// 1 <= dictionary.length <= 1000 
// 1 <= dictionary[i].length <= 1000 
// s and dictionary[i] consist of lowercase English letters. 
// 
// Related Topics Array Two Pointers String Sorting 
// 👍 1117 👎 309

package editor.en;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting524{
    public static void main(String[] args) {
         Solution solution = new LongestWordInDictionaryThroughDeleting524().new Solution();
      System.out.println(
          solution.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")));
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
      String result = "";
      for (String value : dictionary) {
        if (isSub(value, s)) {
          if (value.length() == result.length()) {
            result = value.compareTo(result) > 0 ? result : value;
          } else {
            result = value.length() > result.length() ? value : result;
          }
        }
      }
      return result;
    }

    // apple  aeppale
  private boolean isSub(String d, String s) {
      int right = 0;

    for (int i = 0; i < s.length(); i++) {
      if (right < d.length() && s.charAt(i) == d.charAt(right)) {
        right++;
      }
    }
    return right == d.length();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 