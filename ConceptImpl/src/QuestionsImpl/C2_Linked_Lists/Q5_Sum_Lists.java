package QuestionsImpl.C2_Linked_Lists;

import Common.AssortedMethods;
import LinkedListImpl.LinkedListNode;

/**
 * Created by Abhishek Kumar on 7/14/2017.
 */
public class Q5_Sum_Lists {
    public static void main(String[] args) {

        LinkedListNode n1 = AssortedMethods.createLinkedListFromArray(new int[]{9, 9, 9});
        LinkedListNode n2 = AssortedMethods.createLinkedListFromArray(new int[]{9, 9, 9, 9});
        System.out.println(sumReverse(n1, n2).printForward());
    }

    public static LinkedListNode sumReverse(LinkedListNode n1, LinkedListNode n2) {
        if (n1 == null) {
            return n2;
        }

        if (n2 == null) {
            return n1;
        }

        int carry = 0;
        LinkedListNode result = null;
        LinkedListNode runner = null;
        LinkedListNode prev = null;
        while (n1 != null || n2 != null) {
            int sum = (n1 != null ? n1.data : 0) + (n2 != null ? n2.data : 0) + carry;
            carry = sum / 10;
            sum = sum % 10;
            runner = new LinkedListNode(sum);
            if (result == null) {
                result = runner;
            } else {
                prev.next = runner;
            }
            prev = runner;
            if (n1 != null)
                n1 = n1.next;
            if (n2 != null)
                n2 = n2.next;
        }
        if (carry > 0)
            runner.next = new LinkedListNode(carry);

        return result;
    }
}
