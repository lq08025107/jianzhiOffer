package C3;

import utils.ListNode;

public class KthToTail {
    public static ListNode FindkthToTail(ListNode head, int k){
        if(head == null || k == 0) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        int i = 0;
        while (i < k - 1){
            if (p1.next != null){
                p1 = p1.next;
                i++;
            } else{
                return null;
            }

        }
        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
