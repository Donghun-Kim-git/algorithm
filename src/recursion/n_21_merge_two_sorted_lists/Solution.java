package recursion.n_21_merge_two_sorted_lists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list2.val < list1.val){
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
        else{
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }

    public static void main(String[] args){
        Solution sol = new Solution();


    }
}