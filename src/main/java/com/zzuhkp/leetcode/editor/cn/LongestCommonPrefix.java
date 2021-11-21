package com.zzuhkp.leetcode.editor.cn;

/**
 * 题目编号: 14
 * 题目标题: 最长公共前缀
 *
 * @date 2021-11-21 13:34:08
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String longestCommonPrefix(String[] strs) {
            int minLength = Integer.MAX_VALUE;
            for (String str : strs) {
                if (str.length() < minLength) {
                    minLength = str.length();
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < minLength; i++) {
                char temp = 0;
                boolean add = true;
                for (int j = 0; j < strs.length; j++) {
                    if (j == 0) {
                        temp = strs[j].charAt(i);
                    } else if (temp != strs[j].charAt(i)) {
                        add = false;
                        break;
                    }
                }
                if (!add) {
                    break;
                }
                sb.append(temp);
            }
            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}