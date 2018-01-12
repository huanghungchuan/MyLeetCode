
public class _100SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		//Version 1
		if (p == null || q == null)
			return (p == q);
		if(p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

		//Version 2
		if (p == null && q == null)
			return (true);
		if (p != null && q != null && p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
	}
}
