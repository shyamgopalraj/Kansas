
public class StackImplementationUsingLinkedList {

    static Node head = null;

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayStack() {
        if (head == null) {
            System.out.println("No contents in the stack");
        } else {
            Node cur = head;
            while (cur != null) {
                System.out.println("Content of stack: " + cur.data);
                cur = cur.next;
            }
        }
    }

    public void pop() {
        Node cur = head;
        if (cur != null) {
            System.out.println("Popped element: " + cur.data);
            head = cur.next;
        }
        displayStack();
    }

    public static void main(String[] args) {
        StackImplementationUsingLinkedList stackImplementationUsingLinkedList = new StackImplementationUsingLinkedList();
        int[] inputs = new int[] { 1, 2, 3, 4, 5 };
        for (int data : inputs) {
            stackImplementationUsingLinkedList.push(data);
        }

        stackImplementationUsingLinkedList.displayStack();

        while (head != null) {
            stackImplementationUsingLinkedList.pop();
        }
    }

}
