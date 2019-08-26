
public class RangeSumofBST {

	int sum = 0;

	public int rangeSumBST(TreeNode root, int L, int R) {

		if (root != null) {

			if (root.data >= L && root.data <= R) {
				sum = sum + root.data;
			}

			if (root.left != null) {
				rangeSumBST(root.left, L, R);
			}

			if (root.right != null) {
				rangeSumBST(root.right, L, R);
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
