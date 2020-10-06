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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Approach - 1 - recursive (convert to array)
class Solution {
    
    private List<Integer> values;
    
    public Solution(){
        this.values = new ArrayList<Integer>();
    }
    
    private void mapListToValues(ListNode head){
        while(head != null){
            this.values.add(head.val);
            head = head.next;
        }
    }
    
    private TreeNode convertToBST(int left, int right){
        if(left > right) return null;
        
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(this.values.get(mid));
        
        if(left == right) return node;
        
        node.left = convertToBST(left, mid-1);
        node.right = convertToBST(mid+1, right);
        return node;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        this.mapListToValues(head);
        return convertToBST(0, this.values.size() - 1);
    }
    
}
