import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsfromaString {
	
	public static String solution(String s) {
		if(s == null)
			return null;
		else {
			Set<Character> set = new HashSet<>();
			set.add('a');
			set.add('e');
			set.add('i');
			set.add('o');
			set.add('u');
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(set.contains(c))
					continue;
				stringBuilder.append(c);
			}
			return stringBuilder.toString();
		}
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "leetcodeisacommunityforcoders";
		String result = solution(input);
		System.out.println("result :"+result);
	}

}
