
public class DefangingIPAddress {
	
	public static String solution(String s) {
		if(s==null)
			return null;
		else {
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(c == '.') {
					stringBuilder.append("[.]");
				}
				else
					stringBuilder.append(c);
				
			}
			return stringBuilder.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1.1.1.1";
		String result = solution(input);
		System.out.println("Result: "+result);
	}

}
