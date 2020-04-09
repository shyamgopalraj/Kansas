import java.util.Arrays;

public class SumOfDigitsInTheMinimumNumber {
	
    public static int sumOfDigits(int[] A) {

    	Arrays.sort(A);
    	int leastNumber = A[0];
    	int sumOfdigit = 0;
    	while(leastNumber> 0) {
    		int digit = leastNumber%10;
    		sumOfdigit+=digit;
    		leastNumber = leastNumber/10;
    	}
    	
    	if(sumOfdigit%2 == 0) {
    		return 1;
    	}
    	return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(new int[] {34,23,1,24,75,33,54,8}));
	}

}
