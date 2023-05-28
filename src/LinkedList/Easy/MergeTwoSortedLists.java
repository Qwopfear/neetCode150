package LinkedList.Easy;

import LinkedList.ListNode;

public class MergeTwoSortedLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        if (l1 == null && l2 == null) return head;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }


        ListNode current = head;
        while (l1 != null || l2 != null) {
            ListNode next;
            if (l1 != null && l2 != null)
                if (l1.val <= l2.val) {
                    next = l1;
                    l1 = l1.next;
                } else {
                    next = l2;
                    l2 = l2.next;
                }
            else {
                if (l1 == null) {
                    next = l2;
                    l2 = l2.next;
                } else  {
                    next = l1;
                    l1 = l1.next;
                }
            }
            current.next = next;
            current = next;
        }
        return head;
    }


    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        System.out.println(mergeTwoSortedLists.solution(
                new ListNode(2, new ListNode(4, new ListNode(6))),
                new ListNode(1, new ListNode(3, new ListNode(5)))

        ));
    }
}
