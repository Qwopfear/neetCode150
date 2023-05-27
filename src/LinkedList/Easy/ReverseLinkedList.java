package LinkedList.Easy;

import LinkedList.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode reversed = reverseLinkedList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))));
        while (reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }

    }
}
