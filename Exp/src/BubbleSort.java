
public class BubbleSort {

	public static int[] solution(int[] a) {

		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < a.length-1; i++) {
				int j = i + 1;
				if (a[i] > a[j]) {
					swap(i, j, a);
					swapped = true;
				}
			}
		}

		return a;

	}

	private static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 6, 4, 90, 1, -4 };
		a = solution(a);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}
}
