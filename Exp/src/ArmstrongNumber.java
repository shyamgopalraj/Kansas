
public class ArmstrongNumber {
	
	public static boolean isArmstrong(int N) {
		int pow = Integer.toString(N).length();
		int number = N;
		int sum = 0;
		while(number > 0) {
			int rem = number%10;
			number = number/10;
			sum = (int) (sum + Math.pow(rem, pow));
		}
		return (sum == N);
	}
	

	public static void main(String[] args) {
		if(isArmstrong(2)) {
			System.out.println("An Armstrong number");
		}
		else
			System.out.println("Not an Armstrong number");
	}

}
