package com.leetcode.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leetcode {
    static final Logger logger = LoggerFactory.getLogger(Leetcode.class);

    public static void main(String[] args) {
        Leetcode leetcode = new Leetcode();
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(2);
        l1.next = l2;
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        l5.next = new ListNode(5);
        l4.next = l5;
        ListNode listNode = leetcode.addTwoNumbers(l1, l4);
        do {
            logger.debug(String.valueOf(listNode.val));
            listNode = listNode.next;
        } while (listNode != null);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
