import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public static int uniqueMorseRepresentations(String[] words) {
		String[] map = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		
		HashSet<String> set = new HashSet<>();
		
		for(String word: words) {
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=0;i<word.length();i++) {
				char c = word.charAt(i);
				int index = c-'a';
				stringBuilder.append(map[index]);
			}
			String morseCode = stringBuilder.toString();
			if(!set.contains(morseCode)) 
				set.add(morseCode);
			}
		
		return set.size();

	}

	public static void main(String[] args) {
		System.out.println(uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
	}

}
