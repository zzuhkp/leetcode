package com.zzuhkp.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目编号: 1
 * 题目标题: 两数之和
 *
 * @date 2021-11-20 10:33:25
 */
public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int[] twoSum(int[] nums, int target) {
            return twoSum2(nums, target);
        }

        /**
         * 时间复杂度：n²
         *
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum1(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }

        /**
         * 时间复杂度： n
         *
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer index1 = map.get(target - nums[i]);
                if (index1 != null) {
                    return new int[]{index1, i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}