// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) return copyList(l2);
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = copyList(l2);
        return l1;
    }

    private static ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        head = head.next;
        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }
        return newHead;
    }
}