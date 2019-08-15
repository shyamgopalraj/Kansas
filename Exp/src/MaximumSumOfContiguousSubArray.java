
public class MaximumSumOfContiguousSubArray {
	
	public static void solution(int[] a) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending = 0;
		
		for(int i=0;i<a.length;i++) {
			max_ending = a[i]+max_ending;
			if(max_ending > max_so_far) {
				max_so_far = max_ending;
			}
			
			if(max_ending < 0) {
				max_ending = 0;
			}
		}
		
		System.out.println("Maximum sum of sub array: "+max_so_far);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
		solution(a);
	}

}
