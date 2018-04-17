package C3;

import utils.ListNode;

public class DeleteNode {
    /**
     * 删除一个节点的O（1）方法
     * @param head
     * @param toBeDelete
     * @return
     */
    public ListNode deleteNode(ListNode head, ListNode toBeDelete){
        if(head == null || toBeDelete == null)
            return null;
        //链表只有一个节点
        if(head == toBeDelete)
            return null;
        //普通非结尾节点
        else if (toBeDelete.next != null){
            toBeDelete.val = toBeDelete.next.val;
            toBeDelete.next = toBeDelete.next.next;
        }
        //结尾节点
        else if(toBeDelete.next == null){
            ListNode p = head;
            while(p.next != toBeDelete){
                p = p.next;
            }
            p.next = null;
        }
        return head;
    }
}
