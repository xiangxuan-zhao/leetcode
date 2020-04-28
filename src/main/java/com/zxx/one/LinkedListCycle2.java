package com.zxx.one;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Administrator
 * @date 2020/04/28
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode node = head;
        while(node != null){
            if(set.contains(node)){
                return node;
            }
            set.add(node);
            node = node.next;
        }
        return null;
    }
}

