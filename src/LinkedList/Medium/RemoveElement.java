package LinkedList.Medium;

import LinkedList.ListNode;

public class RemoveElement {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;
        // Посчитать длинну
        while (current.next != null) {
            current = current.next;
            length++;
        }


        int preIndex = length - n;
        int postIndex = preIndex + 2;

        // Зписываю в переменную пост узлы после элемента
        ListNode post;
        current = head;
        while ( postIndex > 0 ) {
            current = current.next;
            postIndex--;
        }
        post = current;

        // Если preIndex <= 0 значит удаляется первый элемент, а значит post содержит все что надо
        if (preIndex <= 0) return post;

        current = head;

        // Дохожу до узла перед удаляемым и меняю ссылку на первый Post узел
        while ( preIndex > 0 ) {
            current = current.next;
            preIndex--;
        }
        current.next = post;




        return head;
    }

    public static void main(String[] args) {
        ListNode node = removeNthFromEnd((
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6))))))), 6);
    }
}
