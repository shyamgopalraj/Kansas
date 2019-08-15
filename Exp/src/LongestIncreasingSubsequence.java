
public class LongestIncreasingSubsequence {
	
	public static int solution(int[] a) {
		int maxlengthOfIncreasingSubsequence = 0;
		
		int max_sum = 0;
		for(int i=0;i<a.length;i++) {
			int sum = a[i];
			int lengthOfIncreasingSubsequence = 1;
			int previous = a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j] > previous) {
					sum = sum + a[j];
					previous = a[j];
					lengthOfIncreasingSubsequence++;
				}
			}
			if(sum > max_sum) {
				max_sum = sum;
				if(lengthOfIncreasingSubsequence > maxlengthOfIncreasingSubsequence) {
					maxlengthOfIncreasingSubsequence = lengthOfIncreasingSubsequence;
				}
			}
		}
		return maxlengthOfIncreasingSubsequence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,9,2,5,3,7,101,18};
		int result = solution(a);
		System.out.println("Length of Longest Increasing Subsequence: "+result);
	}

}
