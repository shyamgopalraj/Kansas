import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	
	public static char solution(String s) {
		Character result = null;
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				int count = map.get(c);
				count++;
				map.put(c, count);
			}
			else
				map.put(c, 1);
			}
		
		for(int i=0;i<s.length();i++) {
			int count = map.get(s.charAt(i));
			if(count == 1) {
				result = s.charAt(i);
				break;
			}
		}
		
		return result.charValue();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("sssqqwdwwedd"));
	}

}
