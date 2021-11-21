package com.zzuhkp.leetcode.editor.cn;

/**
 * 题目编号: 20
 * 题目标题: 有效的括号
 *
 * @date 2021-11-21 18:04:21
 */
public class ValidParentheses {

    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean isValid(String s) {
            if (s == null || s.length() == 0 || s.length() % 2 == 1) {
                return false;
            }
            int min = 0;
            int max = s.length() - 1;
            while (min < max) {
                if (this.matchValue(s.charAt(min)) == s.charAt(min + 1)) {
                    min = min + 2;
                } else if (this.matchValue(s.charAt(min)) == s.charAt(max)) {
                    min = min + 1;
                    max = max - 1;
                } else {
                    return false;
                }
            }
            return true;

        }

        private char matchValue(char c) {
            switch (c) {
                case '(':
                    return ')';
                case '[':
                    return ']';
                case '{':
                    return '}';
                default:
                    return '0';
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}