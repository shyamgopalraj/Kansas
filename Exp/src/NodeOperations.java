
public class NodeOperations {

	Node head = null;

	public void addNode(int data) {
		if (head == null)
			head = new Node(data);
		else {
			Node node = head;
			while (node.next != null)
				node = node.next;
			node.next = new Node(data);
		}
	}

	public void displayContent() {
		if (head == null)
			System.out.println("Empty Head.. No data");
		else {
			Node node = head;
			System.out.println("Node Contents: ");
			while (node != null) {
				System.out.print(node.data + ",");
				node = node.next;
			}
		}
		System.out.println();
	}

	public void findAndDestroy(int culprit) {
		Node prev = head;
		Node cur = head;
		if (head == null) {
			System.out.println("Empty Head.. No data");
		} else {
			if (cur.data == culprit) {
				System.out.println("Culprit is head .. Setting new head");
				head = cur.next;
			} else {
				while (cur != null && cur.data != culprit) {
					prev = cur;
					cur = cur.next;
				}

				if (cur == null) {
					System.out.println("culprit not in the list");
				} else {
					System.out.println("Culprit found and destroyed ");
					prev.next = cur.next;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] datainputs = new int[] { 1, 2, 3, 4 };
		NodeOperations nodeOperations = new NodeOperations();
		for (int data : datainputs)
			nodeOperations.addNode(data);
		nodeOperations.displayContent();
		nodeOperations.findAndDestroy(1);
		nodeOperations.displayContent();
	}

}
