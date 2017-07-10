package QuestionsImpl.C2_Linked_Lists;

import LinkedListImpl.LinkedListNode;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q1_Remove_Dup {
    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 4, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDup(head);
        System.out.println(head.printForward());
    }

    public static LinkedListNode deleteDup(LinkedListNode head) {
        LinkedListNode curr = head;
        while (curr != null) {
            LinkedListNode runner = curr;
            while (runner.next != null) {
                if (runner.next.data == curr.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}
