import java.util.HashMap;

public class SingleRowKeyBoard {
	
    public static int calculateTime(String keyboard, String word) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	for(int index = 0; index < keyboard.length();index++){
    		map.put(keyboard.charAt(index), index);
    	}
    	
    	int cur = 0;
    	int result = map.get(word.charAt(cur));
    	for(int next = cur+1; next < word.length();next++){
    		result = result + Math.abs(map.get(word.charAt(cur)) - map.get(word.charAt(next)));
    		cur++;
    	}
    	return result;
    }
    
    public static int betterSolution(String keyboard, String word) {
    	int[] map = new int[26];
    	for(int i = 0;i<keyboard.length();i++) {
    		map[keyboard.charAt(i)-'a'] = i;
    	}
    	int prev = 0;
    	int result = 0;
    	for(int cur=0;cur<word.length();cur++) {
    		char c = word.charAt(cur);
    		int index = c-'a';
    		result = result + Math.abs(map[index]-prev);
    		prev = map[index];
    	}
    	return result;
    }

	public static void main(String[] args) {
		System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
		System.out.println(betterSolution("pqrstuvwxyzabcdefghijklmno", "leetcode"));
	}

}
