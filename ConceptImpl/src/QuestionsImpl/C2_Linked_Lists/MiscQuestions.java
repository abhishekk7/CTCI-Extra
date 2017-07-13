package QuestionsImpl.C2_Linked_Lists;

import Common.AssortedMethods;
import LinkedListImpl.LinkedListNode;
import sun.awt.image.ImageWatched;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 * <p>
 * deleteNode(LinkedListNode node, LinkedListNode head)
 */
public class MiscQuestions {
    public static void main(String[] args) {

        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 100);
        LinkedListNode node = head.next.next.next.next.next;
        System.out.println("Before: " + head.printForward());
        System.out.println("Node : " + node.data);
        System.out.println("After: " + deleteNode(node, head).printForward());
    }

    public static LinkedListNode deleteNode(LinkedListNode node, LinkedListNode head) {

        if (head == null || node == null) {
            return head;
        }

        if (head == node) {
            head = head.next;
            return head;
        }
        LinkedListNode curr = head;
        while (curr.next != null) {
            if (curr.next == node) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }
}
