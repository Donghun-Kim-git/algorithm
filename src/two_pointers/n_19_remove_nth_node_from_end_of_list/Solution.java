package two_pointers.n_19_remove_nth_node_from_end_of_list;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode prev = head;
        int count = 0;
        while(cur.next != null){
            cur = cur.next;
            if(count >= n){
                prev = prev.next;
            }
            else{
                count++;
            }
            System.out.println("cur: " + cur.val + " prev: " + prev.val);
        }
        if(count < n){
            return head.next;
        }
        if(prev.next != null){
            prev.next = prev.next.next;
        }
        else{
            return null;
        }
        return head;
    }
}
