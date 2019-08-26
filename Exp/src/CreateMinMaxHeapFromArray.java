
public class CreateMinMaxHeapFromArray {

	public static void minHeap(int[] a, int parentIndex) {
		int minimumIndex = parentIndex;
		int leftchildIndex = 2 * parentIndex + 1;
		if (leftchildIndex < a.length && a[leftchildIndex] < a[minimumIndex]) {
			minimumIndex = leftchildIndex;
			int rightchildIndex = 2 * parentIndex + 2;
			if (rightchildIndex < a.length && a[rightchildIndex] < a[minimumIndex])
				minimumIndex = rightchildIndex;
			if (minimumIndex != parentIndex) {
				swap(a, minimumIndex, parentIndex);
				minHeap(a, minimumIndex);
			}
		}
	}

	public static void maxHeap(int[] a, int parentIndex) {
		int maximumIndex = parentIndex;
		int leftchildIndex = 2 * parentIndex + 1;
		if (leftchildIndex < a.length && a[leftchildIndex] > a[maximumIndex]) {
			maximumIndex = leftchildIndex;
			int rightchildIndex = 2 * parentIndex + 2;
			if (rightchildIndex < a.length && a[rightchildIndex] > a[maximumIndex])
				maximumIndex = rightchildIndex;
			if (maximumIndex != parentIndex) {
				swap(a, maximumIndex, parentIndex);
				maxHeap(a, maximumIndex);
			}
		}
	}

	public static void minHeapSolution(int[] a) {
		for (int parentIndex = a.length / 2; parentIndex >= 0; parentIndex--) {
			minHeap(a, parentIndex);
		}
	}

	public static void maxHeapSolution(int[] a) {
		for (int parentIndex = a.length / 2; parentIndex >= 0; parentIndex--) {
			maxHeap(a, parentIndex);
		}
	}

	private static void swap(int[] a, int leftchildIndex, int parentIndex) {
		int temp = a[leftchildIndex];
		a[leftchildIndex] = a[parentIndex];
		a[parentIndex] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 5, 10, 8, 2, 1 };
		minHeapSolution(a);
		System.out.print("MinHeap: ");
		for (int key : a)
			System.out.print(key + ",");
		maxHeapSolution(a);
		System.out.print("\n" + "MaxHeap: ");
		for (int key : a)
			System.out.print(key + ",");
	}
}
