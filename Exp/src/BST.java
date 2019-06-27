import java.util.ArrayList;

public class BST {

	static TreeNode root = new TreeNode(10);

	public static void createBST(int data, TreeNode cur) {
		if (data < cur.data) {
			if (cur.left == null)
				cur.left = new TreeNode(data);
			else
				createBST(data, cur.left);
		} else {

			if (cur.right == null)
				cur.right = new TreeNode(data);
			else
				createBST(data, cur.right);

		}
	}
	
	public static void inOrder(TreeNode cur) {
		if(cur.left != null) {
			inOrder(cur.left);
		}
		System.out.print(cur.data+",");
		if(cur.right != null) {
			inOrder(cur.right);
		}
	}
	
	public static void preOrder(TreeNode cur) {
		if(cur != null)
			System.out.print(cur.data+",");
			if(cur.left != null) {
				preOrder(cur.left);
			}
			
			if(cur.right != null) {
				preOrder(cur.right);
			}
	}
	
	public static void postOrder(TreeNode cur) {
		if(cur.right != null) {
			postOrder(cur.right);
		}
		System.out.print(cur.data+",");
		if(cur.left != null) {
			postOrder(cur.left);
		}
	}
	
	static ArrayList<Integer> path = new ArrayList<>();
	
	public static void depthFirstSearch(TreeNode cur) {
		if(cur != null) {
			path.add(cur.data);
			depthFirstSearch(cur.left);
			depthFirstSearch(cur.right);
			if(cur.left == null && cur.right == null) {
				System.out.print(path);
			}
			path.remove(path.size()-1);
		}
	}
	
	static int level = 0;
	
	public static void breadthFirstSearch(ArrayList<TreeNode> bfsList) {
		if(bfsList.isEmpty())
			return;
		System.out.println("level: "+ ++level);
		ArrayList<TreeNode> temp = new ArrayList<>();
		for(TreeNode cur:bfsList) {
			System.out.print(cur.data+",");
			if(cur.left != null) {
				temp.add(cur.left);
			}
			if(cur.right != null) {
				temp.add(cur.right);
			}
		}
		System.out.println();
		breadthFirstSearch(temp);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 4, 9, 3, 15, 20, 14};
		TreeNode cur = root;
		for (int data : input) {
			createBST(data, cur);
		}
		
		System.out.println("InOrder Traversal: Ascending");
		inOrder(cur);
		System.out.println("\n"+"PreOrder Traversal: ");
		preOrder(cur);
		System.out.println("\n"+"/nPostOrder Traversal: Descending");
		postOrder(cur);
		System.out.println("\n"+"Print all paths depth-first-search");
		depthFirstSearch(cur);
		ArrayList<TreeNode> bfsList = new ArrayList<>();
		bfsList.add(root);
		System.out.println("\n"+"Print all paths breadth-first-search");
		breadthFirstSearch(bfsList);
	}
}
