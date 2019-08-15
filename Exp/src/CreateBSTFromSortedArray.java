
public class CreateBSTFromSortedArray {

	private static TreeNode IterativeSolution(int low, int high, int[] a) {
		int mid = (low + high) / 2;
		TreeNode head = new TreeNode(a[mid]);
		TreeNode cur = head;
		for (int i = mid - 1; i >= low; i--) {
			cur = insert(a[i], cur, a[mid]);
			cur = cur.left;
		}
		cur = head;
		for (int i = mid + 1; i < high; i++) {
			cur = insert(a[i], cur, a[mid]);
			cur = cur.right;
		}
		return head;
	}

	private static TreeNode insert(int data, TreeNode node, int head) {
		if (data > head) {
			node.right = new TreeNode(data);
		} else {
			node.left = new TreeNode(data);
		}
		return node;
	}


	private static TreeNode recursiveSolution(int low, int high, int[] a) {

		if (low <= high) {

			int mid = (low + high) / 2;

			TreeNode head = new TreeNode(a[mid]);

			head.left = recursiveSolution(low, mid - 1, a);

			head.right = recursiveSolution(mid + 1, high, a);
			
			return head;

		}
		else
			return null;
	}

	public static void inOrder(TreeNode cur) {
		if (cur != null) {
			if (cur.left != null) {
				inOrder(cur.left);
			}

			System.out.print(cur.data + ",");

			if (cur.right != null) {
				inOrder(cur.right);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		TreeNode head = null;
//		head = IterativeSolution(0, a.length, a);
		head = recursiveSolution(0, a.length-1, a);
		System.out.println("InOrder traversal: ");
		inOrder(head);
	}

}
