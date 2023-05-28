package LinkedList.Medium;

import LinkedList.ListNode;

public class ReorderList {

     /***
     *
     [1,2,3,4,5,6,7,8,9,10] -> длинна n
     L0 -> Ln -> L1 -> ln - 1 -> L2 -> Ln - 2 -> L3 -> Ln - 3
     [1,10,2,9,3,8,4,7,5,6]

     ***/

    public ListNode solution(ListNode head) {
        ListNode next = createPair(head);
        if (next == null) return null;
        ListNode answer = new ListNode(next.val, next.next);
        ListNode current = answer.next;
        do {
            next = createPair(head);
            current.next = next;
            while (current.next != null) {
                current = current.next;
            }
        } while (next != null);

        System.out.println(answer);
        return answer;
    }

    private ListNode createPair(ListNode head) {
        ListNode current = head;

        ListNode second = head.next;
        ListNode first = new ListNode(head.val);

        if (second == null) return null;
        while (second.next != null) {
            second = second.next;
        }
        first.next = second;
         // Записываю и убираю последний элемент
        while (current.next != null) {
            if (current.next.next == null) {
                current.next = null;
            } else {
                current = current.next;

            }
        }

        // Убираю первый елемент
        if (head.next != null) {
            head.val = head.next.val;
            head.next = head.next.next;
        }
        return first;
    }

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode node = reorderList.solution(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))));

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }


    }

}
