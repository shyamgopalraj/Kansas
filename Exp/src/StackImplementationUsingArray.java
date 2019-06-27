
public class StackImplementationUsingArray {

    static int max = 5;
    int[] a = new int[5];
    static int top = -1;

    public void push(int data) {
        if (++top < max) {
            a[top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("No items to pop");
        } else {
            System.out.println("Popped element: " + a[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack empty.. no element in stack");
        } else {
            System.out.println("Top of the stack element: " + a[top]);
        }
    }

    public static void main(String[] args) {
        StackImplementationUsingArray stackImplementationUsingArray = new StackImplementationUsingArray();
        int[] inputs = new int[] { 1, 2, 3, 4, 5 };
        for (int data : inputs) {
            stackImplementationUsingArray.push(data);
        }
        stackImplementationUsingArray.peek();

        while (top != -1) {
            stackImplementationUsingArray.pop();
        }
    }

}
