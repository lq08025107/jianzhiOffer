package C3;

import utils.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode newHead = null;
        ListNode node = head;
        ListNode pre = null;

        while(node != null){
            ListNode next = node.next;

            if(next == null)
                newHead = node;
            node.next = pre;
            pre = node;
            node = next;
        }
        return newHead;
    }
}
