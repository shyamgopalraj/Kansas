import java.util.Scanner;

public class CheckIntegerIsPalindrome {
	
	public static boolean solution(int input) {
		int number = input;
		int temp = 0;
		if(number < 0) {
			number = number * -1;
		}
		while(number!= 0) {
			int rem = number%10;
			temp = temp*10+rem;
			number = number/10;
		}
		
		if(temp == input)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		if(solution(input))
			System.out.println("Yes its a palindrome");
		else
			System.out.println("its not a palindrome");
	}

}
