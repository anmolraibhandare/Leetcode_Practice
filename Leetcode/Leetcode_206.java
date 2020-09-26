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
    public ListNode reverseList(ListNode head) {
        
        if (head == null) {
            return null;
        } 
            
            //find length of ll

            int length = 0;
            int index = 0;
            ListNode temp = head;

            while(temp.next != null){
                temp = temp.next;
                length++;
            }
            System.out.println(length);
        
            int templength = length;

            while (index != length){
                temp = head;
                while (templength != index){
                    int x = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = x;  
                    templength--;
                    temp = temp.next;
                } 
                index ++;
               templength = length;
            }

         return head; 
    }
}
