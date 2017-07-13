package QuestionsImpl.C2_Linked_Lists;

import Common.AssortedMethods;
import LinkedListImpl.LinkedListNode;

/**
 * Created by Abhishek Kumar on 7/13/2017.
 */
public class Q4_Partition {

    public static void main(String[] args) {

        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 5);
        System.out.println("Before : " + head.printForward());
        int partition = 3;
        System.out.println("Partition : " + partition);
        System.out.println("After : " + partition(head, partition).printForward());

    }

    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode beforePartition = null;
        LinkedListNode afterPartition = null;

        while (node != null) {
            LinkedListNode next = node.next;
            /* if less add to beforePartition linkedList */
            if (node.data < x) {
                node.next = beforePartition;
                beforePartition = node;
            } else { /* add to afterPartition Linked List */
                node.next = afterPartition;
                afterPartition = node;
            }
            node = next;
        }

        /* nothing in the values before the value so return only afterPartition*/
        if (beforePartition.next == null) {
            return afterPartition;
        }

        LinkedListNode head = beforePartition;
        /* traverse to the end of beforePartition */
        while (beforePartition.next != null) {
            beforePartition = beforePartition.next;
        }
        /* add afterPartition at the end of beforePartition*/
        beforePartition.next = afterPartition;
        return head;
    }

}
