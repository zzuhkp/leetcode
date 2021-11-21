package com.zzuhkp.leetcode.editor.cn;

import java.util.List;

/**
 * 题目编号: 21
 * 题目标题: 合并两个有序链表
 *
 * @date 2021-11-21 19:57:56
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
    }

    public static class ListNode {

        private int val;

        private ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}