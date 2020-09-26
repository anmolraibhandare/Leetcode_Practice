/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        //find length of linked list 
        int length = 0;
        ListNode temp = head;
        
        while (temp.next != null){
            length ++;
            temp = temp.next;
        }
        System.out.println(length);
        
        //find middle element 
        int middle;
        if (length % 2 == 0){
            middle = length/2; 
        } else {
            middle = length/2 + 1;
        }
        
        System.out.println(middle);
        
        temp = head;
        
        //iterate and find middle
        while(middle != 0){
            temp = temp.next;
            middle--;
        }
        System.out.println(temp.val);
        return temp; 
    }
}
