import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class _101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return isSymmetric(root.left, root.right);
	}
	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return (true);
		if (left != null && right != null && left.val == right.val)
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		return false;
	}
}