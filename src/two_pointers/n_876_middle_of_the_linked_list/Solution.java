package two_pointers.n_876_middle_of_the_linked_list;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int count = 1;
        while(cur.next != null){
            cur = cur.next;
            count += 1;
        }
        cur = head;
        count /= 2;
        while(count > 0){
            cur = cur.next;
            count -= 1;
        }
        return cur;
    }
    public static void main(String[] args){

    }
}