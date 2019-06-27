
public class ReverseLinkedList {
	
	public static Node createLinkedList(int data, Node head) {
		if(head == null) 
			head = new Node(data);
		else {
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node(data);
		}
			return head;
	}
	
	public static void display(Node cur) {
		while(cur != null) {
			System.out.print(cur.data);
			cur = cur.next; 
		}
	}
	
	public static Node reverse(Node head) {
		if(head != null) {
			Node prev = head;
			while(prev.next != null) {
				Node cur = prev.next;
				prev.next = cur.next;
				cur.next = head;
				head = cur;
			}
		}
		return head;
	}


	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4};
		Node head  = null;
		for(int i:input) {
			head = createLinkedList(i,head);
		}
		
		display(head);
		head=reverse(head);
		System.out.println("\n"+"Reversed LinkedList: ");
		display(head);
	}
}
