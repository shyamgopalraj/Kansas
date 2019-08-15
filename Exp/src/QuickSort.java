
public class QuickSort {

	public static void solution(int[] a) {
		quicksort(a, 0, a.length-1);
		return;
	}

	private static void quicksort(int[] a, int low, int high) {
		if (low < high) {
			int pivot = (low + high) / 2;
			int index = partition(a, low, high, a[pivot]);
			quicksort(a, low, index - 1);
			quicksort(a, index, high);
		}
		return;
	}

	private static int partition(int[] a, int left, int right, int pivot) {
		while (left <= right) {
			while (a[left] < pivot) {
				left++;
			}
			while (a[right] > pivot) {
				right--;
			}

			if (left <= right) {
				swap(a, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 6,3,1,2,5,8,7,9,15};
		solution(a);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}

}
