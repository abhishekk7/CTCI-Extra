package QuestionsImpl.C2_Linked_Lists;

import Common.AssortedMethods;
import LinkedListImpl.LinkedListNode;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q3_Delete_Node_Middle {
    public static boolean deleteNode(LinkedListNode n) {
        if (n == null || n.next == null) {
            return false; // Failure
        }
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());
    }
}