
public class ReverseInteger {

	public static int reverse(int x) {

//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);

		int reverseNumber = 0;

		while (x != 0) {
			int digit = x % 10;
			x = x / 10;
			if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && digit < -8))
				return 0;
			if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && digit > 7))
				return 0;
			reverseNumber = reverseNumber * 10 + digit;
		}
		return reverseNumber;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
	}

}	
