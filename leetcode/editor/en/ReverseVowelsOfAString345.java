//Given a string s, reverse only all the vowels in the string and return it. 
//
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases
//. 
//
// 
// Example 1: 
// Input: s = "hello"
//Output: "holle"
// Example 2: 
// Input: s = "leetcode"
//Output: "leotcede"
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 3 * 105 
// s consist of printable ASCII characters. 
// 
// Related Topics Two Pointers String 
// 👍 1153 👎 1562

package editor.en;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString345{
    public static void main(String[] args) {
      Solution solution = new ReverseVowelsOfAString345().new Solution();
      System.out.println(solution.reverseVowels("aA"));
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
      List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
      int left = 0;
      int right = s.length() - 1;
      char[] chars = s.toCharArray();
      while (left < right) {
        if (!vowels.contains(s.charAt(left))) {
          left++;
        } else if (!vowels.contains(s.charAt(right))) {
          right--;
        } else {
          chars[left] = s.charAt(right);
          chars[right] = s.charAt(left);
          left++;
          right--;
        }

      }

      return new String(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 