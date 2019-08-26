
public class ToLowerCase {
	
	public static String toLowerCase(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				stringBuilder.setCharAt(i, (char)(c+32));
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLowerCase("Hello"));
	}

}
