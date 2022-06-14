class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next1;
        if(head == null || head.next == null)return head;
        while(curr != null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;   
        }
        return prev;
        
    }
}
