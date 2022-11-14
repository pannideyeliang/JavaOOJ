package NKString;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        Solution solution = new Solution();
        solution.bl(l1);
        solution.reverseBetween(l1, 2, 4);
        solution.bl(l1);

    }

    /**
     * @param head ListNode类
     * @param m    int整型
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> listNodes = new Stack<>();
        int cur = 1;
        ListNode temp = head;
        while (cur < m - 1) {
            temp = temp.next;
            cur++;
        }
        ListNode pretmp = temp;
        pretmp.next = null;
        while (cur < n + 1) {
            listNodes.push(temp);
            temp = temp.next;
            cur++;
        }
        ListNode thead = listNodes.pop();
        ListNode tnode = thead;
        while (!listNodes.isEmpty()) {
            tnode.next = listNodes.pop();
            tnode = tnode.next;
        }
        tnode.next = temp;
        pretmp.next = thead;
        return head;
    }

    public void bl(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public ListNode(int val) {
        this.val = val;
    }
}
