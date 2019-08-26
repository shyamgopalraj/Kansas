import java.util.HashSet;

public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {
	
		if (J == null || S == null) {
			return 0;
		}
		else {
			int count = 0;
			HashSet<Character> set = new HashSet<>();
			for(int i=0;i<J.length();i++) {
				set.add(J.charAt(i));
			}
			
			for(int i=0;i<S.length();i++) {
				char c = S.charAt(i);
				if(set.contains(c)) {
					count++;
				}
			}
			
			return count;
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";
		int result = numJewelsInStones(J, S);
		System.out.println("Jewel Count: "+result);
	}

}
