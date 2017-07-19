package StackAndQueueImpl;

import Common.AssortedMethods;

import java.util.Stack;

/**
 * Created by Abhishek Kumar on 7/19/2017.
 */

public class TestImpl {
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();
        MyQueue<Integer> mq = new MyQueue<>();

        System.out.println("Stack : isEmpty: " + ms.isEmpty());
        System.out.println("Queue : isEmpty: " + mq.isEmpty());
        for (int i = 0; i < 10; i++) {
            //int val = AssortedMethods.randomIntInRange(11,99);
            ms.push(i);
            mq.add(i);
        }
        System.out.println("Stack : peek: " + ms.peek());
        System.out.println("Queue : peek: " + mq.peek());
        System.out.println("=========Stack=========");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + ": " + ms.pop());
        }
        System.out.println("=========Queue=========");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + ": " + mq.remove());
        }
        System.out.println("Stack : isEmpty: " + ms.isEmpty());
        System.out.println("Queue : isEmpty: " + mq.isEmpty());


    }
}
