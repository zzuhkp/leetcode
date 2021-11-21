package com.zzuhkp.leetcode.editor.cn;

import com.sun.org.apache.bcel.internal.generic.INEG;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目编号: 13
 * 题目标题: 罗马数字转整数
 *
 * @date 2021-11-20 21:51:28
 */
public class RomanToInteger {

    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
        System.out.println(solution.romanToInt("III"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            Map<Character, Character> specials = new HashMap<>();
            specials.put('V', 'I');
            specials.put('X', 'I');
            specials.put('L', 'X');
            specials.put('C', 'X');
            specials.put('D', 'C');
            specials.put('M', 'C');

            int num = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char right = s.charAt(i);
                if (i == 0) {
                    num = num + map.get(right);
                    continue;
                }
                char left = s.charAt(i - 1);
                if (specials.get(right) != null && left == specials.get(right)) {
                    num = num + (map.get(right) - map.get(left));
                    i--;
                } else {
                    num = num + map.get(right);
                }
            }
            return num;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}