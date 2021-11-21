package com.zzuhkp.leetcode.editor.cn;

/**
 * 题目编号: 9
 * 题目标题: 回文数
 *
 * @date 2021-11-20 20:25:29
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}