package C4;

import utils.RandomListNode;

public class ComplexLinkedList {
    /**
     * Definition for singly-linked list with a random pointer.
     * class RandomListNode {
     *     int label;
     *     RandomListNode next, random;
     *     RandomListNode(int x) { this.label = x; }
     * };
     */
    public class Solution {
        public RandomListNode copyRandomList(RandomListNode head) {
            if(head == null) return head;
            cloneNodes(head);
            connectRandomNodes(head);
            return reconnectNodes(head);
        }

        public void cloneNodes(RandomListNode head){
            RandomListNode node = head;
            while(node != null){
                RandomListNode cloned = new RandomListNode(node.label);

                cloned.next = node.next;
                cloned.random = null;

                node.next = cloned;
                node = node.next;
            }
        }

        public void connectRandomNodes(RandomListNode head){
            RandomListNode node = head;
            while(node != null){
                RandomListNode cloned = node.next;
                if(node.random != null){
                    cloned.next = node.random.next;
                }
                node = cloned.next;
            }
        }

        public RandomListNode reconnectNodes(RandomListNode head){
            RandomListNode node = head;
            RandomListNode clonedHead = null;
            RandomListNode clonedNode = null;
            if(node != null){
                clonedHead = clonedNode = node.next;
                node.next = clonedNode.next;
                node = node.next;
            }
            while(node != null){
                clonedNode.next = node.next;
                clonedNode = clonedNode.next;
                node.next = clonedNode.next;
                node = node.next;
            }
            return clonedHead;
        }

    }
}
