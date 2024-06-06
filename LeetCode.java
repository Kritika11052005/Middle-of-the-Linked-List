public class LeetCode {
    
 // Definition for singly-linked list.
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode Turtle=head;
        ListNode Hare=head;
        while(Hare!=null && Hare.next!=null){
            Turtle=Turtle.next;
            Hare=Hare.next.next;
        }
        return Turtle;
    }
}
}
