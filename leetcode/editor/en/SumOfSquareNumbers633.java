//Given a non-negative integer c, decide whether there're two integers a and b s
//uch that a2 + b2 = c. 
//
// 
// Example 1: 
//
// 
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
// 
//
// Example 2: 
//
// 
//Input: c = 3
//Output: false
// 
//
// Example 3: 
//
// 
//Input: c = 4
//Output: true
// 
//
// Example 4: 
//
// 
//Input: c = 2
//Output: true
// 
//
// Example 5: 
//
// 
//Input: c = 1
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 0 <= c <= 231 - 1 
// 
// Related Topics Math Two Pointers Binary Search 
// 👍 750 👎 397

package editor.en;
public class SumOfSquareNumbers633{
    public static void main(String[] args) {
         Solution solution = new SumOfSquareNumbers633().new Solution();
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
      int left = 0;
      int right = (int) Math.sqrt(c);

      while (left <= right) {
        if (left * left + right * right > c) {
          right--;
        } else if (left * left + right * right < c) {
          left++;
        } else {
          return true;
        }
      }

      return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 