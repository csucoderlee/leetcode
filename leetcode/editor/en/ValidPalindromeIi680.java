//Given a string s, return true if the s can be palindrome after deleting at mos
//t one character from it. 
//
// 
// Example 1: 
//
// 
//Input: s = "aba"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
// 
//
// Example 3: 
//
// 
//Input: s = "abc"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 105 
// s consists of lowercase English letters. 
// 
// Related Topics Two Pointers String Greedy 
// 👍 2956 👎 186

package editor.en;

public class ValidPalindromeIi680 {

  public static void main(String[] args) {
    Solution solution = new ValidPalindromeIi680().new Solution();
    System.out.println(solution.validPalindrome(
        "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    System.out.println(solution.validPalindrome("abc"));
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public boolean validPalindrome(String s) {
      int left = 0;
      int right = s.length() - 1;
      while (left < right) {
        if (s.charAt(left) == s.charAt(right)) {
          left++;
          right--;
        } else {
          return innerValidPalindrome(s.substring(left + 1, right+1)) || innerValidPalindrome(
              s.substring(left, right));
        }
      }
      return true;
    }

    boolean innerValidPalindrome(String s) {
      int left = 0;
      int right = s.length() - 1;
      while (left < right) {
        if (s.charAt(left) == s.charAt(right)) {
          left++;
          right--;
        } else {
          return false;
        }
      }
      return true;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
 