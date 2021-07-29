package D20210730;

import D20210616.Q0002;

import java.util.Stack;

/**
 * 234. Palindrome Linked List
 */
public class Q0234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> stack = new Stack<>();

        ListNode curr = head;
        while(curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        while(head != null && !stack.isEmpty()) {
            if(head.val != stack.pop().val) return false;
            head = head.next;
        }

        return true;
    }
}
