
public class CyclicNodeList {

	Node head = null;

	public Node createList(int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node(data);
			return cur.next;
		}
	}

	public void display() {
		Node cur = head;
		System.out.println("List contents");
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}

	public void createCyclicList() {
		int[] inputData = new int[] { 1, 2, 3, 4, 5 };
		Node cur = null;
		for (int data : inputData) {
			cur = createList(data);
		}
		cur.next = head.next;
	}

	public boolean checkCyclic() {

		if (head == null) {
			System.out.println("Head null");
			return false;
		}

		Node slow = head;
		Node fast = head;

		while (slow.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;

			if (fast.next != null) {
				fast = fast.next;
				if (fast.data == slow.data) {
					System.out.println("Cyclic.. starts at node: " + slow.data);
					return true;
				}
			} else
				break;
		}

		System.out.println("Acyclic");
		return false;

	}

	public static void main(String[] args) {
		CyclicNodeList cyclicNodeList = new CyclicNodeList();
		cyclicNodeList.createCyclicList();
//		cyclicNodeList.display();
		if (cyclicNodeList.checkCyclic())
			System.out.println("Cyclic");
		else
			System.out.println("Acyclic");
	}

}
