package bfs_dfs.n_617_merge_two_binary_trees;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
}
public class Solution {


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode node;
        if(root1 != null && root2 != null){
            node = new TreeNode(root1.val + root2.val, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
        }
        else if (root1 == null){
            return root2;
        }
        else{
            return root1;
        }
        return node;
    }
}