package C2;

import utils.ListNode;

public class PrintReversingly {
    /**
     * 题目：倒叙输出链表中的数值
     * 解题思路：A.反转链表 遍历输出 B.使用栈 C.递归此处
     *          此处使用递归
     * @param head
     */
    public static void printLinkedListReverse(ListNode head){
        if(head != null){
            if(head.next != null){
                printLinkedListReverse(head.next);
            }
            System.out.println(head.val);
        }

    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        printLinkedListReverse(node1);
    }
}
