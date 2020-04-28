package com.zxx.one;

/**
 * @author Administrator
 * @date 2020/04/24
 */
public class LinkedListCycle {
    /**
     * [141].环形链表
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p1 != p2){
            if(p2 == null || p2.next == null){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return true;
    }
}
/**
 * Definition for singly-linked list.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }

