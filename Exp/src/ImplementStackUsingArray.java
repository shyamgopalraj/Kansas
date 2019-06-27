public class ImplementStackUsingArray {

	static int max_size = 5;
	int[] a = new int[max_size];
	int top = -1;

	public void push(int data) {
		if(top+1 < max_size) {
			a[++top] = data;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("No elements in stack to pop");
		} else {
			System.out.println("Element popped: " + a[top]);
			top--;
		}
	}

	public static void main(String[] args) {

		ImplementStackUsingArray implementStackUsingArray = new ImplementStackUsingArray();
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		for (int data : input)
			implementStackUsingArray.push(data);

		int i = 1;
		while (i != max_size + 2) {
			implementStackUsingArray.pop();
			i++;
		}
	}

}
