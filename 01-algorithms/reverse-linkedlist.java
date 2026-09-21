class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class Solution {
   public ListNode reverseList(ListNode head) {
     if (head == null || head.next == null) return head;
     ListNode cur = head, prev = null, next = null;
     while(cur != null) {
       next = cur.next;
       prev = cur;
       cur.next = prev;
       cur = next;
     }
     return prev;  
   }
}
