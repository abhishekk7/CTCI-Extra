package QuestionsImpl.C2_Linked_Lists;

import Common.AssortedMethods;
import LinkedListImpl.LinkedListNode;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q2_NthToLast {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode node = nthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
        }
    }

    public static LinkedListNode nthToLast(LinkedListNode head, int n) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        for (int i = 0; i < n; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}
