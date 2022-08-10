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
class _108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }
    
    private TreeNode sortedArrayToBSTHelper(int[] nums, int s, int e) {
        if(s == e) {
            return new TreeNode(nums[s]);
        }
        
        int m = s + (e - s)/2;
        
        TreeNode root = new TreeNode(nums[m]);
        if(s != m)
            root.left = sortedArrayToBSTHelper(nums, s, m-1); //when m == 0 && s == 0, it will go in StackOverFlow
        root.right = sortedArrayToBSTHelper(nums, m+1, e);
        
        return root;
    }
}